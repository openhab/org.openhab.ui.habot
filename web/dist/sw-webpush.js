'use strict'

/* eslint-env browser, serviceworker */

// Determines whether a client is currently focused
// Source: https://web-push-book.gauntface.com/chapter-05/04-common-notification-patterns/
function isClientFocused () {
  return clients.matchAll({ type: 'window', includeUncontrolled: true }).then((windowClients) => {
    let clientIsFocused = false

    for (let i = 0; i < windowClients.length; i++) {
      const windowClient = windowClients[i]
      if (windowClient.focused && windowClient.url.indexOf('/chat') > 0) {
        clientIsFocused = true
        break
      }
    }

    return clientIsFocused
  })
}

self.addEventListener('push', function (event) {
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
    isClientFocused().then(function (focused) {
      // add the message to the chat list of clients to handle
      return self.clients.matchAll({ type: 'window', includeUncontrolled: true }).then(function (clientList) {
        for (let client of clientList) {
          client.postMessage(notificationOptions.body)
        }

        if (focused) {
          // No need to display a notification
          return
        }

        // then display the notification
        self.registration.showNotification(notificationTitle, notificationOptions)
      })
    })
  )
})

self.addEventListener('notificationclick', function (event) {
  event.notification.close()

  event.waitUntil(
    self.clients.matchAll({ type: 'window', includeUncontrolled: true }).then(function (clientList) {
      if (clientList.length > 0) {
        for (let client of clientList) {
          client.navigate('index.html#/notification#' + event.notification.body)
        }
        return clientList[0].focus()
      }

      return self.clients.openWindow('index.html#/notification#' + event.notification.body)
    })
  )
})

// don't do anything for now if the notification is dismissed
// self.addEventListener('notificationclose', function (event) {
// })
