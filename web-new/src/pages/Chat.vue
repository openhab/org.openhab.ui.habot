<template>
  <q-page padding class="row justify-center">
    <q-page-sticky position="top" v-if="showPWAPrompt" style="z-index: 2000">
      <q-alert icon="info" color="yellow" text-color="grey-9"
        :actions="[{ label: 'Learn how', handler () {} }, { label: 'Dismiss', handler () { showPWAPrompt = false } }]">
        Using Chrome on Android? Use a secure origin like myopenhab.org and add HABot to the home screen for the best experience!
      </q-alert>
    </q-page-sticky>

    <div :style="{ 'width': '100%', 'margin-top': (showPWAPrompt) ? '150px' : '100px' }">
      <div class="chat-area" v-for="chat in chats" :key="chat" ref="chat">
        <q-resize-observable @resize="onChatAreaResized"></q-resize-observable>
        <q-window-resize-observable @resize="scrollToBottom"></q-window-resize-observable>

        <q-chat-message
          v-for="msg in chat.messages"
          :key="msg"
          :label="msg.label"
          :sent="msg.sent"
          :text-color="msg.textColor"
          :bg-color="msg.bgColor"
          :name="msg.name"
          :avatar="msg.avatar"
          :text="msg.text"
          :stamp="msg.stamp"
        />

        <hb-card v-if="chat.card && chat.card.component === 'HbCard'" :model="chat.card" menu="chat">

        </hb-card>

        <q-card v-if="chat.card && chat.card.component === 'HbDumpIntentCard'">
          <q-card-title>
            Intent: {{chat.intent.name}}
            <span slot="subtitle">Sorry, this intent is currently unsupported :(</span>
          </q-card-title>
          <q-list>
              <q-list-header>Entities</q-list-header>
              <q-item link tag="label" v-for="(slot,value) in chat.intent.entities" :key="slot">
                <q-item-main :label="value" />
                <q-item-side right>
                  <big>{{slot}}</big>
                </q-item-side>
              </q-item>
          </q-list>

        </q-card>
      </div>
    </div>

    <q-page-sticky position="bottom" class="chat-input-sticky">
      <q-toolbar class="chat-input-toolbar bg-grey-3 shadow-up-3">
        <q-input ref="input" v-model="text" class="full-width" :placeholder="inputPlaceholder" :after="inputAfter" @keyup="keyUp" />
      </q-toolbar>
    </q-page-sticky>

    <speech-button v-on:start="startSpeech"
                   v-on:end="endSpeech"
                   v-on:result="speechFinalResult"
                   v-on:interimresult="speechInterimResult"
                   v-on:error="resetSpeech"></speech-button>
  </q-page>
</template>

<style lang="stylus">
@import '~variables'

.chat-input-sticky > span
  width 100%
.chat-input-toolbar
  width 100%
  padding 15px

.chat-area
  padding-bottom 64px
  @media (min-width $breakpoint-xs-min)
    .q-card
      width $card-min-width
  @media (max-width $breakpoint-xs-max)
    .q-card
      width calc(100% - 20px)
.chat-input-toolbar
  input
    margin-right 34px
    z-index 2
  .q-icon
    position absolute
    right 0
.q-message-avatar
  min-width 48px !important
</style>

<script>
import { date } from 'quasar'
import HbCard from 'components/HbCard.vue'
import SpeechButton from 'components/speech/SpeechButton.vue'

import '@accentdotai/recorderjs'

export default {
  name: 'PageChat',
  components: {
    HbCard,
    SpeechButton
  },
  data () {
    return {
      text: '',
      chats: [
        {
          messages: [],
          card: false,
          finished: false
        }
      ],
      inputAfter: [{
        icon: 'arrow_send',
        content: true,
        handler: this.send
      }],
      showPWAPrompt: false,
      inputPlaceholder: 'Ask me about your home'
    }
  },
  created () {
    // this.$http.interceptors.request.use(function (config) {
    //   return config
    // })

    const vm = this

    // this.$q.events.$on('chat-send', this.chatReceived)

    if (this.$route.redirectedFrom && this.$route.redirectedFrom.indexOf('/notification#') === 0) {
      var notificationData = this.$route.redirectedFrom.replace('/notification#', '')
      this.pushNotificationReceived({ data: notificationData })
      return
    }

    this.$http.get('/rest/habot/greet').then(function (response) {
      vm.$store.commit('setLang', response.data.language)
      if (!vm.language) {
        vm.language = 'en'
      }
      vm.chats[0].messages.push({
        id: new Date(),
        name: 'HABot',
        text: [response.data.answer],
        avatar: 'statics/icons/icon-192x192.png',
        stamp: date.formatDate(new Date(), 'HH:mm')
      })
    }).catch(function (error) {
      vm.chats[0].messages.push({
        id: new Date(),
        name: 'HABot',
        text: [JSON.stringify(error)],
        avatar: 'statics/icons/icon-192x192.png',
        bgColor: 'red',
        stamp: date.formatDate(new Date(), 'HH:mm')
      })
    })

    if (this.$q.platform.is.chrome && this.$q.platform.is.android &&
        window.matchMedia && !window.matchMedia('(display-mode: standalone)').matches) {
      this.showPWAPrompt = true
    }
  },
  mounted () {
    // if (this.$q.platform.is.iphone) {
    //   (new MutationObserver(this.scrollToBottom)).observe(this.$el, {childList: true, subtree: true})
    //   console.log('enabled the MutationObserver (platform is iPhone)')
    // }
    if (navigator.serviceWorker) {
      navigator.serviceWorker.addEventListener('message', this.pushNotificationReceived)
    }
  },
  methods: {
    pushNotificationReceived (ev) {
      var currentChat = this.chats[this.chats.length - 1]
      if (currentChat.finished) {
        this.chats.push({
          messages: [],
          card: null,
          finished: false
        })
        currentChat = this.chats[this.chats.length - 1]
      }

      currentChat.messages.push({
        id: new Date(),
        name: 'HABot',
        text: [ev.data],
        avatar: 'statics/icons/icon-192x192.png',
        stamp: date.formatDate(new Date(), 'HH:mm')
      })
    },

    send () {
      var currentChat = this.chats[this.chats.length - 1]
      currentChat.messages.push({
        id: new Date(),
        name: 'You',
        text: [this.text],
        avatar: 'statics/avatar.png',
        sent: true,
        stamp: date.formatDate(new Date(), 'HH:mm')
      })

      this.$http.post('/rest/habot/chat', this.text, {
        headers: {
          'Content-Type': 'text/plain',
          'Accept-Language': this.language
        }
      }).then((response) => {
        if (response.data.answer) {
          currentChat.messages.push({
            id: new Date(),
            name: 'HABot',
            text: (response.data.hint) ? [response.data.answer, response.data.hint] : [response.data.answer],
            avatar: 'statics/icons/icon-192x192.png',
            stamp: date.formatDate(new Date(), 'HH:mm')
          })
        }

        if (response.data.card) {
          currentChat.card = response.data.card
          if (!currentChat.card.uid) {
            currentChat.card.config = { bigger: true }
          }
        }

        currentChat.finished = true
        this.chats.push({
          messages: [],
          card: null,
          finished: false
        })

        currentChat.intent = response.data.intent
      }).catch(function (error) {
        currentChat.messages.push({
          id: new Date(),
          name: 'HABot',
          text: [(error.data) ? error.data : (error.statusText) ? error.statusText : JSON.stringify(error.data)],
          avatar: 'statics/icons/icon-192x192.png',
          bgColor: 'red',
          stamp: date.formatDate(new Date(), 'HH:mm')
        })
      })

      this.text = ''
      if (this.$q.platform.is.mobile) {
        // force hide the virtual keyboard
        this.$refs.input.blur()
      }
    },

    keyUp (event) {
      if (event.keyCode === 13) {
        this.send()
        if (this.$q.platform.is.mobile) {
          // force hide the virtual keyboard
          event.currentTarget.blur()
        }
      }
    },

    onChatAreaResized (size) {
      this.scrollToBottom()
    },

    scrollToBottom () {
      var appEl = document.getElementById('q-app')
      appEl.scrollTop = appEl.scrollHeight
      document.body.scrollTop = document.body.scrollHeight
    },

    startSpeech () {
      this.inputPlaceholder = 'Speak now...'
    },
    endSpeech () {
      this.resetSpeech()
    },
    speechInterimResult (result) {
      if (result) {
        this.inputPlaceholder = result
      }
    },
    speechFinalResult (result) {
      this.text = result
      this.send()
      this.resetSpeech()
    },
    resetSpeech () {
      this.inputPlaceholder = 'Ask me about your home'
    }
  },
  beforeDestroyed () {
    this.$q.events.$off('chat-send', this.chatReceived)
    if (navigator.serviceWorker) {
      navigator.serviceWorker.removeEventListener('message', this.pushNotificationReceived)
    }
  }
}
</script>
