import { extend } from 'quasar'

export const all = (state) => {
  return state.cards
}

export const bookmarked = (state) => {
  return state.cards.filter(card => card.bookmarked)
}

export const single = (state) => (uid) => {
  let card = state.cards.find(c => c.uid === uid)
  return card
}

export const suggestioncandidates = (state) => {
  return state.cards.filter(card => card.config && card.config.suggestcriteria)
}

export const copy = (state) => (uid) => {
  let card = state.cards.find(c => c.uid === uid)
  return card ? extend(true, {}, card) : null
}
