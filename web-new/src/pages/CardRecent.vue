<template>
  <q-timeline class="recent-cards">
    <q-timeline-entry v-for="card in cards" :key="card.uid"
      :subtitle="new Date(card.timestamp) | moment('from')" class="recent-card">
      <hb-card :model="card" menu="recent" @forgotten="cardForgotten" />
    </q-timeline-entry>
  </q-timeline>
</template>

<style lang="stylus">
@import '~variables'

.recent-cards
  @media (max-width $breakpoint-xs-max)
    .q-card
      width calc(100% - 10px)
      margin-bottom 20px
      margin-left -0.60rem
  @media (min-width $breakpoint-sm-min)
    .q-card
      min-width $card-min-width
      margin 15px
  @media (max-width $breakpoint-sm-max)
    width calc(100% - 20px)
    margin-left 20px
  @media (min-width $breakpoint-md-min)
    margin-left -100px
    width calc(100% + 50px)
  @media (min-width $breakpoint-lg-min)
    margin-left -250px
    width calc(100% + 150px)
    .q-card
      // margin-left -2.2rem
      // margin-right -2.2rem
      z-index 1000
</style>

<script>
import HbCard from 'components/HbCard.vue'

export default {
  components: {
    HbCard
  },
  data () {
    return {
      cards: null
    }
  },
  methods: {
    getRecentCards (skip) {
      this.$http.get('/rest/habot/cards/recent').then((resp) => {
        if (resp.data) {
          this.cards = resp.data
        }
      })
    },
    cardForgotten (uid) {
      let card = this.cards.find((card) => card.uid === uid)
      this.cards.splice(this.cards.indexOf(card), 1)
    },
    formatTimestamp (timestamp) {
      return new Date(timestamp).toString()
    }
  },
  created () {
    this.getRecentCards(0)
  }
}
</script>
