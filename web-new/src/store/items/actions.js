/*
export const someAction = (state) => {}
 */
import axios from 'axios'
import 'event-source-polyfill'

export const initialLoad = (context) => {
  if (context.state.items.length) return Promise.resolve()
  console.log('Fetching initial state of all items...')

  return new Promise((resolve, reject) => {
    axios.get('/rest/items').then((resp) => {
      context.commit('updateAll', resp.data)
      context.commit('setReady')
      resolve()
    }).catch(err => {
      reject(err)
    })
  })
}

export const watchEvents = async (context, credential) => {
  let eventSource
  if (credential) {
    eventSource = new EventSourcePolyfill('/rest/events', { headers: { 'Authorization': 'Basic ' + btoa(credential.id + ':' + credential.password) } }) // eslint-disable-line no-undef
  } else {
    eventSource = new EventSource('/rest/events')
  }

  eventSource.onmessage = (event) => {
    let evt = JSON.parse(event.data)

    if (evt.type.indexOf('ItemStateChangedEvent') >= 0) {
      let payload = JSON.parse(evt.payload)
      let itemName = evt.topic.split('/')[2]
      let item = context.getters.name(itemName)
      if (item.transformedState) {
        // need to get the transformedState from the API
        axios.get('/rest/items/' + itemName).then((resp) => {
          context.commit('updateOne', { itemName: itemName, newState: payload.value, newTransformedState: resp.data.transformedState })
        })
      } else {
        context.commit('updateOne', { itemName: itemName, newState: payload.value })
      }
    }
  }
}

export const sendCmd = (context, payload) => {
  if (payload.updateState) {
    let currentState = context.getters.itemState(payload.itemName)
    if (currentState && currentState === payload.command) return
    context.commit('updateOne', { itemName: payload.itemName, newState: payload.command.toString() })
  }
  console.log('%cSending command to ' + payload.itemName + ': ' + payload.command, 'font-weight: bold')
  axios.post('/rest/items/' + payload.itemName, payload.command, {
    headers: { 'Content-Type': 'text/plain' }
  })
}
