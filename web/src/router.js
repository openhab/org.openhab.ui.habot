import Vue from 'vue'
import VueRouter from 'vue-router'

// import Hello from '@/Hello.vue'
import Chat from '@/Chat.vue'
import Settings from '@/Settings.vue'

Vue.use(VueRouter)

/*
 * Uncomment this section and use "load()" if you want
 * to lazy load routes.
function load (component) {
  // '@' is aliased to src/components
  return () => import(`@/${component}.vue`)
}
*/

export default new VueRouter({
  /*
   * NOTE! VueRouter "history" mode DOESN'T works for Cordova builds,
   * it is only to be used only for websites.
   *
   * If you decide to go with "history" mode, please also open /config/index.js
   * and set "build.publicPath" to something other than an empty string.
   * Example: '/' instead of current ''
   *
   * If switching back to default "hash" mode, don't forget to set the
   * build publicPath back to '' so Cordova builds work again.
   */

  routes: [
    { path: '/', redirect: '/chat' },
    { path: '/chat', component: Chat, props: (route) => ({ action: route.query.action }) },
    { path: '/notification',
      redirect: (to) => {
        return { path: '/chat', hash: '', query: '', params: { action: to.hash } }
      }
    },
    { path: '/settings', component: Settings }
  ]
})
