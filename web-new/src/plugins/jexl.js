// import something here
import jexl from 'jexl'
import AsyncComputed from 'vue-async-computed'
import store from '../store'

// leave the export, even if you don't use it
export default ({ app, router, Vue }) => {
  Vue.use(AsyncComputed)
  Vue.prototype.$jexl = jexl
  Vue.prototype.$expr = (value) => {
    if (value.startsWith('=')) {
      try {
        return jexl.eval(value.substring(1), store.state.items).then((res) => {
          return res
        }).catch((e) => {
          return e.message
        })
      } catch (e) {
        return e
      }
    } else {
      return value
    }
  }
}
