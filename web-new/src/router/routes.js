
import MainLayout from 'layouts/default'
import ChatPage from 'pages/Chat'
import SettingsPage from 'pages/Settings'
import CardDeckPage from 'pages/CardDeck'
import CardSuggestionsPage from 'pages/CardSuggestions'
import CardRecentPage from 'pages/CardRecent'
import CardBookmarksPage from 'pages/CardBookmarks'
import HelpPage from 'pages/Help'
import ErrorPage from 'pages/404'

export default [
  {
    path: '/',
    component: MainLayout,
    children: [
      { path: '/', redirect: '/chat' },
      { path: '/chat', component: ChatPage, meta: { title: 'Chat with HABot' } },
      { path: '/settings', component: SettingsPage, meta: { title: 'Settings' } },
      { path: '/cards/bookmarks', component: CardBookmarksPage, meta: { title: 'Card bookmarks' } },
      { path: '/cards/suggestions', component: CardSuggestionsPage, meta: { title: 'Card suggestions' } },
      { path: '/cards/recent', component: CardRecentPage, meta: { title: 'Recent cards' } },
      { path: '/cards/deck', component: CardDeckPage, meta: { title: 'Card deck' } },
      { path: '/help', component: HelpPage, meta: { title: 'Help' } },
      { path: '/notification',
        redirect: (to) => {
          return { path: '/chat', hash: '', query: '', params: { action: to.hash } }
        }
      }
    ]
  },
  {
    path: '/designer/:uid',
    component: () => import(
      /* webpackChunkName: 'carddesigner' */
      'layouts/designer/CardDesigner'),
    props: true
  },

  { // Always leave this as last one
    path: '*',
    component: ErrorPage
  }
]
