<template>
  <q-btn flat icon="timeline" label="Analyze" @click="showAnalyzer = true">
    <q-modal v-model="showAnalyzer" :content-css="{minWidth: '80vw', minHeight: '80vh'}" @show="opened()" maximized>
      <analyze ref="analyzer"></analyze>
    </q-modal>
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
    opened () {
      this.$refs.analyzer.initChart()
    }
  }
}
</script>
