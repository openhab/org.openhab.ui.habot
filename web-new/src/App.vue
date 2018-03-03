<template>
  <div id="q-app">
    <transition
      enter-active-class="animated fadeIn"
      leave-active-class="animated fadeOut"
      mode="out-in"
      :duration="100"
    >
      <router-view />
    </transition>
    <!-- <router-view /> -->
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style lang="stylus">

</style>
