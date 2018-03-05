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
      console.log('switch: onchange to ' + val)
      this.$store.dispatch('items/sendCmd', { itemName: this.model.config.item, command: val })
    }
  },
  computed: {
    item () {
      return this.$store.getters['items/name'](this.model.config.item)
    },
    itemState: {
      get () {
        console.log('switch getter')
        let state = this.$store.getters['items/itemState'](this.model.config.item)
        if (state === 'ON' || state === 'OFF') return state
        if (this.item.type === 'Dimmer') {
          console.log('%c updating dimmer switch to ' + ((parseFloat(state) > 0) ? 'ON' : 'OFF'), 'color:blue')
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
