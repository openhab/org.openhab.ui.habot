<template>
<q-item separator :tag="tag">
  <q-item-main>
    <q-item-tile label>{{label}}</q-item-tile>
    <q-item-tile v-if="model.config.item" class="item-subtitle" sublabel>{{model.config.item}}</q-item-tile>
    <hb-slider :model="{ config: { item: item.name } }" v-if="item && item.type === 'Dimmer'"></hb-slider>
  </q-item-main>
  <q-item-side right>
    <hb-switch :model="{ config: { item: item.name } }" v-if="item && (item.type === 'Switch' || item.type === 'Dimmer')"></hb-switch>
    <big v-else class="big-value">{{state}}</big>
  </q-item-side>
</q-item>
</template>

<style lang="stylus" scoped>
.item-subtitle
  font-size 14px !important
  color rgba(0,0,0,0.4) !important
.big-value
  font-weight 300
  color black
  font-size 150%
</style>

<script>
import HbSwitch from 'components/HbSwitch.vue'
import HbSlider from 'components/HbSlider.vue'

export default {
  props: ['model', 'link'],
  components: {
    HbSwitch,
    HbSlider
  },
  data () {
    return {
      config: this.model.config
    }
  },
  created () {
  },
  computed: {
    tag: {
      get () {
        return (this.link && this.item && this.item.type === 'Switch' ? 'label' : 'div')
      }
    },
    state: {
      get () {
        if (this.model.config.item) {
          return this.$store.getters['items/itemState'](this.model.config.item)
        }
      }
    },
    item: {
      get () {
        if (this.model.config.item) {
          return this.$store.getters['items/name'](this.model.config.item)
        }
      }
    }
  },
  asyncComputed: {
    label: {
      get () {
        return this.$expr(this.model.config.label)
      }
    }
  }
}
</script>
