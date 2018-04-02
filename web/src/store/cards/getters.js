import { extend } from 'quasar'

const unique = a => [...new Set(a)]

export const objectSet = (state) => {
  if (!state.cards.length) return []
  const tags = state.cards.map((card) => {
    return card.tags || []
  }).reduce((acc, tags) => {
    return acc.concat(tags)
  }).filter((tag) => {
    return tag.indexOf('object:') === 0
  })
  return unique(tags)
}

export const locationSet = (state) => {
  if (!state.cards.length) return []
  const tags = state.cards.map((card) => {
    return card.tags || []
  }).reduce((acc, tags) => {
    return acc.concat(tags)
  }).filter((tag) => {
    return tag.indexOf('location:') === 0
  })
  return unique(tags)
}

export const tag = (state) => (tag) => {
  if (!state.cards.length) return []
  return state.cards.filter((card) => card.tags && card.tags.indexOf(tag) >= 0)
}

export const tags = (state) => (objects, locations) => {
  if (!objects.length && !locations.length) return []
  if (!state.cards.length) return []
  let filtered = state.cards.slice()
  if (objects.length) {
    filtered = filtered.filter((card) => card.tags && objects.some((t) => card.tags.indexOf(t) >= 0))
  }
  if (locations.length) {
    filtered = filtered.filter((card) => card.tags && locations.some((t) => card.tags.indexOf(t) >= 0))
  }
  return filtered
}

export const all = (state) => {
  return state.cards
}

export const bookmarked = (state) => {
  if (!state.cards) return []
  return state.cards.filter(card => card.bookmarked)
}

export const single = (state) => (uid) => {
  if (!state.cards) return null
  let card = state.cards.find(c => c.uid === uid)
  return card
}

export const suggestioncandidates = (state) => {
  if (!state.cards) return []
  return state.cards.filter(card => card.config && card.config.suggestcriteria)
}

export const copy = (state) => (uid) => {
  if (!state.cards) return []
  let card = state.cards.find(c => c.uid === uid)
  if (!card) return null
  return card ? extend(true, {}, card) : null
}
