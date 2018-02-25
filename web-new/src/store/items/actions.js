/*
export const someAction = (state) => {}
 */
import axios from 'axios'

export const initialLoad = (context) => {
  if (context.state.items.length) return Promise.resolve()
  console.log('Fetching initial state of all items...')

  return axios.get('/rest/items').then((resp) => {
    context.commit('updateAll', resp.data)
    context.commit('setReady')
    context.dispatch('watchEvents')

    return Promise.resolve()
  })
}

export const watchEvents = (context) => {
  let eventSource = new EventSource('/rest/events')

  eventSource.onmessage = (event) => {
    let evt = JSON.parse(event.data)

    if (evt.type.indexOf('ItemStateEvent') >= 0) {
      let payload = JSON.parse(evt.payload)
      let itemName = evt.topic.split('/')[2]
      context.commit('updateOne', { itemName: itemName, newState: payload.value })
    }
  }
}

export const sendCmd = (context, payload) => {
  console.log('Sending command to ' + payload.itemName + ': ' + payload.command)
  axios.post('/rest/items/' + payload.itemName, payload.command, {
    headers: { 'Content-Type': 'text/plain' }
  })
}
