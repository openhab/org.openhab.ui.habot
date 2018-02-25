<template>
<q-card inline class="bigger">
  <q-card-media v-if="model.imageUri">
    <img :src="model.imageUri" />
  </q-card-media>
  <q-card-title>
    <span>{{model.title}}</span>
    <span v-if="model.subtitle" slot="subtitle">{{model.subtitle}}</span>
    <div slot="right" v-if="model.slots && model.slots.right">
      <div v-for="component in model.slots.right" :key="component">
        <big v-if="component.component == 'HbSingleItemValue'" class="big-value">{{component.config.state}}</big>
      </div>
    </div>
  </q-card-title>
  <q-card-main v-if="model.slots && model.slots.main">
    <component :is="component.component" v-for="component in model.slots.main" :key="component" :model="component"></component>
  </q-card-main>
  <hb-list v-if="model.slots && model.slots.list && model.slots.list[0].component === 'HbList'" :model="model.slots.list[0]" />
</q-card>

</template>

<style lang="stylus">
.big-value
  font-weight 300
  color black
  font-size 200%
</style>

<script>

import HbList from 'components/HbList.vue'
import HbSwitch from 'components/HbSwitch.vue'
import HbKnob from 'components/HbKnob.vue'
import HbSlider from 'components/HbSlider.vue'

export default {
  components: {
    HbList,
    HbSwitch,
    HbKnob,
    HbSlider
  },
  props: ['model'],
  data () {
    return {
    }
  }
}
</script>
