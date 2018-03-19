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
        {{titleDisplayText}}
      </q-toolbar-title>
      <q-btn flat icon="build" @click="showToolbar = !showToolbar"></q-btn>
    </q-toolbar>

    <q-toolbar v-if="showToolbar" slot="header">
      <q-datetime
        dark
        type="date"
        :value="startTime"
        format="ddd DD MMM"
        :max="today"
        @change="val => { startTime = val }"
      />
      <q-select :value="items"
                @input="val => { items = val }"
                :display-value="itemPickerDisplayText"
                :options="itemChoices"
                multiple filter dark />
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
      <chart ref="chart" v-if="showChart" class="fit-chart" :items="items" :period="period" :start-time="startTime" :end-time="endTime"></chart>
    </div>
  </q-modal-layout>
</template>

<style lang="stylus" scoped>
.fit-chart
  width 100%
  height 100%
</style>

<script>
const today = new Date()

export default {
  components: {
    'chart': () => import(
      /* webpackChunkName: 'chart' */
      'components/charts/Chart.vue') // lazy load the component with its dependencies (echart)
  },
  props: ['model'],
  data () {
    return {
      showToolbar: false,
      showChart: false,
      items: this.model.config.items,
      period: this.model.config.period,
      startTime: null,
      today: today,
      itemChoices: this.$store.state.items.items.map((item) => {
        return {
          value: item.name,
          label: item.name,
          sublabel: item.label,
          stamp: item.type
        }
      })
    }
  },
  methods: {
    initChart () {
      this.showChart = true
    }
  },
  created () {
    let now = new Date()
    this.startTime = now.setDate(now.getDate() - 1)
  },
  computed: {
    endTime () {
      let start = new Date(this.startTime)
      return start.setDate(start.getDate() + 1)
    },
    titleDisplayText () {
      if (!this.items || !this.items.length) return 'Analyze'
      if (this.items.length === 1) return this.items[0]
      return this.items[0] + ' + ' + (this.items.length - 1)
    },
    itemPickerDisplayText () {
      return this.items.length + ' item(s)'
    }
  }
}
</script>
