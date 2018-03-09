import { sprintf } from 'sprintf-js'

const unique = a => [...new Set(a)]

export const objectSet = (state) => {
  if (!state.items) return []
  const tags = state.items.map((item) => {
    return item.tags || []
  }).reduce((acc, tags) => {
    return acc.concat(tags)
  }).filter((tag) => {
    return tag.indexOf('object:') === 0
  })
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
  })
  return unique(tags)
}

export const allStates = (state) => {
  let states = {}
  for (let i of state.items) {
    states[i.name] = state.map[i.name]
  }
  return states
}

export const itemState = (state) => (name) => {
  if (!state.items) return []
  let item = state.items.find(item => item.name === name)
  if (item && item.state) {
    if (item.transformedState) {
      return item.transformedState
    } else if (item.stateDescription && item.stateDescription.pattern) {
      return sprintf(item.stateDescription.pattern, item.state)
    } else {
      return item.state
    }
  } else {
    return null
  }
}

export const name = (state) => (name) => {
  return state.items.find(item => item.name === name)
}
