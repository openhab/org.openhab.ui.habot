<template>
  <big class="big-value">{{state}}</big>
</template>

<style lang="stylus">
@import '~variables'
.big-value
  font-weight 300
  color black
  font-size 200%
  vertical-align middle
</style>

<script>
export default {
  name: 'HbSingleItemValue',
  props: [ 'model' ],
  computed: {
    state: {
      get () {
        if (this.model.config.item) {
          return this.$store.getters['items/itemState'](this.model.config.item)
        }
      }
    }
  }
}
</script>
