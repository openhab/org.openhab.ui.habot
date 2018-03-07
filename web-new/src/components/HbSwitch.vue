<template>
  <q-toggle :value="itemState" true-value="ON" false-value="OFF" @input="onChange"></q-toggle>
</template>

<style lang="stylus">

</style>

<script>
export default {
  props: ['model'],
  data () {
    return {
      dimmerState: null
    }
  },
  methods: {
    onChange (val) {
      this.$store.dispatch('items/sendCmd', { itemName: this.model.config.item, command: val })
    }
  },
  computed: {
    item () {
      return this.$store.getters['items/name'](this.model.config.item)
    },
    itemState: {
      get () {
        let state = this.$store.getters['items/itemState'](this.model.config.item)
        if (state === 'ON' || state === 'OFF') return state
        if (this.item.type === 'Dimmer') {
          return (parseFloat(state) > 0) ? 'ON' : 'OFF'
        } else {
          return state
        }
      }
      // set (val) {
      //   console.log('Updating switch')
      //   this.$store.dispatch('items/sendCmd', { itemName: this.model.config.item, command: val })
      // }
    }
  }
}

</script>
