<template>
  <div class="layout-padding" style="max-width: 600px; padding-top: 50px;">
    <q-alert
            type="negative"
            ref="destroyableAlert"
            enter="bounceInRight"
            leave="bounceOutLeft"
            v-model="visible2"
            dismissible
          >
            Note: nothing on this screen is implemented yet!
    </q-alert>

    <br />
    <q-list link>
      <q-list-header>General</q-list-header>
      <q-item>Nothing for now</q-item>
      <q-list-header>Item tagging</q-list-header>
      <q-item>
        <q-item-main>
          <q-item-tile label>View item tags</q-item-tile>
          <q-item-tile sublabel>View and set the tags associated with your items. (todo)</q-item-tile>
        </q-item-main>
      </q-item>
      <q-list-header>About</q-list-header>
      <q-item>
        <q-item-main>
          <q-item-tile label>About HABot</q-item-tile>
        </q-item-main>
      </q-item>
      <q-item>
        <q-item-main>
          <q-item-tile label>Refresh the application</q-item-tile>
          <q-item-tile sublabel>Empty and refresh the application cache to upgrade the app.</q-item-tile>
        </q-item-main>
      </q-item>
    </q-list>
  </div>
</template>

<script>
import {
  QAlert,
  QList,
  QListHeader,
  QItem,
  QItemMain,
  QItemTile
} from 'quasar'

export default {
  components: {
    QAlert,
    QList,
    QListHeader,
    QItem,
    QItemMain,
    QItemTile
  },
  data: {

  }
}
</script>