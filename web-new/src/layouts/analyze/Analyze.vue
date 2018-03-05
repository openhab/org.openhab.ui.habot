<template>
  <q-modal-layout>
    <q-toolbar slot="header">
      <q-btn
        flat
        round
        dense
        v-close-overlay
        icon="arrow_back"
      />
      <q-toolbar-title>
        Analyze
      </q-toolbar-title>
    </q-toolbar>

    <q-toolbar slot="header">
    <!-- <q-btn
      color="secondary"
      style="width:200px;"
      @click="showChart = true"
    >Show chart</q-btn> -->
    </q-toolbar>

    <!-- <q-toolbar slot="footer">
      <q-toolbar-title>
        Tools
      </q-toolbar-title>
    </q-toolbar> -->

    <div class="fit q-pa-md">
      <chart ref="chart" v-if="showChart" class="fit-chart"></chart>
    </div>
  </q-modal-layout>
</template>

<style lang="stylus" scoped>
.fit-chart
  width 100%
  height 100%
</style>

<script>
export default {
  components: {
    'chart': () => import(
      /* webpackChunkName: 'chart' */
      'components/charts/Chart.vue') // lazy load the component with its dependencies (echart)
  },
  props: ['model'],
  data () {
    return {
      showChart: false
    }
  },
  methods: {
    initChart () {
      this.showChart = true
    }
  }
}
</script>
