<template>
<q-tabs v-if="model.slots && model.slots.tabs && model.slots.tabpanes"
        :inverted="model.config.inverted" :align="model.config.align"
        :color="model.config.color" :glossy="model.config.glossy" :no-pane-border="model.config.noborder"
        :position="model.config.position">
  <q-tab v-for="(component, idx) in model.slots.tabs" :key="component" :name="component.config.name" :label="component.config.label" :default="idx === 0" slot="title" />
  <q-tab-pane v-for="component in model.slots.tabpanes" :key="component" :name="component.config.name" keep-alive>
    <component :is="component.component" v-for="(component, idx) in component.slots.main" :model="component" :key="component" :name="'tabpane-' + idx" />
  </q-tab-pane>
</q-tabs>
</template>

<style lang="stylus" scoped>
</style>

<script>
import HbSwitch from 'components/HbSwitch.vue'
import HbSlider from 'components/HbSlider.vue'
import HbKnob from 'components/HbKnob.vue'
import HbList from 'components/HbList.vue'
import HbCollapsible from 'components/HbCollapsible.vue'

export default {
  name: 'HbTabs',
  props: ['model'],
  components: {
    HbSwitch,
    HbSlider,
    HbKnob,
    HbList,
    HbCollapsible
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
    sublabel: {
      get () {
        return this.$expr(this.model.config.sublabel)
      }
    }
  }
}
</script>
