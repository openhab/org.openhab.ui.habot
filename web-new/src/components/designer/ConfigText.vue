<template>
  <q-input :value="value" @input="$emit('input', $event)"></q-input>
</template>

<script>
export default {
  name: 'ConfigText',
  props: ['value']
}
</script>
