<template>
  <q-page padding class="row justify-center">

    <div style="width: 600px; margin-top: 100px;">
      <div class="chat-area" v-for="chat in chats" :key="chat" ref="chat">
        <q-resize-observable @resize="scrollToBottom"></q-resize-observable>
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

        <hb-card v-if="chat.card && chat.card.component === 'HbCard'" :model="chat.card">

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
        <q-input ref="input" v-model="text" class="full-width" placeholder="Ask me about your home" :after="inputAfter" @keyup="keyUp" />
      </q-toolbar>
    </q-page-sticky>

  </q-page>
</template>

<style lang="stylus">
.chat-input-sticky > span
  width 100%
.chat-input-toolbar
  width 100%
  padding 15px

.chat-area
  padding-bottom 40px
.q-card
  width 400px
.chat-input-toolbar
  input
    margin-right 34px
    z-index 2
  .q-icon
    position absolute
    right 0
@media (max-width 575px)
  .q-card
    width calc(100% - 20px)
</style>

<script>
import { date } from 'quasar'
import HbCard from 'components/HbCard.vue'

export default {
  name: 'PageChat',
  components: {
    HbCard
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
      }]
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
      vm.language = response.data.language
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
  },
  mounted () {
    (new MutationObserver(this.scrollToBottom)).observe(this.$el, {childList: true, subtree: true})
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
            text: [response.data.answer], // [JSON.stringify(response.data)],
            avatar: 'statics/icons/icon-192x192.png',
            stamp: date.formatDate(new Date(), 'HH:mm')
          })
        }

        if (response.data.card) {
          currentChat.card = response.data.card
          currentChat.finished = true
          this.chats.push({
            messages: [],
            card: null,
            finished: false
          })
        }

        currentChat.intent = response.data.intent
      }).catch(function (error) {
        currentChat.messages.push({
          id: new Date(),
          name: 'HABot',
          text: [JSON.stringify(error)],
          avatar: 'statics/icons/icon-192x192.png',
          bgColor: 'red',
          stamp: date.formatDate(new Date(), 'HH:mm')
        })
      })

      // Events.$emit('chat-added')

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
    scrollToBottom () {
      var appEl = document.getElementById('q-app')
      appEl.scrollTop = appEl.scrollHeight
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
