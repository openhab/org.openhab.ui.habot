/*
export const someMutation = (state) => {}
 */
import { extend } from 'quasar'

export const updateAll = (state, items) => {
  console.log('Loaded ' + items.length + ' items')
  state.items = items
  for (let i of items) {
    state.state[i.name] = i
  }
  // state.state = // items.map((i) => { return {name: i.name, state: i.state} })
}

export const updateOne = (state, payload) => {
  console.log('Updating ' + payload.itemName + ' state to ' + payload.newState)
  let item = state.items.find((i) => i.name === payload.itemName)
  item.state = payload.newState
  state.state = extend({}, state.state)
  state.state[payload.itemName] = item
  // let stateEl = state.state.find((s) => s.name === payload.itemName)
  // stateEl.state = payload.newState
}

export const setReady = (state) => {
  state.ready = true
}
