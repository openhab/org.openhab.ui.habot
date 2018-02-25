<template>
  <div>
    <div class="row filters bg-grey-2 shadow-2">
      <!-- <q-search v-model="search" color="none" class="col"></q-search> -->
      <q-select multiple filter chips color="secondary" v-model="objects" class="col-sm-6" :options="objectSet" float-label="Objects"></q-select>
      <q-select multiple filter chips color="secondary" v-model="locations" class="col-sm-6" :options="locationSet" float-label="Locations"></q-select>
    </div>
    <div class="row">
      <div class="col-sm-6 hb-cards">
        <component :is="'HbCard'" :model="cardModel"></component>
      </div>
      <div class="col-sm-6">
        <q-input
          v-model="modelJson"
          type="textarea"
          float-label="Card Model"
          :min-rows="7"
        />
      </div>

    </div>
    <q-page-sticky position="bottom-right" :offset="[18, 18]">
      <q-fab
        color="secondary"
        icon="add" direction="up">
        <q-fab-action
          color="secondary"
          @click="someMethod"
          icon="mail"
        />
        <q-fab-action
          color="secondary"
          @click="someMethod"
          icon="alarm"
        />
      </q-fab>
    </q-page-sticky>
  </div>
</template>

<style lang="stylus">
@import '~variables'

.filters
  padding 10px
  .q-select
    margin-top 5px
.hb-cards
  padding 20px
  .q-card
    width 100%
  // .bigger
  //   width 450px
  @media (max-width $breakpoint-xs-max)
    .q-card
      width 100%
      margin-left -0.25rem
</style>

<script>
import HbCard from 'components/HbCard.vue'

export default {
  components: {
    HbCard
  },
  data () {
    return {
      objects: [],
      locations: [],
      modelJson: '{\n}',
      testModel: {
        imageUri: null,
        title: 'Test',
        subtitle: 'Subtitle'
      }
    }
  },
  computed: {
    cardModel () {
      try {
        return JSON.parse(this.modelJson)
      } catch (err) {
        return {
          title: 'Model error',
          subtitle: err.message
        }
      }
    },
    objectSet: {
      get () {
        return this.$store.getters['items/objectSet'].map((tag) => {
          return {
            label: tag,
            value: tag
          }
        })
      }
    },
    locationSet: {
      get () {
        return this.$store.getters['items/locationSet'].map((tag) => {
          return {
            label: tag,
            value: tag
          }
        })
      }
    }
  }
}
</script>
