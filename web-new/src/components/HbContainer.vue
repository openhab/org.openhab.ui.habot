<template>
  <div :class="this.model.config.classes">
    <span v-if="this.model.config.text">{{text}}</span>
    <component :is="component.component" v-for="(component, idx) in model.slots.main" :model="component" :key="'container-' + idx" />
  </div>
</template>

<script>
import HbComponents from 'components/index'

export default {
  name: 'HbContainer',
  props: ['model'],
  components: HbComponents,
  asyncComputed: {
    text () {
      return this.$expr(this.model.config.text)
    }
  }
}
</script>
