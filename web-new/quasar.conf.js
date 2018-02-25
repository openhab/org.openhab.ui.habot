// Configuration for your app
var
  path = require('path'),
  CopyWebpackPlugin = require('copy-webpack-plugin')

module.exports = function (ctx) {
  return {
    plugins: [
      'axios'
    ],
    css: [
      'app.styl'
    ],
    extras: [
      ctx.theme.mat ? 'roboto-font' : null,
      'material-icons'
      // 'ionicons',
      // 'mdi',
      // 'fontawesome'
    ],
    supportIE: false,
    vendor: {
      add: [],
      remove: []
    },
    build: {
      scopeHoisting: true,
      vueRouterMode: 'hash',
      // gzip: true,
      // analyze: true,
      // extractCSS: false,
      // useNotifier: false,
      extendWebpack (cfg) {
        cfg.module.rules.push({
          enforce: 'pre',
          test: /\.(js|vue)$/,
          loader: 'eslint-loader',
          exclude: /(node_modules|quasar)/
        })

        // Adding importScripts to the sw-precache plugin config
        for (let plugin of cfg.plugins) {
          if (plugin.options && plugin.options.cacheId) {
            console.log('Adding importScripts to ' + JSON.stringify(plugin.options))
            plugin.options.importScripts = ['sw-webpush.js']
            // fix wrong path separator when building on Windows
            plugin.options.stripPrefix = plugin.options.stripPrefix.replace('\\', '/')
          }
        }

        cfg.plugins.push(new CopyWebpackPlugin([
          {
            from: path.resolve(__dirname, 'src/sw-webpush.js'),
            to: '.'
          },
          {
            from: path.resolve(__dirname, 'src/recorder.js'),
            to: '.'
          }
        ]))
      }
    },
    devServer: {
      // https: true,
      port: 8081,
      open: false, // opens browser window automatically
      proxy: {
        '/rest': 'http://localhost:8080',
        '/chart': 'http://localhost:8080'
      }
    },
    // framework: 'all' --- includes everything; for dev only!
    framework: {
      components: [
        'QLayout',
        'QLayoutHeader',
        'QLayoutFooter',
        'QLayoutDrawer',
        'QPageContainer',
        'QPage',
        'QPageSticky',
        'QFab',
        'QFabAction',
        'QToolbar',
        'QToolbarTitle',
        'QBtn',
        'QIcon',
        'QList',
        'QListHeader',
        'QItem',
        'QItemMain',
        'QItemSeparator',
        'QItemSide',
        'QItemTile',
        'QSelect',
        'QInput',
        'QChatMessage',
        'QResizeObservable',
        'QWindowResizeObservable',
        'QCard',
        'QCardTitle',
        'QCardMain',
        'QCardMedia',
        'QRadio',
        'QToggle',
        'QKnob',
        'QSlider'
      ],
      directives: [
        'Ripple'
      ],
      plugins: [
        'Notify',
        'Dialog',
        'Loading',
        'LocalStorage'
      ]
    },
    // animations: 'all' --- includes all animations
    animations: [
    ],
    pwa: {
      cacheExt: 'js,html,css,ttf,eot,otf,woff,woff2,json,svg,gif,jpg,jpeg,png,wav,ogg,webm,flac,aac,mp4,mp3',
      manifest: {
        name: 'HABot',
        short_name: 'HABot',
        description: 'Chatbot for openHAB',
        display: 'standalone',
        background_color: '#ffffff',
        theme_color: '#ff6600',
        start_url: '/habot/index.html',
        icons: [
          {
            'src': 'statics/icons/icon-96x96.png',
            'sizes': '72x72',
            'type': 'image/png'
          },
          {
            'src': 'statics/icons/icon-192x192.png',
            'sizes': '192x192',
            'type': 'image/png'
          },
          {
            'src': 'statics/icons/icon-256x256.png',
            'sizes': '256x256',
            'type': 'image/png'
          },
          {
            'src': 'statics/icons/icon-340x340.png',
            'sizes': '384x384',
            'type': 'image/png'
          },
          {
            'src': 'statics/icons/icon-512x512.png',
            'sizes': '512x512',
            'type': 'image/png'
          },
          {
            'src': 'statics/icons/icon-1024x1024.png',
            'sizes': '1024x1024',
            'type': 'image/png'
          }
        ]
      }
    },
    cordova: {
      // id: 'org.cordova.quasar.app'
    },
    electron: {
      extendWebpack (cfg) {
        // do something with cfg
      },
      packager: {
        // OS X / Mac App Store
        // appBundleId: '',
        // appCategoryType: '',
        // osxSign: '',
        // protocol: 'myapp://path',

        // Window only
        // win32metadata: { ... }
      }
    },

    // leave this here for Quasar CLI
    starterKit: '1.0.0-beta.4'
  }
}
