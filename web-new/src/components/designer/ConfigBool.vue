<template>
  <q-toggle :value="value" @input="$emit('input', $event)" color="secondary"></q-toggle>
</template>

<script>
export default {
  name: 'ConfigBool',
  props: ['value']
}
</script>
