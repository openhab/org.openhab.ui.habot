<template>
  <div>
    <div class="row filters bg-grey-2 shadow-2">
      <!-- <q-search v-model="search" color="none" class="col"></q-search> -->
      <q-select multiple filter chips color="secondary" v-model="objects" class="col-sm-6" :options="objectSet" float-label="Objects"></q-select>
      <q-select multiple filter chips color="secondary" v-model="locations" class="col-sm-6" :options="locationSet" float-label="Locations"></q-select>
    </div>
    <div class="row">
      <div class="hb-cards">
        <component :is="'HbCard'" :model="card" menu="deck" v-for="card in cards" :key="card.uid"></component>
      </div>
    </div>
    <q-page-sticky position="bottom-right" :offset="[18, 18]">
      <q-fab
        color="secondary"
        icon="add" direction="up">
        <q-fab-action
          color="secondary"
          @click="addCard"
          icon="aspect_ratio"
        />
        <q-fab-action
          color="secondary"
          @click="addListCard"
          icon="list"
        />
        <q-fab-action
          color="secondary"
          @click="addTabbedCard"
          icon="tab"
        />
      </q-fab>
    </q-page-sticky>
  </div>
</template>

<style lang="stylus">
@import '~variables'
// mat theme fixes for the filters
.filters
  padding 10px
  .q-select
    .q-if-label
      top 21px
      &.q-if-label-above
        transform scale(0.75) translate(0, -28px)

.hb-cards
  padding 15px
  width 100%
  @media (min-width $breakpoint-xs-min)
    .q-card
      min-width $card-min-width
      margin 15px
  @media (max-width $breakpoint-xs-max)
    .q-card
      width 100%
      margin-bottom 20px
      margin-left -0.25rem
</style>

<script>
import CardDesigner from 'layouts/designer/CardDesigner.vue'
import HbCard from 'components/HbCard.vue'
import { uid } from 'quasar'

export default {
  components: {
    CardDesigner,
    HbCard
  },
  data () {
    return {
      objects: [],
      locations: [],
      cards: []
    }
  },
  methods: {
    addCard () {
      this.$router.push('/designer/' + uid())
    },
    addListCard () {
      this.$router.push('/designer/' + uid() + '?type=list')
    },
    addTabbedCard () {
      this.$router.push('/designer/' + uid() + '?type=tabs')
    }
  },
  computed: {
    objectSet: {
      get () {
        return this.$store.getters['items/objectSet'].map((tag) => {
          return {
            label: tag,
            value: tag
          }
        })
      }
    },
    locationSet: {
      get () {
        return this.$store.getters['items/locationSet'].map((tag) => {
          return {
            label: tag,
            value: tag
          }
        })
      }
    }
  },
  created () {
    this.$http.get('/rest/habot/cards').then((resp) => {
      this.cards = resp.data
    })
  }
}
</script>
