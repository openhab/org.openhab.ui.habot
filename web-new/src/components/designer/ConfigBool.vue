<template>
  <q-toggle :value="value" @input="$emit('input', $event)"></q-toggle>
</template>

<script>
export default {
  name: 'ConfigBool',
  props: ['value']
}
</script>
