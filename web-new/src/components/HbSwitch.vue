<template>
  <q-toggle v-model="itemState" true-value="ON" false-value="OFF"></q-toggle>
</template>

<style lang="stylus">

</style>

<script>
export default {
  props: ['model'],
  computed: {
    itemState: {
      get () {
        return this.$store.getters['items/itemState'](this.model.item)
      },
      set (val) {
        this.$store.dispatch('items/sendCmd', { itemName: this.model.item, command: val })
      }
    }
  }
}

</script>
