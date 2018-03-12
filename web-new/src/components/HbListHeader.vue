<template>
  <q-list-header :inset="this.model.config.inset">{{label}}</q-list-header>
</template>

<script>
export default {
  name: 'HbListHeader',
  props: ['model'],
  asyncComputed: {
    label: {
      get () {
        return this.$expr(this.model.config.label)
      }
    }
  }
}
</script>
