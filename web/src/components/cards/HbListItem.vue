<template>
<q-item separator>
  <q-item-main>
    <q-item-tile label>{{model.config.label}}</q-item-tile>
    <q-item-tile class="q-card-subtitle">{{model.config.item}}</q-item-tile>
  </q-item-main>
  <q-item-side right>
    <big class="big-value">{{model.config.state}}</big>
  </q-item-side>
</q-item>
</template>

<script>
import {
  QListHeader,
  QItem,
  QItemMain,
  QItemTile,
  QItemSide,
  QItemSeparator
} from 'quasar'

import HbListItem from '@/cards/HbListItem.vue'

export default {
  components: {
    QListHeader,
    QItem,
    QItemMain,
    QItemTile,
    QItemSide,
    QItemSeparator,
    HbListItem
  },
  props: ['model'],
  data () {
    return {
    }
  }
}
</script>

<style lang="stylus" scoped>
.big-value
  font-weight 300
  color black
  font-size 150%
</style>

