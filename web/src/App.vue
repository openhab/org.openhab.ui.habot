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
          HABot
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
        <q-list link inset-delimiter>
          <!-- <q-list-header>Essential Links</q-list-header> -->
        <!-- <q-list-header>Chat</q-list-header> -->
          <q-side-link item to="/chat">
            <q-item-side icon="chat" />
            <q-item-main label="Chat with HABot" />
          </q-side-link>

        <q-item-separator></q-item-separator>
        <q-list-header>My Cards</q-list-header>
        <q-side-link item to="/cards/favorites">
          <q-item-side icon="bookmark" />
          <q-item-main label="Bookmarks"></q-item-main>
        </q-side-link>
        <q-side-link item to="/cards/recent">
          <q-item-side icon="history" />
          <q-item-main label="Recent"></q-item-main>
        </q-side-link>
        <q-side-link item to="/cards/deck">
          <q-item-side icon="dashboard" />
          <q-item-main label="Card deck"></q-item-main>
        </q-side-link>

        <q-item-separator></q-item-separator>
        <!-- <q-list-header>Settings</q-list-header> -->
        <q-side-link item to="/settings">
          <q-item-side icon="settings" />
          <q-item-main label="Settings" />
        </q-side-link>
        </q-list>
      </div>


      <!-- <img src="~assets/quasar-logo-full.svg" alt="Quasar PWA"> -->
      <router-view class="layout-view"></router-view>

      <q-fixed-position corner="bottom-right" :offset="[18, 18]" v-if="$route.path == '/' || $route.path == '/chat'">
        <q-btn v-show="startSpeak" round color="primary" @click="startRecording" icon="mic" />
        <q-btn v-show="stopSpeak" round loader color="red" @click="stopRecording" icon="mic off">
          <q-spinner-radio slot="loading" />
        </q-btn>
      </q-fixed-position>

      <q-toolbar slot="footer" class="chat-input bg-grey-3" v-if="$route.path == '/' || $route.path == '/chat'">
        <q-input ref="input" v-model="text" class="full-width" placeholder="Ask me about your home" :after="inputAfter" @keyup="keyUp" />
      </q-toolbar>
      
    <!-- </main> -->

    </q-layout>
  </div>
</template>

<script>

var audioContext
var recorder

/*
 * Root component
 */

// // eslint-disable-next-line no-unused-vars
// import * as recorderjs from '@accentdotai/recorderjs'

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
  QSideLink,
  QSpinnerRadio,
  LocalStorage
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
    QChatMessage,
    QSpinnerRadio
  },
  data () {
    return {
      text: '',
      inputAfter: [{
        icon: 'arrow_send',
        content: true,
        handler: this.send
      }],

      startSpeak: true,
      stopSpeak: false,
      speakLoader: false,
      speakResult: false,
      speakError: false,
      speakTextResult: '',
      speakGoogleApiKey: null,
      speakData: {
        audio: {
          content: null
        },
        config: {
          encoding: 'LINEAR16',
          // sampleRateHertz: 16000,
          languageCode: null
        }
      }
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
    startRecording () {
      try {
        this.speakResult = false
        audioContext = new AudioContext()
        console.log('Audio context set up')

        this.speakGoogleApiKey = LocalStorage.get.item('habot.googleApiKey')
        if (!this.speakGoogleApiKey) {
          Toast.create.negative({
            html: 'The Google API Key is not set.',
            icon: 'mic off'
          })
          return
        }

        var vm = this
        navigator.mediaDevices.getUserMedia({ audio: true }).then(function (stream) {
          const input = audioContext.createMediaStreamSource(stream)
          // eslint-disable-next-line no-undef
          recorder = new Recorder(input, { numChannels: 1 })
          vm.startSpeak = false
          vm.stopSpeak = true
          recorder && recorder.record()
          setTimeout(() => { vm.stopRecording() }, 10000)
        }).catch(function (e) {
          Toast.create.negative({
            html: 'No live audio input: ' + e,
            icon: 'mic off'
          })
        })
      }
      catch (e) {
        Toast.create.negative({
          html: 'This browser has no support for web audio',
          icon: 'mic off'
        })
        throw e
      }
    },
    stopRecording (event, doneCallback) {
      recorder && recorder.stop()
      this.speakLoader = true
      this.processRecording(doneCallback)
      recorder.clear()
    },
    processRecording (doneCallback) {
      const vm = this

      recorder && recorder.exportWAV(function (blob) {
        var reader = new window.FileReader()
        reader.readAsDataURL(blob)
        reader.onloadend = () => {
          const baseData = reader.result
          const base64Data = baseData.replace('data:audio/wav;base64,', '')
          vm.speakData.audio.content = base64Data
          vm.speakData.config.languageCode = 'fr'
          vm.$http.post(`https://speech.googleapis.com/v1/speech:recognize?key=${vm.speakGoogleApiKey}`, vm.speakData)
            .then(response => {
              if (response.data.results) {
                const result = response.data.results[0].alternatives[0]
                Events.$emit('chat-send', result.transcript)
              }
              vm.startSpeak = true
              vm.stopSpeak = false
              vm.speakResult = true
              if (doneCallback) doneCallback()
            }).catch(error => {
              vm.speakError = true
              vm.startSpeak = true
              vm.stopSpeak = false
              vm.speakResult = false
              Toast.create.negative({
                html: error,
                icon: 'mic off'
              })
              if (doneCallback) doneCallback()
            })
        }
      })
    }
  },
  created () {
    // this.$q.events.$on('chat-added', this.scrollToBottom)
    window.AudioContext = window.AudioContext || window.webkitAudioContext
    navigator.getUserMedia = navigator.getUserMedia || navigator.webkitGetUserMedia
  }
}
</script>

<style lang="stylus" scoped>
@import '~variables'

.layout-aside.fixed
  z-index 10000 !important

.q-list
  border-bottom 0

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
  height 80px
  text-align center
  background white
  img
    padding-top 16px

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
