<template>
  <div class="layout-padding" style="max-width: 600px; padding-top: 50px;">
    <!-- <q-alert
            type="negative"
            ref="destroyableAlert"
            enter="bounceInRight"
            leave="bounceOutLeft"
            v-model="visible2"
            dismissible
          >
            Note: nothing on this screen is implemented yet!
    </q-alert> -->

    <br />
    <q-list link>
      <q-list-header>Speech recognition API</q-list-header>
      <q-item tag="label">
        <q-item-side>
          <q-radio v-model="speechApi" val="google"></q-radio>
        </q-item-side>
        <q-item-main>
          <q-item-tile label>Google Cloud Speech</q-item-tile>
          <q-item-tile sublabel>Uses Google services, requires an API key.</q-item-tile>
        </q-item-main>
        <q-item-side right>
          <q-btn @click="setGoogleApiKey()">Set&nbsp;API&nbsp;Key</q-btn>
        </q-item-side>
      </q-item>
      <q-item tag="label" disabled>
        <q-item-side>
          <q-radio v-model="speechApi" val="browser" disable></q-radio>
        </q-item-side>
        <q-item-main>
          <q-item-tile label>Browser built-in recognition</q-item-tile>
          <q-item-tile sublabel>Uses the browser functionality if supported (not implemented).</q-item-tile>
        </q-item-main>
      </q-item>
      <q-item tag="label" disabled>
        <q-item-side>
          <q-radio v-model="speechApi" val="browser" disable></q-radio>
        </q-item-side>
        <q-item-main>
          <q-item-tile label>Send to openHAB speech-to-text</q-item-tile>
          <q-item-tile sublabel>Sends the audio to openHAB for local processing (not implemented).</q-item-tile>
        </q-item-main>
      </q-item>

      <q-list-header>Item tagging</q-list-header>
      <q-item disabled>
        <q-item-main>
          <q-item-tile label>View item tags</q-item-tile>
          <q-item-tile sublabel>View and set the tags associated with your items. (todo)</q-item-tile>
        </q-item-main>
      </q-item>

      <q-list-header>About</q-list-header>
      <q-item disabled>
        <q-item-main>
          <q-item-tile label>About HABot</q-item-tile>
        </q-item-main>
      </q-item>
      <q-item @click="refreshApp">
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
  Dialog,
  Loading,
  QAlert,
  QBtn,
  QList,
  QListHeader,
  QItem,
  QItemSide,
  QItemMain,
  QItemTile,
  QRadio,
  Toast,
  LocalStorage
} from 'quasar'

export default {
  components: {
    QAlert,
    QBtn,
    QList,
    QListHeader,
    QItem,
    QItemMain,
    QItemSide,
    QItemTile,
    QRadio
  },
  data () {
    return {
      speechApi: 'google'
    }
  },
  methods: {
    setGoogleApiKey () {
      Dialog.create({
        title: 'Set the Google Cloud API key',
        message:
            'You need to subscribe to the (paid) Google Cloud Platform to use this feature.<br />' +
            'There is a trial period and a free tier, which might be enough for casual use.<br /><br />' +
            '<ul>' +
            '<li>Go to <a target="_blank" href="https://console.cloud.google.com">console.cloud.google.com</a> and sign up or login</li>' +
            '<li>Create a project and set up a payment method for billing</li>' +
            '<li>Go to API &amp; Services</li>' +
            '<li>Enable the Cloud Speech API from the Library page</li>' +
            '<li>Go to the Credentials page and create an API key</li>' +
            '<li>Paste the API key below</li>' +
            '</ul>',
        form: {
          key: {
            type: 'text',
            label: 'Paste the API Key',
            model: ''
          }
        },
        buttons: [
          {
            label: 'Cancel',
            handler () {

            }
          },
          {
            label: 'Set',
            handler (data) {
              LocalStorage.set('habot.googleApiKey', data.key)
              Toast.create('API Key Set for this device')
            }
          }
        ]
      })
    },
    refreshApp () {
      Dialog.create({
        title: 'Refresh app',
        message: 'This will empty the cache and reload the newest version of the app from the server. Continue?',
        buttons: [
          {
            label: 'Cancel',
            handler () {
            }
          },
          {
            label: 'OK',
            handler () {
              Loading.show({ delay: 0 })
              setTimeout(() => {
                navigator.serviceWorker.getRegistrations().then((registrations) => {
                  for (let registration of registrations) {
                    registration.unregister()
                  }
                  location.reload()
                })
              }, 3000)
            }
          }
        ]
      })
    }
  }
}
</script>