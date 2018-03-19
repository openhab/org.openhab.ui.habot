<template>
  <chart :options="options" auto-resize></chart>
</template>

<style lang="stylus">
.echarts
  width 100%
  height 100%

.chart-tooltip-date
  font-weight bold

.chart-tooltip-dot
  display inline
  width 40px
  height 8px
  border-radius 4px
</style>

<script>

// import ECharts modules manually to reduce bundle size
import echarts from 'echarts/lib/echarts'
import 'echarts/lib/chart/line'
import 'echarts/lib/component/tooltip'
import 'echarts/lib/component/dataZoom'

import ECharts from 'vue-echarts/components/ECharts'

import { sprintf } from 'sprintf-js'

export default {
  props: ['items', 'period', 'startTime', 'endTime'],
  components: {
    'chart': ECharts
  },
  methods: {
    formatTooltip (params) {
      let tooltip = `<div class="chart-tooltip-date">${params[0].axisValueLabel}</div>`
      for (let serie of params) {
        let pattern = this.itemFormats[serie.seriesIndex]
        let label = (pattern) ? sprintf(pattern, serie.value[1]) : Math.round(parseFloat(serie.value[1])).toString
        tooltip += `<div class="chart-tooltip-series"><span class="chart-tooltip-dot" style="background-color: ${serie.color}">&nbsp;</span> ${serie.seriesName}: ${label}</div>`
      }
      // debugger
      return tooltip
    }
  },
  computed: {
    itemFormats () {
      return this.items.map((itemName) => {
        let item = this.$store.getters['items/name'](itemName)
        if (item.stateDescription.pattern) {
          return item.stateDescription.pattern
        }
      })
    },
    options () {
      return {
        startDate: this.startTime,
        animation: false,
        grid: this.defaultOptions.grid,
        xAxis: this.defaultOptions.xAxis,
        yAxis: this.defaultOptions.yAxis,
        dataZoom: this.defaultOptions.dataZoom,
        legend: {},
        tooltip: {
          formatter: this.formatTooltip,
          textStyle: {
            fontSize: 11
          }
        },
        series: this.series || []
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
              starttime: new Date(this.startTime).toISOString()
              // endtime: new Date(this.endTime).toISOString()
            }
          }).then((resp) => {
            return resp.data
          }))
        }

        return Promise.all(promises).then((data) => {
          for (let serie of data) {
            series.push({
              name: serie.name,
              type: 'line',
              // smooth: true,
              showSymbol: false,
              symbol: 'circle',
              symbolSize: 5,
              // sampling: 'average',
              stack: 'a',
              data: serie.data.map((datapoint) => {
                return [
                  new Date(datapoint.time),
                  datapoint.state
                ]
              })
            })
          }

          return series
        })
      }
    }
  },
  data () {
    var base = +new Date(2016, 9, 3)
    var oneDay = 1 * 3600 * 1000
    var valueBase = Math.random() * 300
    var valueBase2 = Math.random() * 50
    var data1 = []
    var data2 = []

    for (var i = 1; i < 10; i++) {
      var now = new Date(base += oneDay)
      // var dayStr = [now.getFullYear(), now.getMonth() + 1, now.getDate()].join('-')

      valueBase = Math.round((Math.random() - 0.5) * 20 + valueBase)
      valueBase <= 0 && (valueBase = Math.random() * 300)
      data1.push([now, valueBase])

      valueBase2 = Math.round((Math.random() - 0.5) * 20 + valueBase2)
      valueBase2 <= 0 && (valueBase2 = Math.random() * 50)
      data2.push([now, valueBase2])
    }

    return {
      itemNames: null,
      defaultOptions: {
        animation: true,
        tooltip: {
          // triggerOn: 'none'
        },
        // toolbox: {
        //   left: 'center',
        //   itemSize: 25,
        //   top: 55,
        //   feature: {
        //     dataZoom: {
        //       yAxisIndex: 'none'
        //     },
        //     restore: {}
        //   }
        // },
        xAxis: {
          type: 'time',
          // boundaryGap: [0, 0],
          axisPointer: {
            show: true,
            snap: true,
            lineStyle: {
              color: '#4c9ffb',
              opacity: 0.5,
              width: 2
            },
            label: {
              show: true,
              formatter: function (params) {
                return echarts.format.formatTime('dd.MM.yyyy hh:mm', params.value)
              },
              backgroundColor: '#4c9ffb'
            },
            handle: {
              show: this.$q.platform.is.mobile,
              color: '#4c9ffb'
            }
          },
          splitLine: {
            show: true
          }
        },
        yAxis: {
          type: 'value',
          axisTick: {
            inside: false
          },
          splitLine: {
            show: true
          },
          axisLabel: {
            inside: false,
            formatter: '{value} °C\n'
          }
          // z: 10
        },
        grid: {
          top: 15,
          left: 40,
          right: 35,
          bottom: 75
          // height: 160
        },
        // dataZoom: [{
        //   type: 'slider',
        //   throttle: 50
        // }],
        dataZoom: [{
          type: 'inside'
        }, {
          handleIcon: 'M10.7,11.9v-1.3H9.3v1.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4v1.3h1.3v-1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7V23h6.6V24.4z M13.3,19.6H6.7v-1.4h6.6V19.6z',
          handleSize: '80%',
          handleStyle: {
            color: '#fff',
            shadowBlur: 3,
            shadowColor: 'rgba(0, 0, 0, 0.6)',
            shadowOffsetX: 2,
            shadowOffsetY: 2
          }
        }],
        series: [
          {
            name: 'series1',
            type: 'line',
            smooth: true,
            symbol: 'circle',
            symbolSize: 5,
            sampling: 'average',
            // itemStyle: {
            //   normal: {
            //     color: '#8ec6ad'
            //   }
            // },
            stack: 'a',
            // areaStyle: {
            //   normal: {
            //     color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
            //       offset: 0,
            //       color: '#8ec6ad'
            //     }, {
            //       offset: 1,
            //       color: '#ffe'
            //     }])
            //   }
            // },
            data: data1
          },
          {
            name: 'series2',
            type: 'line',
            smooth: true,
            stack: 'a',
            symbol: 'circle',
            symbolSize: 5,
            sampling: 'average',
            // itemStyle: {
            //   normal: {
            //     color: '#d68262'
            //   }
            // },
            // areaStyle: {
            //   normal: {
            //     color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
            //       offset: 0,
            //       color: '#d68262'
            //     }, {
            //       offset: 1,
            //       color: '#ffe'
            //     }])
            //   }
            // },
            data: data2
          }

        ]
      }
    }
  }
}
</script>
