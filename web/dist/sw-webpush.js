'use strict';

/* eslint-env browser, serviceworker */

self.addEventListener('push', function (event) {
  console.log('Received push')
  let notificationTitle = 'HABot'
  let notificationOptions = {
    body: 'Notification from HABot',
    icon: 'statics/icons/icon-192x192.png',
    badge: 'statics/icons/icon-72x72.png',
    tag: 'habot-notification'
  }

  if (event.data) {
    const payload = event.data.json()
    Object.assign(notificationOptions, payload)
  }

  event.waitUntil(
    Promise.all([
      self.registration.showNotification(notificationTitle, notificationOptions)
    ])
  )
})

self.addEventListener('notificationclick', function (event) {
  event.notification.close()

// TODO: do something when the notification is clicked
//  let clickResponsePromise = Promise.resolve()

//   if (event.notification.data && event.notification.data.url) {
//     clickResponsePromise = clients.openWindow(event.notification.data.url);
//   }

//   event.waitUntil(
//     Promise.all([
//       clickResponsePromise
//     ])
//   )
})

self.addEventListener('notificationclose', function (event) {

})
