<template>
<q-card inline v-if="model" :class="{ bigger: model.config && model.config.bigger }" :color="model.config.color" :text-color="model.config.textcolor">
  <q-card-media v-if="model.slots && model.slots.media">
    <component v-for="(component, idx) in model.slots.media" :key="'card-media-' + idx" :is="component.component" :model="component"></component>
  </q-card-media>
  <q-card-title>
    <span>{{title}}</span>
    <span v-if="model.subtitle" slot="subtitle">{{subtitle}}</span>
    <div slot="right">
      <div v-if="model.slots && model.slots.right" class="inline-block">
        <component v-for="(component, idx) in model.slots.right" :key="'card-right-' + idx" :is="component.component" :model="component"></component>
      </div>
      <q-btn round flat icon="more_vert" slot="right">
        <q-popover anchor="bottom right" self="top right">
          <q-list link class="no-border">
            <q-item v-close-overlay v-if="this.menu === 'chat' && !this.model.uid && !this.model.addToDeckDenied" @click.native="addCardToDeck()">
              <q-item-main label="Add to Card deck" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'chat' && !this.model.uid && !this.model.addToDeckDenied" @click.native="addCardToDeckAndBookmark()">
              <q-item-main label="Add &amp; bookmark" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'deck'" @click.native="editCard()">
              <q-item-main label="Edit" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'deck' && !this.model.bookmarked" @click.native="bookmarkCard()">
              <q-item-main label="Bookmark" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'deck' && this.model.bookmarked" @click.native="unbookmarkCard()">
              <q-item-main label="Remove bookmark" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'deck'" @click.native="deleteCard()">
              <q-item-main label="Delete" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'bookmark'" @click.native="unbookmarkCard()">
              <q-item-main label="Remove bookmark" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'designer'" @click.native="forceRedraw()">
              <q-item-main label="Force redraw" />
            </q-item>
          </q-list>
        </q-popover>
      </q-btn>
    </div>
  </q-card-title>
  <q-card-main v-if="model.slots && model.slots.main">
    <component :is="component.component" v-for="(component, idx) in model.slots.main" :key="'card-main-' + idx" :model="component" :name="'card-main-' + idx"></component>
  </q-card-main>
  <hb-list v-if="model.slots && model.slots.list && model.slots.list[0] && model.slots.list[0].component === 'HbList'" :model="model.slots.list[0]" />
  <hb-tabs v-if="model.slots && model.slots.tabs && model.slots.tabs[0] && model.slots.tabs[0].component === 'HbTabs'" :model="model.slots.tabs[0]" />
  <q-card-actions v-if="model.slots && model.slots.actions">
    <component :is="component.component" v-for="(component, idx) in model.slots.actions" :key="'card-action-' + idx" :model="component" :name="'card-action-' + idx"></component>
  </q-card-actions>
</q-card>

</template>

<style lang="stylus">
@import '~variables'
.big-value
  font-weight 300
  color black
  font-size 200%
  vertical-align middle
@media (min-width $breakpoint-sm-min)
  .bigger
    width 400px !important
</style>

<script>

import HbSingleItemValue from 'components/HbSingleItemValue.vue'
import HbAnalyzeActionButton from 'components/HbAnalyzeActionButton.vue'
import HbComponents from 'components/index'

import { uid, extend } from 'quasar'

export default {
  name: 'HbCard',
  components: {
    HbSingleItemValue,
    HbAnalyzeActionButton,
    ...HbComponents
  },
  props: ['model', 'menu'],
  data () {
    return {
    }
  },
  methods: {
    addCardToDeck () {
      let newcard = extend({}, this.model)
      newcard.uid = uid()
      if (!newcard.tags) newcard.tags = [] // todo add tags from the chat reply
      if (!newcard.slots) newcard.slots = {} // temp
      return new Promise((resolve, reject) => {
        this.$store.dispatch('cards/create', newcard).then((card) => {
          this.$q.notify({ type: 'positive', message: 'Added to card deck' })
          resolve(card)
        }).catch((err) => {
          reject(err)
        })
      })
    },
    addCardToDeckAndBookmark () {
      return this.addCardToDeck().then((card) => {
        return this.$store.dispatch('cards/bookmark', card).then(() => {
          this.$q.notify({ type: 'info', message: 'Added to bookmarks' })
        })
      })
    },
    bookmarkCard () {
      this.$store.dispatch('cards/bookmark', this.model).then(() => {
        this.$q.notify({ type: 'info', message: 'Added to bookmarks' })
      })
    },
    unbookmarkCard () {
      this.$store.dispatch('cards/unbookmark', this.model).then(() => {
        this.$q.notify({ type: 'info', message: 'Removed from bookmarks' })
      })
    },
    editCard () {
      if (!this.model.uid) return
      this.$router.push('/designer/' + this.model.uid)
    },
    deleteCard () {
      this.$store.dispatch('cards/remove', this.model).then((deletedCard) => {
        this.$q.notify({
          type: 'warning',
          message: 'Deleted',
          actions: [
            {
              label: 'Undo',
              handler: () => {
                this.$store.dispatch('cards/create', deletedCard)
              }
            }
          ]
        })
      })
    },
    forceRedraw () {
      this.$forceUpdate()
    }
  },
  asyncComputed: {
    title: {
      get () {
        return this.$expr(this.model.title)
      }
    },
    subtitle: {
      get () {
        return this.$expr(this.model.subtitle)
      }
    }
  }
}
</script>
