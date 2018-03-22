<template>
  <q-slider ref="slider" v-model="itemState" :color="color"
            :min="parseFloat(model.config.min) || defaultMin" :max="parseFloat(model.config.max) || defaultMax" :step="parseFloat(model.config.step) || defaultStep"
            :snap="model.config.snap" :markers="model.config.markers" :square="model.config.square"
            :label="model.config.label" :label-always="model.config.labelAlways" :label-value="label"
            :fill-handle-always="model.config.fillHandleAlways"
  ></q-slider>
</template>

<script>
export default {
  props: ['model'],
  data () {
    let item = this.$store.getters['items/name'](this.model.config.item)
    /* min/step/values considered in that order:
       1. explicit component config (model.config)
       2. those items tags: habot:slider:min:<value>, habot:slider:max:<value>, habot:slider:step:<value>
       3. values found in the item's stateDescription
       4. defaults (min=0, max=100, step=1)
    */
    let min
    if (!min && item && item.tags.find(t => t.indexOf('habot:slider:min:') === 0)) {
      min = parseFloat(item.tags.find(t => t.indexOf('habot:slider:min:') === 0).split(':')[3])
    }
    if (!min && item && item.stateDescription && item.stateDescription.minimum) {
      min = item.stateDescription.minimum
    }
    if (!min) min = 0

    let max
    if (!max && item && item.tags.find(t => t.indexOf('habot:slider:max:') === 0)) {
      max = parseFloat(item.tags.find(t => t.indexOf('habot:slider:max:') === 0).split(':')[3])
    }
    if (!max && item && item.stateDescription && item.stateDescription.maximum) {
      max = item.stateDescription.minimum
    }
    if (!max) max = 100

    let step
    if (!step && item && item.tags.find(t => t.indexOf('habot:slider:step:') === 0)) {
      step = parseFloat(item.tags.find(t => t.indexOf('habot:slider:step:') === 0).split(':')[3])
    }
    if (!step && item && item.stateDescription && item.stateDescription.step) {
      step = item.stateDescription.step
    }
    if (!step) step = 1

    return {
      item: item,
      defaultMin: min,
      defaultMax: max,
      defaultStep: step,
      wait: false,
      prev: null,
      next: null
    }
  },
  methods: {
    sendCmd (val) {
      this.$store.dispatch('items/sendCmd', { itemName: this.model.config.item, command: this.next.toString(), updateState: true })
    }
  },
  computed: {
    itemState: {
      get () {
        if (!this.item) return
        if (this.wait) return this.next
        let state = this.$store.getters['items/itemState'](this.model.config.item, true)
        if (state === 'OFF') return this.min
        if (state === 'ON') return this.max
        if (this.item.type === 'Color' && state.split(',').length === 3) {
          return parseFloat(state.split(',')[2])
        }
        return parseFloat(state)
      },
      set (val) {
        if (!this.item) return
        this.next = val
        if (this.wait) return
        this.wait = true
        this.sendCmd(val)
        setTimeout(() => {
          this.wait = false
          setTimeout(() => { this.sendCmd(val) })
        }, 500)
      }
    }
  },
  asyncComputed: {
    color () {
      if (!this.model.config.color && this.item && this.item.tags && this.item.tags.find(t => t.indexOf('habot:slider:color:') === 0)) {
        return this.item.tags.find(t => t.indexOf('habot:slider:color:') === 0).split(':')[3]
      }
      return this.$expr(this.model.config.color)
    },
    label () {
      if (!this.model.config.labelValue) return
      return this.$expr(this.model.config.labelValue, { state: (this.$refs.slider) ? this.$refs.slider.model : this.itemState })
    }
  }
}

</script>
