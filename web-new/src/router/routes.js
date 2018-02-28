
import ChatPage from 'pages/Chat'
import SettingsPage from 'pages/Settings'
import CardDeckPage from 'pages/CardDeck'

export default [
  {
    path: '/',
    component: () => import('layouts/default'),
    children: [
      { path: '/', redirect: '/chat' },
      { path: '/chat', component: ChatPage, meta: { title: 'Chat with HABot' } },
      { path: '/settings', component: SettingsPage, meta: { title: 'Settings' } },
      { path: '/cards/deck', component: CardDeckPage, meta: { title: 'Card deck' } },
      { path: '/notification',
        redirect: (to) => {
          return { path: '/chat', hash: '', query: '', params: { action: to.hash } }
        }
      }
    ]
  },
  {
    path: '/designer/:uid',
    component: () => import('layouts/designer/CardDesigner'),
    props: true
  },

  { // Always leave this as last one
    path: '*',
    component: () => import('pages/404')
  }
]
