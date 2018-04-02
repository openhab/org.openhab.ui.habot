<template>
  <q-knob v-model="itemState" ref="knob"
    :class="{'highlight-and-fade': this.model.highlight}"
    :color="color || undefined"
    :trackColor="trackColor || undefined"
    :size="model.config.size || undefined"
    :style="{ 'font-size': this.model.config.textSize }"
    :min="parseFloat(model.config.min) || defaultMin"
    :max="parseFloat(model.config.max) || defaultMax"
    :step="parseFloat(model.config.step) || defaultStep"
    :lineWidth="model.config.lineWidth ? parseInt(model.config.lineWidth) : undefined"
  >
    <span v-if="label || iconLeft || iconRight">
      <q-icon v-if="iconLeft" :name="iconLeft" />
      <span v-if="label">{{label}}</span>
      <q-icon v-if="iconRight" :name="iconRight" />
    </span>
</q-knob>
</template>

<style lang="stylus">
</style>

<script>
export default {
  props: ['model'],
  data () {
    let item = this.$store.getters['items/name'](this.model.config.item)
    /* min/step/values considered in that order:
       1. explicit component config (model.config)
       2. those items tags: habot:knob:min:<value>, habot:knob:max:<value>, habot:knob:step:<value>
       3. values found in the item's stateDescription
       4. defaults (min=0, max=100, step=1)
    */
    let min
    if (!min && item && item.tags.find(t => t.indexOf('habot:knob:min:') === 0)) {
      min = parseFloat(item.tags.find(t => t.indexOf('habot:knob:min:') === 0).split(':')[3])
    }
    if (!min && item && item.stateDescription && item.stateDescription.minimum) {
      min = item.stateDescription.minimum
    }
    if (!min) min = 0

    let max
    if (!max && item && item.tags.find(t => t.indexOf('habot:knob:max:') === 0)) {
      max = parseFloat(item.tags.find(t => t.indexOf('habot:knob:max:') === 0).split(':')[3])
    }
    if (!max && item && item.stateDescription && item.stateDescription.maximum) {
      max = item.stateDescription.minimum
    }
    if (!max) max = 100

    let step
    if (!step && item && item.tags.find(t => t.indexOf('habot:knob:step:') === 0)) {
      step = parseFloat(item.tags.find(t => t.indexOf('habot:knob:step:') === 0).split(':')[3])
    }
    if (!step && item && item.stateDescription && item.stateDescription.step) {
      step = item.stateDescription.step
    }
    if (!step) step = 1

    return {
      wait: false,
      item: item,
      defaultMin: min,
      defaultMax: max,
      defaultStep: step,
      size: (this.model.config.size) ? parseInt(this.model.config.size) : undefined
    }
  },
  computed: {
    itemState: {
      get () {
        if (this.wait) return this.next
        return parseFloat(this.$store.getters['items/itemState'](this.model.config.item, true)) || 0
      },
      set (val) {
        this.next = val
        if (this.wait) return
        this.wait = true
        this.$store.dispatch('items/sendCmd', { itemName: this.model.config.item, command: val })
        setTimeout(() => {
          this.wait = false
          setTimeout(() => { this.$store.dispatch('items/sendCmd', { itemName: this.model.config.item, command: this.next }) })
        }, 500)
      }
    }
  },
  asyncComputed: {
    state: {
      get () {
        if (!this.model.config.state) return undefined
        return this.$expr(this.model.config.state)
      }
    },
    label () {
      if (!this.model.config.label) return (this.$refs.knob) ? this.$refs.knob.model : this.itemState
      return this.$expr(this.model.config.label, { state: (this.$refs.knob) ? this.$refs.knob.model : this.itemState })
    },
    iconLeft () {
      if (!this.model.config.iconLeft && this.item && this.item.tags && this.item.tags.find(t => t.indexOf('habot:knob:iconLeft:') === 0)) {
        return this.item.tags.find(t => t.indexOf('habot:knob:iconLeft:') === 0).split(':')[3]
      }
      return this.$expr(this.model.config.iconLeft)
    },
    iconRight () {
      if (!this.model.config.iconRight && this.item && this.item.tags && this.item.tags.find(t => t.indexOf('habot:knob:iconRight:') === 0)) {
        return this.item.tags.find(t => t.indexOf('habot:knob:iconRight:') === 0).split(':')[3]
      }
      return this.$expr(this.model.config.iconRight)
    },
    color () {
      if (!this.model.config.color && this.item && this.item.tags && this.item.tags.find(t => t.indexOf('habot:knob:color:') === 0)) {
        return this.item.tags.find(t => t.indexOf('habot:knob:color:') === 0).split(':')[3]
      }
      return this.$expr(this.model.config.color)
    },
    trackColor () {
      if (!this.model.config.trackColor && this.item && this.item.tags && this.item.tags.find(t => t.indexOf('habot:knob:trackColor:') === 0)) {
        return this.item.tags.find(t => t.indexOf('habot:knob:trackColor:') === 0).split(':')[3]
      }
      return this.$expr(this.model.config.trackColor)
    }
  }
}

</script>
