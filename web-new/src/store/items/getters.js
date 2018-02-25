/*
export const someGetter = (state) => {}
 */

const unique = a => [...new Set(a)]

export const objectSet = (state) => {
  const tags = state.items.map((item) => {
    return item.tags || []
  }).reduce((acc, tags) => {
    return acc.concat(tags)
  }).filter((tag) => {
    return tag.indexOf('object:') === 0
  }).map((tag) => tag.replace('object:', ''))
  return unique(tags)
}

export const locationSet = (state) => {
  if (!state.items) return []
  const tags = state.items.map((item) => {
    return item.tags || []
  }).reduce((acc, tags) => {
    return acc.concat(tags)
  }).filter((tag) => {
    return tag.indexOf('location:') === 0
  }).map((tag) => tag.replace('location:', ''))
  return unique(tags)
}

export const itemState = (state) => (name) => {
  if (!state.items) return []
  let item = state.items.find(item => item.name === name)
  if (item && item.state) {
    return item.state
  } else {
    return null
  }
}
