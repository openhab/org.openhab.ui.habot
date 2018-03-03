<template>
    <div class="row">
      <div class="hb-cards">
        <component :is="'HbCard'" :model="card" menu="deck" v-for="card in cards" :key="card.uid"></component>
      </div>
      <div v-if="cards.length === 0" class="fit text-center q-pt-xl text-grey">
        <h4 class="q-display-1">There are no suggestions at this time</h4>
        <p>Edit cards from the <a href="#/cards/deck">Card deck</a> and add criteria in the designer to make them appear here when relevant.</p>
      </div>
      <div class="full-width q-mt-lg text-center">
        <q-btn outline color="secondary" @click="computeSuggestions()" icon="refresh">Refresh suggestions</q-btn>
      </div>
    </div>
</template>

<style lang="stylus">
@import '~variables'

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
import HbCard from 'components/HbCard.vue'

export default {
  components: {
    HbCard
  },
  data () {
    return {
      cards: []
    }
  },
  methods: {
    computeSuggestions () {
      this.cards = []
      let candidates = this.$store.getters['cards/suggestioncandidates']

      for (let card of candidates) {
        this.$expr('=' + card.config.suggestcriteria).then((result) => {
          if (result === true) {
            this.cards.push(card)
          }
        })
      }
    }
  },
  mounted () {
    this.computeSuggestions()
  }
}
</script>
