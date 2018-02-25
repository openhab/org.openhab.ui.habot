
import ChatPage from 'pages/Chat'
import SettingsPage from 'pages/Settings'
import CardDeckPage from 'pages/CardDeck'

export default [
  {
    path: '/',
    component: () => import('layouts/default'),
    children: [
      { path: '/', redirect: '/chat' },
      { path: '/chat', component: ChatPage },
      { path: '/settings', component: SettingsPage },
      { path: '/cards/deck', component: CardDeckPage },
      { path: '/notification',
        redirect: (to) => {
          return { path: '/chat', hash: '', query: '', params: { action: to.hash } }
        }
      }
    ]
  },

  { // Always leave this as last one
    path: '*',
    component: () => import('pages/404')
  }
]
