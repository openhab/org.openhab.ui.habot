<template>
  <!-- Don't drop "q-app" class -->
  <div id="q-app" ref="app">
    <!-- <header></header> -->
    <!-- <main> -->
  <!-- Configure "view" prop for QLayout -->
    <q-layout ref="layout"
      view="lHh Lpr lFf"
      :left-class="{'bg-grey-2': true}">
      <q-toolbar slot="header">
        <q-btn
          flat
          @click="$refs.layout.toggleLeft()"
        >
          <q-icon name="menu" />
        </q-btn>
        <q-toolbar-title>
          Chat with HABot
        </q-toolbar-title>
      </q-toolbar>

      <!-- <q-tabs slot="navigation">
        <q-route-tab slot="title" icon="view_quilt" to="/layout/about" replace hide="icon" label="About" />
        <q-route-tab slot="title" icon="view_day" to="/layout/toolbar" replace hide="icon" label="Toolbar" />
        <q-route-tab slot="title" icon="view_day" to="/layout/tabs" replace label="Tabs" />
        <q-route-tab slot="title" icon="input" to="/layout/drawer" replace label="Drawer" />
      </q-tabs> -->

      <div slot="left">
        <div class="logo">
          <img src="~assets/logo.png" alt="HABot">
        </div>
        <q-list no-border link inset-delimiter>
          <!-- <q-list-header>Essential Links</q-list-header> -->
          <q-side-link item to="/chat">
            <q-item-side icon="chat" />
            <q-item-main label="Chat with HABot" />
          </q-side-link>
          <q-side-link item to="/settings">
            <q-item-side icon="settings" />
            <q-item-main label="Settings" />
          </q-side-link>
        </q-list>
      </div>


      <!-- <img src="~assets/quasar-logo-full.svg" alt="Quasar PWA"> -->
      <router-view class="layout-view"></router-view>

      <q-fixed-position corner="bottom-right" :offset="[18, 18]" v-if="$route.path == '/' || $route.path == '/chat'">
        <q-btn round color="primary" @click="speak" icon="mic" />
      </q-fixed-position>

      <q-toolbar slot="footer" class="chat-input bg-grey-3" v-if="$route.path == '/' || $route.path == '/chat'">
        <q-input ref="input" v-model="text" class="full-width" placeholder="Ask me about your home" :after="inputAfter" @keyup="keyUp" />
      </q-toolbar>
      
    <!-- </main> -->

    </q-layout>
  </div>
</template>

<script>
/*
 * Root component
 */
import {
  Events,
  Toast,
  QLayout,
  QFixedPosition,
  QToolbar,
  QToolbarTitle,
  QBtn,
  QCard,
  QCardTitle,
  QCheckbox,
  QCardSeparator,
  QCardActions,
  QIcon,
  QList,
  QListHeader,
  QInput,
  QItem,
  QItemSeparator,
  QItemSide,
  QItemMain,
  QRange,
  QSlider,
  QRadio,
  QTabs,
  QRouteTab,
  QChatMessage,
  QSideLink
} from 'quasar'
export default {
  components: {
    QLayout,
    QFixedPosition,
    QToolbar,
    QToolbarTitle,
    QBtn,
    QCard,
    QCardTitle,
    QCheckbox,
    QCardSeparator,
    QCardActions,
    QIcon,
    QInput,
    QList,
    QListHeader,
    QItem,
    QItemSeparator,
    QItemSide,
    QItemMain,
    QRange,
    QRadio,
    QSlider,
    QTabs,
    QRouteTab,
    QSideLink,
    QChatMessage
  },
  data () {
    return {
      text: '',
      inputAfter: [{
        icon: 'arrow_send',
        content: true,
        handler: this.send
      }]
    }
  },
  methods: {
    send () {
      Events.$emit('chat-send', this.text)
      if (this.$q.platform.is.mobile) {
        // force hide the virtual keyboard
        event.currentTarget.blur()
      }
      this.text = ''
    },
    keyUp (event) {
      if (event.keyCode === 13) {
        this.send()
      }
    },
    scrollToBottom () {
      var el = this.$refs.app
      window.setTimeout(function () {
        el.scrollTop = el.scrollHeight
      })
    },
    speak () {
      Toast.create.negative({
        html: 'Speak is not implemented yet!',
        icon: 'mic off'
      })
    }
  },
  created () {
    // this.$q.events.$on('chat-added', this.scrollToBottom)
  }
}
</script>

<style lang="stylus">
@import '~variables'

main
  min-height auto
  //text-align center
  //margin-top 40px

header
  margin 0
  height 10px
  background-color $primary

.logo
  padding 3px 12px
  text-align center
  background white

#q-app
    width 100%
    height 100%
    position absolute
    top 0
    z-index 2
    margin 0
    padding 0
    overflow-y auto
</style>
