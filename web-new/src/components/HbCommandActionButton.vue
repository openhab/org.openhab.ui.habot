<template>
  <q-btn flat icon="timeline" label="Analyze" @click="sendCmd()">
  </q-btn>
</template>

<script>
import Analyze from 'layouts/analyze/Analyze.vue'

export default {
  components: {
    Analyze
  },
  data () {
    return {
      showAnalyzer: false
    }
  },
  methods: {
    sendCmd () {
      this.$store.dispatch('items/sendCmd')(this.model.config.item, this.model.config.command)
    }
  }
}
</script>
