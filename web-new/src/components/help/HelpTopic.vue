<template>
  <div class="col-md">
    <q-card class="help-topic">
      <q-card-title>
        {{title}}
        <span slot="subtitle">{{subtitle}}</span>
      </q-card-title>
      <q-card-actions>
        <q-btn flat color="secondary" icon="play_arrow" @click="$emit('launch', topic)" label="View" />
      </q-card-actions>
    </q-card>
  </div>
</template>

<style lang="stylus" scoped>
.help-topic
  margin 10px
  // height 100px
</style>

<script>
export default {
  props: ['title', 'subtitle', 'topic']
}
</script>
