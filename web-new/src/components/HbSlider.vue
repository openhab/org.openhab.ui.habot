<template>
  <q-slider v-model="itemState" :color="model.config.color" :size="model.config.size" :min="model.config.min" :max="model.config.max" :step="model.config.step"></q-slider>
</template>

<script>
export default {
  props: ['model'],
  data () {
    return {
      wait: false
    }
  },
  computed: {
    itemState: {
      get () {
        if (this.wait) return this.next
        return parseFloat(this.$store.getters['items/itemState'](this.model.config.item))
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
  }
}

</script>
