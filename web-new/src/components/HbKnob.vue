<template>
  <q-knob v-model="itemState"
    :color="model.config.color || undefined"
    :trackColor="model.config.trackColor || undefined"
    :size="model.config.size || undefined"
    :min="model.config.min ? parseFloat(model.config.min) : undefined"
    :max="model.config.max ? parseFloat(model.config.max) : undefined"
    :step="model.config.step ? parseFloat(model.config.step) : undefined"
    :lineWidth="model.config.lineWidth ? parseInt(model.config.lineWidth) : undefined"
  >
</q-knob>
</template>

<style lang="stylus">

</style>

<script>
export default {
  props: ['model'],
  data () {
    return {
      wait: false,
      size: (this.model.config.size) ? parseInt(this.model.config.size) : undefined
    }
  },
  computed: {
    itemState: {
      get () {
        if (this.wait) return this.next
        return parseFloat(this.$store.getters['items/itemState'](this.model.config.item)) || 0
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
    }
  }
}

</script>
