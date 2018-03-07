<template>
  <div style="width: 100%; padding-bottom: 50%">
    <img :src="imageUrl" style="position: absolute; top: 0; width: 100%">
    <q-inner-loading :visible="working" color="primary"></q-inner-loading>
  </div>
</template>

<script>
export default {
  component: 'HbChartImage',
  props: ['model'],
  data () {
    return {
      working: false
    }
  },
  asyncComputed: {
    imageUrl: {
      get () {
        this.working = true
        return new Promise((resolve, reject) => {
          let request = this.$http.get('/chart?items=' + this.model.config.items.join(',') + '&period=' + this.model.config.period, { responseType: 'blob' })
          request.then((resp) => {
            let reader = new FileReader()
            reader.readAsDataURL(resp.data)
            reader.onload = () => {
              this.working = false
              return resolve(reader.result)
            }
          })
        })
      }
    }
  }
}
</script>
