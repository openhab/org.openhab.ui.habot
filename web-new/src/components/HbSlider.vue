<template>
  <q-slider v-model="itemState" :color="color" :size="model.config.size" :min="min" :max="max" :step="step"></q-slider>
</template>

<script>
export default {
  props: ['model'],
  data () {
    return {
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
    item () {
      return this.$store.getters['items/name'](this.model.config.item)
    },
    min () {
      return (this.model.config.min || 0)
    },
    max () {
      return (this.model.config.max || 100)
    },
    step () {
      return (this.model.config.step || 1)
    },
    color () {
      return this.wait ? 'secondary' : 'primary'
    },
    itemState: {
      get () {
        if (this.wait) return this.next
        let state = this.$store.getters['items/itemState'](this.model.config.item)
        if (state === 'OFF') return this.min
        if (state === 'ON') return this.max
        if (this.item.type === 'Color' && state.split(',').length === 3) {
          return parseFloat(state.split(',')[2])
        }
        return parseFloat(state)
      },
      set (val) {
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
  }
}

</script>
