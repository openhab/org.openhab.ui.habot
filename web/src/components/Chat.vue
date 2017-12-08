<template>
  <div class="layout-padding" style="max-width: 600px; margin-top: 100px; padding-top: 60px;">
    <div class="chat-area" v-for="chat in chats" :key="chat" ref="chat">



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

      <hb-card v-if="chat.card && chat.card.name === 'HbCard'" :model="chat.card">

      </hb-card>

      <q-card v-if="chat.card && chat.card.name === 'HbDumpIntentCard'">
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

      <!-- <q-chat-message
        name="Vladimir"
        avatar="statics/icons/icon-192x192.png"
      >
        <q-spinner-dots size="2rem" />
      </q-chat-message>-->

      <!-- <q-card v-if="chat.card" inline class="bigger">
        <q-card-title>
          Test Card
          <span slot="subtitle">Subtitle</span>
        </q-card-title>

        <q-list>
            <q-list-header>Radios</q-list-header>
            <q-item link tag="label">
              <q-item-side>
                <q-radio v-model="option" val="opt1" />
              </q-item-side>
              <q-item-main label="Option 1" />
            </q-item>

          <q-item-separator />
          <q-list-header>Ranges</q-list-header>
          <q-item>
            <q-item-side icon="volume_down" />
            <q-item-main>
              <q-slider v-model="range" :min="0" :max="50" label />
            </q-item-main>
            <q-item-side right icon="volume_up" />
          </q-item>
          <q-item>
            <q-item-side icon="volume_down" />
            <q-item-main>
              <q-slider v-model="range" :min="0" :max="50" label color="amber" />
            </q-item-main>
            <q-item-side right icon="volume_up" />
          </q-item>
          <q-item>
            <q-item-side icon="monetization_on" />
            <q-item-main>
              <q-range v-model="doubleRange" :min="0" :max="50" label color="secondary" />
            </q-item-main>
          </q-item>          
        </q-list>

        <q-card-separator />
        <q-card-actions>
          <q-btn flat>Action 1</q-btn>
          <q-btn flat>Action 2</q-btn>
        </q-card-actions>
      </q-card> -->
    </div>


  </div>

  <!-- <q-toolbar slot="footer" class="chat-input bg-grey-3">
    <q-input ref="input" v-model="text" class="full-width" placeholder="Ask me about your home" :after="inputAfter" @keyup="keyUp" />
  </q-toolbar> -->
</template>

<script>
import {
  date,
  Events,
  QLayout,
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
  QSpinnerDots
} from 'quasar'

import HbCard from '@/cards/HbCard.vue'

export default {
  components: {
    QLayout,
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
    QChatMessage,
    QSpinnerDots,
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
      range: 20,
      doubleRange: {
        min: 10,
        max: 35
      },
      option: 'opt1',
      inputAfter: [{
        icon: 'arrow_send',
        content: true,
        handler: this.send
      }],
      language: null
    }
  },
  created () {
    // this.$http.interceptors.request.use(function (config) {
    //   return config
    // })

    const vm = this

    this.chatReceived = (text) => {
      this.text = text
      this.send()
    }

    this.$q.events.$on('chat-send', this.chatReceived)

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
    (new MutationObserver(e => {
      var appEl = document.getElementById('q-app')
      appEl.scrollTop = appEl.scrollHeight
    })).observe(this.$el, {childList: true, subtree: true})
  },
  methods: {
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

      Events.$emit('chat-added')

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
    }
  },
  beforeDestroyed () {
    this.$q.events.$off('chat-send', this.chatReceived)
  }
}
</script>

<style lang="stylus">
.chat-area
  padding-bottom 20px
.q-card
  width 400px
.layout
  min-height auto !important
.layout-page
  min-height auto !important
.layout-footer
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
