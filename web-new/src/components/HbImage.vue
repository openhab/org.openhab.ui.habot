<template>
  <div :style="{'width': '100%', 'padding-bottom': paddingBottom}" :class="{'highlight-and-fade': this.model.highlight}">
    <div v-if="error">{{error}}</div>
    <img v-if="!error" :src="imageDataUrl" style="position: absolute; top: 0; width: 100%">
    <q-inner-loading :visible="working" color="primary"></q-inner-loading>
  </div>
</template>

<script>
export default {
  component: 'HbChartImage',
  props: ['model'],
  data () {
    return {
      working: false,
      imageUrl: null,
      error: null
    }
  },
  created () {
    this.retrieveImageUrl().then((url) => {
      this.imageUrl = url
    }).catch((err) => {
      this.imageUrl = null
      this.error = err
      this.working = false
    })
  },
  methods: {
    findImageUrlInSitemapNode (node, itemName) {
      for (let widget of node.widgets) {
        if (widget.type === 'Image' && widget.item && widget.item.name === itemName) {
          if (widget.url && widget.url.indexOf('/proxy')) {
            return widget.url.substring(widget.url.indexOf('/proxy'))
          }
        }
        if (widget.linkedPage) {
          let pageret = this.findImageUrlInSitemapNode(widget.linkedPage, itemName)
          if (pageret) return pageret
        }
        let leafret = this.findImageUrlInSitemapNode(widget, itemName)
        if (leafret) return leafret
      }

      return null
    },
    retrieveImageUrl () {
      if (!this.item) return Promise.resolve(null)
      if (this.item.tags && this.item.tags.find(t => t.indexOf('habot:image:sitemap:') === 0)) {
        let sitemapName = this.item.tags.find(t => t.indexOf('habot:image:sitemap:') === 0).split(':')[3]
        if (!sitemapName) {
          this.error = 'Cannot retrieve sitemap name from tag'
          return Promise.reject(new Error('Cannot retrieve sitemap name from tag'))
        }

        return this.$http.get('/rest/sitemaps/' + sitemapName).then((resp) => {
          let url = this.findImageUrlInSitemapNode(resp.data.homepage, this.item.name)

          if (!url) {
            return Promise.reject(new Error('Cannot find item ' + this.item.name + ' in sitemap ' + sitemapName))
          } else {
            return Promise.resolve(url + '&_t=' + (new Date().toISOString()))
          }
        }).catch((err) => {
          return Promise.reject(new Error('Cannot retrieve sitemap: ' + err))
        })
      } else {
        return Promise.reject(new Error('Cannot find tag habot:image:sitemap:<sitemapname> on item'))
      }
    }
  },
  watch: {
    itemState () {
      this.retrieveImageUrl().then((url) => {
        this.imageUrl = url
      }).catch((err) => {
        this.imageUrl = null
        this.error = err
        this.working = false
      })
    }
  },
  computed: {
    item () {
      return this.$store.getters['items/name'](this.model.config.item)
    },
    itemState () {
      return this.$store.getters['items/itemState'](this.model.config.item)
    },
    paddingBottom () {
      switch (this.model.config.aspectRatio) {
        case '1:1': return (100) + '%'
        case '3:2': return (100 / (3 / 2)) + '%'
        case '16:9': return (100 / (16 / 9)) + '%'
        case '2:1': return (100 / 2) + '%'
        default: return (100 / (4 / 3)) + '%'
      }
    }
  },
  asyncComputed: {
    imageDataUrl: {
      get () {
        this.working = true
        return new Promise((resolve, reject) => {
          if (!this.imageUrl) return null
          let request = this.$http.get(this.imageUrl, { responseType: 'blob' })
          request.then((resp) => {
            let reader = new FileReader()
            reader.readAsDataURL(resp.data)
            reader.onload = () => {
              this.working = false
              return resolve(reader.result)
            }
          })
          request.catch((err) => {
            console.log(new Error(err))
            this.working = false
          })
        })
      }
    }
  }
}
</script>
