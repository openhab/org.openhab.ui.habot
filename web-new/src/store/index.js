import Vue from 'vue'
import Vuex from 'vuex'

import items from './items'
import cards from './cards'

import * as actions from './actions'

Vue.use(Vuex)

const store = new Vuex.Store({
  modules: {
    items,
    cards
  },
  actions
})

export default store

// store.dispatch('items/initialLoad').then(() => {
//   store.dispatch('items/watchEvents')
//   console.log('items loaded')
// })
