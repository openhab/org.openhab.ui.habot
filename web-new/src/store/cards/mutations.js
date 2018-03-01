/*
export const someMutation = (state) => {
}
*/
export const updateAll = (state, cards) => {
  console.log('Loaded ' + cards.length + ' cards')
  state.cards = cards
}

export const createCard = (state, card) => {
  state.cards.push(card)
}

export const updateCard = (state, payload) => {
  let idx = state.cards.findIndex((c) => c.uid === payload.uid)
  if (idx < 0) return
  state.cards[idx] = payload
}

export const bookmarkCard = (state, payload) => {
  let idx = state.cards.findIndex((c) => c.uid === payload.uid)
  if (idx < 0) return
  state.cards[idx].bookmarked = true
}

export const unbookmarkCard = (state, payload) => {
  let idx = state.cards.findIndex((c) => c.uid === payload.uid)
  if (idx < 0) return
  state.cards[idx].bookmarked = false
}

export const updateCardTimestamp = (state, payload) => {
  let idx = state.cards.findIndex((c) => c.uid === payload.uid)
  if (idx < 0) return
  state.cards[idx].timetamp = Date.now()
}

export const removeCard = (state, payload) => {
  let idx = state.cards.findIndex((c) => c.uid === payload.uid)
  if (idx < 0) return
  state.cards.splice(idx, 1)
}

export const setReady = (state) => {
  state.ready = true
}
