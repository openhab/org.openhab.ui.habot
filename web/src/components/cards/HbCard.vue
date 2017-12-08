<template>
<q-card inline class="bigger">
  <q-card-media v-if="model.imageUri">
    <img :src="model.imageUri" />
  </q-card-media>
  <q-card-title>
    <span>{{model.title}}</span>
    <span v-if="model.subtitle" slot="subtitle">{{model.subtitle}}</span>
    <div slot="right" v-if="model.slots && model.slots.right">
      <div v-for="component in model.slots.right.components" :key="component">
        <big v-if="component.name == 'HbSingleItemValue'" class="big-value">{{component.config.state}}</big>
      </div>
    </div>
  </q-card-title>
  <hb-list v-if="model.slots && model.slots.list && model.slots.list.components && model.slots.list.components[0].name == 'HbList'" :model="model.slots.list.components[0]" />
</q-card>
</template>

<script>
import {
  QCard,
  QCardTitle,
  QCardMain,
  QCardMedia,
  QCardSeparator,
  QCardActions
} from 'quasar'

import HbList from '@/cards/HbList.vue'

export default {
  components: {
    QCard,
    QCardTitle,
    QCardMain,
    QCardMedia,
    QCardSeparator,
    QCardActions,
    HbList
  },
  props: ['model'],
  data () {
    return {
    }
  }
}
</script>

<style lang="stylus">
.big-value
  font-weight 300
  color black
  font-size 200%
</style>

