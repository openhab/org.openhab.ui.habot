'use strict';

/* eslint-env browser, serviceworker */

self.addEventListener('push', function(event) {
  console.log('Received push');
  let notificationTitle = 'HABot';
  const notificationOptions = {
    body: 'Notification from HABot',
    icon: 'statics/icons/icon-192x192.png',
    badge: 'statics/icons/icon-72x72.png',
    tag: 'habot-notification'
  };

  if (event.data) {
    const dataText = event.data.text();
    notificationOptions.body = dataText;
  }

  event.waitUntil(
    Promise.all([
      self.registration.showNotification(notificationTitle, notificationOptions)
    ])
  );  
});

self.addEventListener('notificationclick', function(event) {
  event.notification.close();

  let clickResponsePromise = Promise.resolve();
  // TODO: do something when the notification is clicked

//   if (event.notification.data && event.notification.data.url) {
//     clickResponsePromise = clients.openWindow(event.notification.data.url);
//   }

//   event.waitUntil(
//     Promise.all([
//       clickResponsePromise
//     ])
//   );  
});

self.addEventListener('notificationclose', function(event) {

});
