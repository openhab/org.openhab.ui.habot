<template>
  <div class="layout-padding" style="max-width: 600px; padding-top: 50px;">
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
          <q-btn @click="setGoogleApiKey()" color="primary" flat>Setup</q-btn>
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

      <q-list-header>Notifications</q-list-header>
      <q-item @click="enableNotifications">
        <q-item-main>
          <q-item-tile label>Enable/test push notifications</q-item-tile>
          <q-item-tile sublabel>Subscribe to push notifications on this device, and check whether notifications are received.</q-item-tile>
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
/* This function is used to convert the server's public VAPID key for push notifications
   Source: https://github.com/GoogleChromeLabs/web-push-codelab/blob/master/app/scripts/main.js */
function urlB64ToUint8Array (base64String) {
  const padding = '='.repeat((4 - base64String.length % 4) % 4)
  const base64 = (base64String + padding)
    .replace(/-/g, '+')
    .replace(/_/g, '/')

  const rawData = window.atob(base64)
  const outputArray = new Uint8Array(rawData.length)

  for (let i = 0; i < rawData.length; ++i) {
    outputArray[i] = rawData.charCodeAt(i)
  }
  return outputArray
}

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

    enableNotifications () {
      var vm = this
      const isLocalhost = Boolean(window.location.hostname === 'localhost' ||
          // [::1] is the IPv6 localhost address.
          window.location.hostname === '[::1]' ||
          // 127.0.0.1/8 is considered localhost for IPv4.
          window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/)
      )
      if (!('serviceWorker' in navigator)) {
        Toast.create.negative('Sorry, notifications are not supported on this browser')
        return
      }
      if (!(window.location.protocol === 'https:' || isLocalhost)) {
        Toast.create.negative('Sorry, HTTPS is required for the notifications to work')
        return
      }

      // Basic service worker checks passed
      navigator.serviceWorker.getRegistration()
      // navigator.serviceWorker.register('sw-webpush.js')
        .then((registration) => {
          // Check if desktop notifications are supported
          if (!('showNotification' in ServiceWorkerRegistration.prototype)) {
            Toast.create.negative('Notifications aren\'t supported.')
            Loading.hide()
            return
          }

          if (Notification.permission === 'denied') {
            Toast.create.negative('Notifications are blocked - please check the browser\'s site settings')
            Loading.hide()
            return
          }

          if (!('PushManager' in window)) {
            Toast.create.negative('Push messaging isn\'t supported.')
            Loading.hide()
            return
          }

          // Get the notification subscription object
          registration.pushManager.getSubscription().then((subscription) => {
            var sendSubscriptionToServer = (subscription) => {
              // send the subscription to the server for storage
              // can't use JSON (see server code and https://github.com/openhab/openhab-cloud/issues/31)
              // so stringify and send as plain text and the server will deserialize it
              Loading.show({ message: 'Subscribing to notifications...' })
              vm.$http.post('/rest/habot/notifications/subscribe', JSON.stringify(subscription), {
                headers: {
                  'Content-Type': 'text/plain'
                }
              }).then((response) => {
                Toast.create.positive('Success! You should receive a test notification!')
                Loading.hide()
              }).catch((e) => {
                Toast.create.negative('Error while sending the subscription to the openHAB server: ' + e)
                Loading.hide()
              })
            }

            Loading.show({ message: 'Initializing, please wait...' })

            // No subscription yet, create one
            if (!subscription) {
              // Get the VAPID key from the server first
              vm.$http.get('/rest/habot/notifications/vapid').then((response) => {
                // we got the key, first convert it to a byte array
                const applicationServerKey = urlB64ToUint8Array(response.data)

                Loading.show({ message: 'Preparing the subscription... Please allow the notifications if prompted!', delay: 1000 })
                // then perform the subscription
                registration.pushManager.subscribe({
                  userVisibleOnly: true,
                  applicationServerKey: applicationServerKey
                }).then((subscription) => {
                  sendSubscriptionToServer(subscription)
                }).catch((e) => {
                  if (Notification.permission === 'denied') {
                    Toast.create.negative('Notifications are blocked - please check the browser\'s site settings')
                  }
                  else {
                    Toast.create.negative('Error while subscribing to push notifications: ' + e)
                  }
                  Loading.hide()
                })
              }).catch((e) => {
                Toast.create.negative('Error while getting the public VAPID key from the server: ' + e)
                Loading.hide()
              })
            }
            else {
              sendSubscriptionToServer(subscription)
            }
          })
        })
        .catch((e) => {
          Toast.create.negative('Error while registering the service worker: ' + e)
        })
    },

    refreshApp () {
      Dialog.create({
        title: 'Refresh app',
        message: 'This will empty the cache and reload the newest version of the app from the server. ' +
                 'You will need to enable push notifications again. Continue?',
        buttons: [
          {
            label: 'Cancel',
            handler () {
            }
          },
          {
            label: 'OK',
            handler () {
              Loading.show({ delay: 0, message: 'Refreshing the app...' })
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