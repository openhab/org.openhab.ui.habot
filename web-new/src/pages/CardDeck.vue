<template>
  <div>
    <div class="row bg-grey-2 shadow-2">
      <q-checkbox class="multiple-toggle" color="secondary" v-model="multiple" unchecked-icon="done" checked-icon="done_all"></q-checkbox>
      <div :class="['filters', 'row', (multiple) ? 'multiple' : 'single']">
        <q-select :multiple="multiple" filter clearable chips color="secondary" v-model="objects" class="col-sm-6" :options="objectSet" float-label="Objects"></q-select>
        <q-select :multiple="multiple" filter clearable chips color="secondary" v-model="locations" class="col-sm-6" :options="locationSet" float-label="Locations"></q-select>
      </div>
      <!-- <q-search v-model="search" color="none" class="col"></q-search> -->
    </div>
    <div class="row">
      <div v-if="nofilters" class="fit text-center q-pt-xl q-pl-lg q-pr-lg text-grey">
        <h4 class="q-display-1">Select tags to show cards</h4>
        <p>Use the filters above to display the corresponding cards, or create one.</p>
        <q-btn flat icon="bookmark" @click="$router.push('/cards/bookmarks')" style="margin-top: -1px">Bookmarks</q-btn>
        <q-btn flat icon="star" @click="$router.push('/cards/suggestions')" style="margin-top: -1px">Suggestions</q-btn>
      </div>
      <div v-if="!nofilters && !cards.length" class="fit text-center q-pt-xl q-pl-lg q-pr-lg text-grey">
        <h4 class="q-display-1">No cards found</h4>
        <p>Change the filters or click on the button below to create one with the selected tags.</p>
      </div>
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
          icon="aspect_ratio">
          <q-tooltip anchor="center left" self="center right" :offset="[10, 10]">Create simple card</q-tooltip>
        </q-fab-action>
        <q-fab-action
          color="secondary"
          @click="addListCard"
          icon="list">
          <q-tooltip anchor="center left" self="center right" :offset="[10, 10]">Create list card</q-tooltip>
        </q-fab-action>
        <q-fab-action
          color="secondary"
          @click="addTabbedCard"
          icon="tab">
          <q-tooltip anchor="center left" self="center right" :offset="[10, 10]">Create tabbed card</q-tooltip>
        </q-fab-action>
      </q-fab>
    </q-page-sticky>
  </div>
</template>

<style lang="stylus">
@import '~variables'
.multiple-toggle
  position absolute
  right 0
  margin 30px
// mat theme fixes for the filters
.filters
  padding 10px
  width 100%
  margin-right 50px
  &.single .q-if-inner
    min-height 43px !important
    // margin-top 2px !important
    // margin-left 3px !important
    .q-input-target
      margin-top 2px !important
      margin-left 10px !important
    // margin-bottom 3px !important  padding 10px
  .q-select
    .q-if-label
        top 21px
        &.q-if-label-above
          transform scale(0.75) translate(0, -28px)

.hb-cards
  padding 10px
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
      multiple: false,
      objects: null,
      locations: null
      // cards: []
    }
  },
  methods: {
    addCard () {
      this.$router.push({ path: '/designer/' + uid(), query: { tags: this.currentFilterTags.join(',') } })
    },
    addListCard () {
      this.$router.push({ path: '/designer/' + uid(), query: { type: 'list', tags: this.currentFilterTags.join(',') } })
    },
    addTabbedCard () {
      this.$router.push({ path: '/designer/' + uid(), query: { type: 'tabs', tags: this.currentFilterTags.join(',') } })
    }
  },
  watch: {
    multiple: function (val) {
      if (val) {
        this.objects = (!this.objects) ? [] : [this.objects]
        this.locations = (!this.locations) ? [] : [this.locations]
      } else {
        this.objects = (this.objects.length) ? this.objects[0] : null
        this.locations = (this.locations.length) ? this.locations[0] : null
      }
    }
  },
  computed: {
    nofilters () {
      if (this.multiple) return (!this.objects.length && !this.locations.length)
      else return (!this.objects && !this.locations)
    },
    objectSet: {
      get () {
        return this.$store.getters['cards/objectSet'].map((tag) => {
          return {
            value: tag,
            label: tag.replace('object:', ''),
            stamp: '(' + this.$store.getters['cards/tag'](tag).length + ')'
          }
        })
      }
    },
    locationSet: {
      get () {
        return this.$store.getters['cards/locationSet'].map((tag) => {
          return {
            value: tag,
            label: tag.replace('location:', ''),
            stamp: '(' + this.$store.getters['cards/tag'](tag).length + ')'
          }
        })
      }
    },
    cards: {
      get () {
        let objects = (this.multiple) ? this.objects : (this.objects) ? [this.objects] : []
        let locations = (this.multiple) ? this.locations : (this.locations) ? [this.locations] : []
        return this.$store.getters['cards/tags'](objects, locations)
      }
    },
    currentFilterTags () {
      let tags = []
      if (!this.multiple) {
        if (this.objects) tags.push(this.objects)
        if (this.locations) tags.push(this.locations)
      } else {
        tags = tags.concat(this.objects).concat(this.locations)
      }
      return tags
    }
  }
}
</script>
