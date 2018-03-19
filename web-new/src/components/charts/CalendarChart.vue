<template>
  <chart v-if="items.length === 1" :options="finalOptions" auto-resize></chart>
  <div v-else-if="items.length > 1">The calendar supports only one item. Select a single item.</div>
</template>

<script>
import echarts from 'echarts/lib/echarts'
import 'echarts/lib/chart/heatmap'
import 'echarts/lib/component/tooltip'
import 'echarts/lib/component/calendar'
import 'echarts/lib/component/visualMap'

import ECharts from 'vue-echarts/components/ECharts'

import mixin from './index'

import { sprintf } from 'sprintf-js'

export default {
  props: ['items', 'type', 'startTime', 'endTime', 'options'],
  mixins: [mixin],
  components: {
    'chart': ECharts
  },
  methods: {
    formatTooltip (params) {
      let tooltip = `<div class="chart-tooltip-date">${echarts.format.formatTime('dd.MM.yyyy hh:mm', params.data[0])}</div>`
      let name = this.itemLabels[0]
      let pattern = this.itemFormats[0]
      let value = (pattern) ? sprintf(pattern, params.data[1]) : Math.round(parseFloat(params.data[1]))
      tooltip += `<div class="chart-tooltip-series">${name}: ${value}</div>`
      // debugger
      return tooltip
    }
  },
  computed: {
    maxValue () {
      return (this.series) ? Math.max(...this.series[0].data.map(d => d[1])) : null
    },
    minValue () {
      return (this.series) ? Math.min(...this.series[0].data.map(d => d[1])) : null
    },
    finalOptions () {
      return {
        tooltip: {
          formatter: this.formatTooltip,
          textStyle: {
            fontSize: 11
          }
        },
        visualMap: {
          show: this.options.showVisualMap,
          min: Math.floor(this.minValue),
          max: Math.ceil(this.maxValue),
          type: 'continuous',
          orient: 'horizontal',
          left: 'center',
          top: 0,
          realtime: false,
          calculable: true,
          textStyle: {
            color: '#000'
          }
        },
        calendar: {
          top: (this.options.showVisualMap) ? 80 : 30,
          left: 30,
          right: 30,
          cellSize: ['auto', 'auto'],
          range: [
            echarts.format.formatTime('yyyy-MM-dd', this.startTime),
            echarts.format.formatTime('yyyy-MM-dd', this.endTime)
          ],
          orient: (this.options.vertical) ? 'vertical' : 'horizontal',
          dayLabel: {
            firstDay: 1,
            margin: 5
          },
          monthName: {
            margin: 5
          },
          itemStyle: {
            normal: {borderWidth: 0.5}
          },
          yearLabel: {show: false}
        },
        series: this.series /* {
          type: 'heatmap',
          coordinateSystem: 'calendar',
          data: this.getVirtualData(2016)
        } */
      }
    }
  },
  asyncComputed: {
    series: {
      get () {
        // let vm = this
        let series = []

        let promises = []
        for (let item of this.items) {
          promises.push(this.$http.get('/rest/persistence/items/' + item, {
            params: {
              starttime: new Date(this.startTime).toISOString(),
              endtime: new Date(this.endTime).toISOString()
            }
          }).then((resp) => {
            return resp.data
          }))
        }

        return Promise.all(promises).then((data) => {
          for (let serie of data) {
            series.push({
              type: 'heatmap',
              coordinateSystem: 'calendar',
              data: serie.data.map((datapoint) => {
                return [
                  new Date(datapoint.time),
                  parseFloat(datapoint.state)
                ]
              })
            })
          }

          return series
        })
      }
    }
  }
}
</script>
