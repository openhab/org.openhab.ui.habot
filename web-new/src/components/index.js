import Vue from 'vue'

import HbContainer from './HbContainer.vue'
import HbList from './HbList.vue'
import HbTabs from './HbTabs.vue'
import HbCollapsible from './HbCollapsible.vue'
import HbSlider from './HbSlider.vue'
import HbKnob from './HbKnob.vue'
import HbSwitch from './HbSwitch.vue'
import HbChartImage from './HbChartImage.vue'
import HbTimeline from './HbTimeline.vue'

Vue.component('HbContainer', HbContainer)
Vue.component('HbCollapsible', HbCollapsible)
Vue.component('HbKnob', HbKnob)
Vue.component('HbList', HbList)
Vue.component('HbTabs', HbTabs)
Vue.component('HbSlider', HbSlider)
Vue.component('HbSwitch', HbSwitch)
Vue.component('HbTimeline', HbTimeline)

export default {
  HbContainer,
  HbList,
  HbTabs,
  HbCollapsible,
  HbSlider,
  HbKnob,
  HbSwitch,
  HbChartImage,
  HbTimeline
}
