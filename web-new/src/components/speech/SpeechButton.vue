<template>
  <q-page-sticky position="bottom-right" class="speech-sticky" :offset="[18, 84]">
    <q-btn v-show="!speaking" size="lg" round color="primary" @click="startSpeaking" icon="mic" />
    <q-btn v-show="speaking" :loading="processing" size="lg" round loader color="red" @click="stopSpeaking" icon="mic off">
      <q-spinner-audio slot="loading" />
    </q-btn>
  </q-page-sticky>
</template>

<script>

import '@accentdotai/recorderjs'

export default {
  name: 'SpeechButton',
  data () {
    return {
      speaking: false,
      processing: false,
      speechApi: null,
      audioContext: null,
      recorder: null,
      audio: null,
      googleSpeechData: {
        audio: {
          content: null
        },
        config: {
          encoding: 'LINEAR16',
          // sampleRateHertz: 16000,
          languageCode: null
        }
      },
      googleApiKey: null,
      webkitSpeechRecognition: null,
      interimResult: ''
    }
  },
  methods: {
    startSpeaking () {
      const vm = this
      vm.speechApi = vm.$q.localStorage.get.item('habot.speechApi')

      if (((!vm.speechApi && vm.$q.platform.is.chrome) || vm.speechApi === 'webkitSpeechRecognition') &&
          'webkitSpeechRecognition' in window) {
        // eslint-disable-next-line new-cap
        vm.webkitSpeechRecognition = new window.webkitSpeechRecognition()
        vm.webkitSpeechRecognition.onstart = vm.webkitSpeechRecognitionStart
        vm.webkitSpeechRecognition.onerror = vm.webkitSpeechRecognitionError
        vm.webkitSpeechRecognition.onend = vm.webkitSpeechRecognitionEnd
        vm.webkitSpeechRecognition.onresult = vm.webkitSpeechRecognitionResult
        vm.webkitSpeechRecognition.continuous = true
        vm.webkitSpeechRecognition.interimResults = true
        vm.webkitSpeechRecognition.lang = vm.$store.state.lang
        vm.webkitSpeechRecognition.start()
      } else {
        try {
          vm.audioContext = new AudioContext()
          console.log('Audio context set up')

          vm.googleApiKey = vm.$q.localStorage.get.item('habot.googleApiKey')
          if (!vm.googleApiKey) {
            vm.$q.notify({
              message: 'The Google API Key is not set.',
              icon: 'mic off'
            })
            return
          }

          navigator.mediaDevices.getUserMedia({ audio: true }).then(function (stream) {
            const input = vm.audioContext.createMediaStreamSource(stream)
            // eslint-disable-next-line no-undef
            vm.recorder = new Recorder(input, { numChannels: 1 })
            vm.speaking = true
            vm.recorder && vm.recorder.record()
            setTimeout(() => { vm.stopSpeaking() }, 10000)
          }).catch(function (e) {
            vm.$q.notify({
              message: 'No live audio input: ' + e,
              icon: 'mic off'
            })
          })
        } catch (e) {
          vm.$q.notify({
            message: 'This browser has no support for web audio',
            icon: 'mic off'
          })
          throw e
        }
      }
    },
    stopSpeaking (event) {
      if (this.webkitSpeechRecognition) {
        this.webkitSpeechRecognition.stop()
        this.speaking = false
        this.$emit('end')
      } else {
        this.recorder.stop()
        this.processRecording()
        this.recorder.clear()
      }
    },
    processRecording () {
      const vm = this
      vm.processing = true

      vm.recorder.exportWAV(function (blob) {
        var reader = new window.FileReader()
        reader.readAsDataURL(blob)
        reader.onloadend = () => {
          const baseData = reader.result
          const base64Data = baseData.replace('data:audio/wav;base64,', '')
          vm.googleSpeechData.audio.content = base64Data
          vm.googleSpeechData.config.languageCode = vm.$store.state.lang
          vm.$http.post(`https://speech.googleapis.com/v1/speech:recognize?key=${vm.googleApiKey}`, vm.googleSpeechData)
            .then(response => {
              if (response.data.results) {
                const result = response.data.results[0].alternatives[0]
                vm.text = result.transcript
                vm.$emit('result', result.transcript)
              }
              vm.processing = false
              vm.speaking = false
              vm.$emit('end')
            }).catch(error => {
              vm.processing = false
              vm.speaking = false
              vm.$q.notify({
                message: JSON.stringify(error),
                icon: 'mic off'
              })
              vm.$emit('error', error)
            })
        }
      })
    },

    webkitSpeechRecognitionStart (event) {
      this.speaking = true
      this.interimResult = ''
      this.$emit('start')
    },
    webkitSpeechRecognitionError (event) {
      this.speaking = false
      this.$q.notify(event.error)
      this.$emit('error')
    },
    webkitSpeechRecognitionStop (event) {
      this.speaking = false
    },
    webkitSpeechRecognitionResult (event) {
      if (typeof (event.results) === 'undefined') {
        this.speaking = false
        this.webkitSpeechRecognition.stop()
      }

      console.log(event.results)
      this.interimResult = ''
      for (var result of event.results) {
        if (result.isFinal) {
          this.$emit('result', result[0].transcript)
          this.speaking = false
          this.webkitSpeechRecognition.stop()
        } else {
          this.interimResult += result[0].transcript
        }
      }
      this.$emit('interimresult', this.interimResult)
    }
  }
}
</script>
