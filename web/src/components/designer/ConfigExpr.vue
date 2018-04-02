<template>
  <q-input :value="value" @input="$emit('input', $event)" color="secondary" :error="isError" :float-label="exprError" prefix="="></q-input>
</template>

<script>
export default {
  name: 'ConfigExpr',
  props: ['value'],
  computed: {
    isError () {
      if (!this.value) return false
      return (this.exprResult && this.exprResult.toString().indexOf('Error') === 0) || (this.exprResult !== true && this.exprResult !== false)
    },
    exprError () {
      if (!this.value) return ''
      if (this.exprResult === undefined || this.exprResult === null) {
        return 'Result indetermined'
      }
      if (this.exprResult && this.exprResult.toString().indexOf('Error:') === 0) {
        return this.exprResult.toString()
      }
      if (this.exprResult !== true && this.exprResult !== false) {
        return 'Result not boolean: ' + this.exprResult.toString()
      }
      return 'OK - result is ' + this.exprResult.toString()
    }
  },
  asyncComputed: {
    exprResult () {
      if (!this.value) return ''
      return this.$expr('=' + this.value)
    }
  }
}
</script>
