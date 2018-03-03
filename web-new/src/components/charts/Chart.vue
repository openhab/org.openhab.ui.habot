<template>
  <chart :options="option" auto-resize></chart>
</template>

<style>
.echarts {
  width: 100%;
  height: 100%;
}
</style>

<script>

// import ECharts modules manually to reduce bundle size
import echarts from 'echarts/lib/echarts'
import 'echarts/lib/chart/line'
import 'echarts/lib/component/tooltip'
import 'echarts/lib/component/dataZoom'

import ECharts from 'vue-echarts/components/ECharts'

export default {
  components: {
    'chart': ECharts
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
      option: {
        animation: false,
        legend: {
          top: 'bottom',
          data: ['意向']
        },
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
            value: '2016-10-7',
            snap: true,
            lineStyle: {
              color: '#004E52',
              opacity: 0.5,
              width: 2
            },
            label: {
              show: true,
              formatter: function (params) {
                return echarts.format.formatTime('yyyy-MM-dd', params.value)
              },
              backgroundColor: '#004E52'
            },
            handle: {
              show: true,
              color: '#004E52'
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
            formatter: '{value}\n'
          },
          z: 10
        },
        grid: {
          top: 30,
          left: 35,
          right: 35,
          bottom: 100
          // height: 160
        },
        // dataZoom: [{
        //   type: 'inside',
        //   throttle: 50
        // }],
        series: [
          {
            name: 'series1',
            type: 'line',
            smooth: true,
            symbol: 'circle',
            symbolSize: 5,
            sampling: 'average',
            itemStyle: {
              normal: {
                color: '#8ec6ad'
              }
            },
            stack: 'a',
            areaStyle: {
              normal: {
                color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                  offset: 0,
                  color: '#8ec6ad'
                }, {
                  offset: 1,
                  color: '#ffe'
                }])
              }
            },
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
            itemStyle: {
              normal: {
                color: '#d68262'
              }
            },
            areaStyle: {
              normal: {
                color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                  offset: 0,
                  color: '#d68262'
                }, {
                  offset: 1,
                  color: '#ffe'
                }])
              }
            },
            data: data2
          }

        ]
      }
    }
  }
}
</script>
