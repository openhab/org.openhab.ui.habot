<template>
  <q-list :link="model.config.link" v-if="model.slots">
    <component :is="component.component" v-for="(component, idx) in model.slots.items" :model="component"  :key="'list-item-' + idx" />
  </q-list>
</template>

<script>

export default {
  name: 'HbList',
  props: ['model'],
  data () {
    return {
      link: this.model.link
    }
  },
  beforeCreate () {
    this.$options.components.HbCollapsible = require('./HbCollapsible.vue').default
    this.$options.components.HbListItem = require('./HbListItem.vue').default
  }
}
</script>
