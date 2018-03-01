<template>
  <q-list :link="model.config.link" v-if="model.slots">
    <component :is="component.component" v-for="component in model.slots.items" :model="component" :key="component" />
  </q-list>
</template>

<script>
import HbListItem from 'components/HbListItem.vue'
import HbCollapsible from 'components/HbCollapsible.vue'

export default {
  components: {
    HbListItem,
    HbCollapsible
  },
  props: ['model'],
  data () {
    return {
    }
  }
}
</script>
