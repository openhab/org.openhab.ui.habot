<template>
  <div class="fixed-center text-center">
    <p>
      <img
        v-if="initialLogin"
        src="statics/icons/apple-icon-152x152.png"
        style="width:30vw;max-width:152px;"
      >
      <img
        v-else
        src="~assets/sad.svg"
        style="width:30vw;max-width:152px;"
      >
    </p>
    <p class="text-faded">{{this.message}}</p>
    <div v-if="$q.platform.is.cordova" class="text-left">
      <q-input v-model="baseURL" float-label="openHAB URL" />
      <q-input v-model="userId" float-label="User Id (optional)" />
      <q-input type="password" v-model="password" float-label="Password (optional)" />
      <br />
    </div>
    <q-btn
      color="secondary"
      style="width:200px;"
      @click="login"
    >{{ initialLogin ? 'Login' : $route.meta.reason === 'offline' ? 'Try again' : 'Go back' }}</q-btn>
  </div>
</template>

<script>
export default {
  data () {
    return {
      initialLogin: false,
      message: null,
      baseURL: '',
      userId: '',
      password: ''
    }
  },
  created () {
    if (this.$route.meta.reason === 'offline') {
      if (this.$q.platform.is.cordova && !this.$q.localStorage.has('habot.baseURL')) {
        this.initialLogin = true
        this.message = 'Login to openHAB'
      } else {
        this.message = 'openHAB is unreachable'
      }
    } else {
      this.message = 'Sorry, nothing here...'
    }
  },
  methods: {
    login () {
      if (this.$q.platform.is.cordova) {
        if (!this.baseURL) return
        this.$q.localStorage.set('habot.baseURL', this.baseURL)
        if (this.userId && this.password) {
          this.$q.localStorage.set('habot.credentialUserId', this.userId)
          this.$q.localStorage.set('habot.credentialPassword', this.password)
        }
      }

      this.$router.push('/')
    }
  }
}
</script>
