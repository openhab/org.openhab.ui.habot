<template>
  <big class="big-value">{{this.model.config.state}}</big>
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
  props: [ 'model' ]
}
</script>
