<template>
  <div>
    <div class="row filters">
      <!-- <q-search v-model="search" color="none" class="col"></q-search> -->
      <q-select multiple filter chips color="secondary" v-model="objects" class="col-sm-6" :options="options" float-label="Filter objects"></q-select>
      <q-select multiple filter chips color="secondary" v-model="locations" class="col-sm-6" :options="options" float-label="Filter locations"></q-select>
    </div>
    <div class="layout-padding hb-cards">
      <component :is="'HbCard'" :model="cardModel"></component>

      <q-input
        v-model="modelJson"
        type="textarea"
        float-label="Card Model"
        :min-rows="7"
      />
    </div>
  </div>
</template>

<script>
import HbCard from '@/cards/HbCard.vue'
import {
  QToolbar,
  QSearch,
  QSelect,
  QInput
} from 'quasar'

export default {
  components: {
    HbCard,
    QToolbar,
    QSelect,
    QSearch,
    QInput
  },
  data () {
    return {
      objects: [],
      locations: [],
      options: [
        {
          label: 'Google',
          value: 'goog'
        },
        {
          label: 'Facebook',
          value: 'fb'
        },
        {
          label: 'Twitter',
          value: 'twtr'
        },
        {
          label: 'Apple Inc.',
          value: 'appl'
        },
        {
          label: 'Oracle',
          value: 'ora'
        }
      ],
      modelJson: '{\n}',
      testModel: {
        imageUri: null,
        title: 'Test',
        subtitle: 'Subtitle'
      }
    }
  },
  computed: {
    cardModel () {
      try {
        return JSON.parse(this.modelJson)
      }
      catch (err) {
        return {
          title: 'Model error',
          subtitle: err.message
        }
      }
    }
  }
}
</script>

<style lang="stylus">
@import '~variables'

.filters
  padding 10px
  .q-select
    margin-top 5px
.hb-cards
  .q-card
    width 300px
  .bigger
    width 450px
  @media (max-width $breakpoint-xs-max)
    .q-card
      width 100%
      margin-left -0.25rem
</style>

