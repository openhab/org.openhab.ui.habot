export const setReady = (state) => {
  state.ready = true
}

export const setUsingStoredCredentials = (state) => {
  state.usingStoredCredentials = true
}

export const setBaseURL = (state, payload) => {
  state.baseURL = payload
}

export const setLang = (state, payload) => {
  state.lang = payload
}
