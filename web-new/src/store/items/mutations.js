/*
export const someMutation = (state) => {}
 */
export const updateAll = (state, items) => {
  console.log('Loaded ' + items.length + ' items')
  state.items = items
}

export const updateOne = (state, payload) => {
  console.log('Updating ' + payload.itemName + ' state to ' + payload.newState)
  let item = state.items.find((i) => i.name === payload.itemName)
  item.state = payload.newState
}

export const setReady = (state) => {
  state.ready = true
}
