<template>
    <div class="row">
      <div class="hb-cards">
        <component :is="'HbCard'" :model="card" menu="deck" v-for="card in cards" :key="card.uid"></component>
      </div>
      <div v-if="cards.length === 0" class="fit text-center q-pt-xl text-grey">
        <h4 class="q-display-1">No bookmarked cards</h4>
        <p>Bookmark cards using their context menu in the <a href="#/cards/deck">Card deck</a> or while chatting with HABot.</p>
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
  computed: {
    cards: {
      get () {
        return this.$store.getters['cards/bookmarked']
      }
    }
  }
}
</script>
