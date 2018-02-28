<template>
<q-item separator tag="label">
  <q-item-main>
    <q-item-tile label>{{label}}</q-item-tile>
    <q-item-tile v-if="model.config.item" class="item-subtitle" sublabel>{{model.config.item}}</q-item-tile>
  </q-item-main>
  <q-item-side right>
    <big class="big-value" v-if="model.config.state">{{state}}</big>
    <hb-switch :model="model.config" v-if="model.config.control === 'Switch'"></hb-switch>
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

export default {
  props: ['model'],
  components: {
    HbSwitch
  },
  data () {
    return {
      config: this.model.config
    }
  },
  created () {
  },
  asyncComputed: {
    label: {
      get () {
        return this.$expr(this.model.config.label)
      }
    },
    state: {
      get () {
        return this.$expr(this.model.config.state)
      }
    }
  }
}
</script>
