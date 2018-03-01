import axios from 'axios'

export const initialLoad = (context) => {
  if (context.state.cards.length) return Promise.resolve()
  console.log('Fetching all cards...')

  return new Promise((resolve, reject) => {
    axios.get('/rest/habot/cards').then((resp) => {
      context.commit('updateAll', resp.data)
      context.commit('setReady')
      resolve()
    }).catch(err => {
      reject(err)
    })
  })
}

export const create = (context, card) => {
  return axios.post('/rest/habot/cards', card).then((resp) => {
    context.commit('createCard', card)

    return Promise.resolve(card)
  }).catch((err) => {
    return Promise.reject(err)
  })
}

export const update = (context, card) => {
  return axios.put('/rest/habot/cards/' + card.uid, card).then((resp) => {
    context.commit('updateCard', card)

    return Promise.resolve(card)
  }).catch((err) => {
    return Promise.reject(err)
  })
}

export const bookmark = (context, card) => {
  return axios.put('/rest/habot/cards/' + card.uid + '/bookmark').then((resp) => {
    context.commit('bookmarkCard', card)

    return Promise.resolve(card)
  }).catch((err) => {
    return Promise.reject(err)
  })
}

export const unbookmark = (context, card) => {
  return axios.delete('/rest/habot/cards/' + card.uid + '/bookmark').then((resp) => {
    context.commit('unbookmarkCard', card)

    return Promise.resolve(card)
  }).catch((err) => {
    return Promise.reject(err)
  })
}

export const remove = (context, card) => {
  return axios.delete('/rest/habot/cards/' + card.uid).then((resp) => {
    context.commit('removeCard', card)

    // return deleted card for undo purposes
    return Promise.resolve(card)
  }).catch((err) => {
    return Promise.reject(err)
  })
}

export const updateTimestamp = (context, card) => {
  return axios.put('/rest/habot/cards/' + card.uid + '/timestamp').then((resp) => {
    context.commit('updateCardTimestamp', card)

    return Promise.resolve(card)
  }).catch((err) => {
    return Promise.reject(err)
  })
}
