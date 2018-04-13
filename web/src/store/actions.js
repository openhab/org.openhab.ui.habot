import axios from 'axios'
import { Platform, LocalStorage } from 'quasar'

export const initialLoad = (context, credential) => {
  let initialRequests = () => {
    return context.dispatch('items/initialLoad')
      .then(() => {
        return context.dispatch('cards/initialLoad')
          .then(() => {
            context.dispatch('items/watchEvents', credential)
            return context.commit('setReady')
          })
      })
  }

  if (Platform.is.cordova) {
    const baseURL = LocalStorage.get.item('habot.baseURL')
    if (!baseURL) {
      return Promise.reject(new Error('Base URL not configured'))
    }
    axios.defaults.baseURL = baseURL
    context.commit('setBaseURL', baseURL)

    let userId = LocalStorage.get.item('habot.credentialUserId')
    let password = LocalStorage.get.item('habot.credentialPassword')
    if (userId && password) {
      credential = {
        id: userId,
        password: password
      }
    }
  }

  if (credential) {
    axios.defaults.headers.common['Authorization'] = 'Basic ' + btoa(credential.id + ':' + credential.password)
    context.commit('setUsingStoredCredentials')
    return initialRequests()
  } else {
    return initialRequests()
  }
}
