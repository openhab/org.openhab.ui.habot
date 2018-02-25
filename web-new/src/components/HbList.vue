<template>
  <q-list :link="model.config.link">
    <hb-list-item v-for="component in model.slots.items" :model="component" :key="component" />
  </q-list>
</template>

<script>
import HbListItem from 'components/HbListItem.vue'

export default {
  components: {
    HbListItem
  },
  props: ['model'],
  data () {
    return {
    }
  }
}
</script>
