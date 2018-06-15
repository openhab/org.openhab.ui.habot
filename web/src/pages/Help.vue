<template>
  <div class="q-full-width q-ma-lg center">
    <div class="flex flex-center">
      <q-chat-message
        avatar="statics/icons/icon-192x192.png"
        :text="['Welcome to Help!', 'Select a topic below:']"
      />
    </div>
    <hr class="text-grey">
    <h5 class="q-body text-grey">Essential information</h5>
    <div class="row">
      <help-topic title="Meet HABot" subtitle="Get to know HABot and discover what it can do" topic="getting-started" @launch="launch" />
      <!-- <help-topic title="Tag your items" subtitle="Learn how to prepare your openHAB items for HABot" topic="tagging-items" @launch="launch" /> -->
      <help-topic title="Get the full experience" subtitle="Make sure you get all the features of this web app" topic="enhanced-features" @launch="launch" />
    </div>
    <h5 class="q-body text-grey">Work with cards</h5>
    <q-modal v-model="modal" maximized>
      <component :is="currentTopic" @close="close" @go="launch" @done="close(true)" />
    </q-modal>
  </div>
</template>

<script>
import HelpTopic from 'components/help/HelpTopic.vue'
import GettingStarted from 'layouts/help/GettingStarted.vue'
// import TaggingItems from 'layouts/help/TaggingItems.vue'
import EnhancedFeatures from 'layouts/help/EnhancedFeatures.vue'

export default {
  components: {
    HelpTopic,
    GettingStarted,
    // TaggingItems,
    EnhancedFeatures
  },
  data () {
    return {
      modal: false,
      currentTopic: null,
      colors: [
        'primary',
        'secondary',
        'yellow',
        'red',
        'orange',
        'grey-2'
      ]
    }
  },
  created () {
    if (this.$route.query.topic) {
      this.launch(this.$route.query.topic)
    }
  },
  methods: {
    launch (topic) {
      this.currentTopic = topic
      this.modal = true
    },
    close () {
      this.modal = false
    }
  }
}
</script>
