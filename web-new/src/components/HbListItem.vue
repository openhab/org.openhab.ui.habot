<template>
<q-item separator tag="label">
  <q-item-main>
    <q-item-tile label>{{model.config.label}}</q-item-tile>
    <q-item-tile class="item-subtitle" sublabel>{{model.config.item}}</q-item-tile>
  </q-item-main>
  <q-item-side right>
    <big class="big-value" v-if="model.config.state">{{model.config.state}}</big>
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
    }
  }
}
</script>
