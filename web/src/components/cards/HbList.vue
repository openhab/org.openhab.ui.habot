<template>
  <q-list>
    <hb-list-item v-for="component in model.slots.main.components" :model="component" :key="component" />
  </q-list>
</template>

<script>
import {
  QList
} from 'quasar'

import HbListItem from '@/cards/HbListItem.vue'

export default {
  components: {
    QList,
    HbListItem
  },
  props: ['model'],
  data () {
    return {
    }
  }
}
</script>

