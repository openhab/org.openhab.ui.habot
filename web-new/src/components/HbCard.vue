<template>
<q-card inline class="bigger">
  <q-card-media v-if="model.imageUri">
    <img :src="model.imageUri" />
  </q-card-media>
  <q-card-title>
    <span>{{model.title}}</span>
    <span v-if="model.subtitle" slot="subtitle">{{model.subtitle}}</span>
    <div slot="right">
      <div v-if="model.slots && model.slots.right" class="inline-block" v-for="component in model.slots.right" :key="component">
        <big v-if="component.component == 'HbSingleItemValue'" class="big-value">{{component.config.state}}</big>
      </div>
      <q-btn round flat icon="more_vert" slot="right">
        <q-popover anchor="bottom right" self="top right">
          <q-list link class="no-border">
            <q-item v-close-overlay v-if="this.menu === 'chat' && !this.model.uid" @click.native="addCardToDeck()">
              <q-item-main label="Add to Card deck" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'chat' && !this.model.uid" @click.native="addCardToDeckAndBookmark()">
              <q-item-main label="Add &amp; bookmark" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'deck'" @click.native="editCard()">
              <q-item-main label="Edit" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'deck'" @click.native="bookmarkCard()">
              <q-item-main label="Bookmark" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'deck'" @click="deleteCard()">
              <q-item-main label="Delete" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'bookmark'" @click.native="unbookmarkCard()">
              <q-item-main label="Remove bookmark" />
            </q-item>
            <q-item v-close-overlay v-if="this.menu === 'designer'" @click.native="forceRefresh()">
              <q-item-main label="Force refresh" />
            </q-item>
          </q-list>
        </q-popover>
      </q-btn>
    </div>
  </q-card-title>
  <q-card-main v-if="model.slots && model.slots.main">
    <component :is="component.component" v-for="component in model.slots.main" :key="component" :model="component"></component>
  </q-card-main>
  <hb-list v-if="model.slots && model.slots.list && model.slots.list[0].component === 'HbList'" :model="model.slots.list[0]" />
</q-card>

</template>

<style lang="stylus">
.big-value
  font-weight 300
  color black
  font-size 200%
  vertical-align middle
</style>

<script>

import HbList from 'components/HbList.vue'
import HbSwitch from 'components/HbSwitch.vue'
import HbKnob from 'components/HbKnob.vue'
import HbSlider from 'components/HbSlider.vue'

export default {
  components: {
    HbList,
    HbSwitch,
    HbKnob,
    HbSlider
  },
  props: ['model', 'menu'],
  data () {
    return {
    }
  },
  methods: {
    addCardToDeck () {
      this.$q.notify('Not implemented')
    },
    addCardToDeckAndBookmark () {
      this.$q.notify('Not implemented')
    },
    bookmarkCard () {
      this.$q.notify('Not implemented')
    },
    editCard () {
      if (!this.model.uid) return
      this.$router.push('/designer/' + this.model.uid)
    },
    forceRefresh () {
      this.$forceUpdate()
    }
  }
}
</script>
