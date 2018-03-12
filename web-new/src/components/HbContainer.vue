<template>
  <div :class="this.model.config.classes">
    <component :is="component.component" v-for="(component, idx) in model.slots.main" :model="component" :key="'container-' + idx" />
  </div>
</template>

<script>
import HbComponents from 'components/index'

export default {
  name: 'HbContainer',
  props: ['model'],
  components: HbComponents
}
</script>
