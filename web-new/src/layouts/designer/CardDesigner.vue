<template>
  <q-layout view="hHh Lpr fFf">
    <q-layout-header>
      <q-toolbar>
        <q-btn flat round dense icon="arrow_back" @click="goBack()" />
        <q-toolbar-title>
          Card Designer
        </q-toolbar-title>
        <q-btn @click="save()" icon="save" flat></q-btn>
      </q-toolbar>
    </q-layout-header>

    <q-layout-footer>
      <q-toolbar>
        <q-btn @click="layout.treepane=!layout.treepane" icon="format_indent_increase" flat></q-btn>
        <q-toolbar-title>
        </q-toolbar-title>
        <q-btn @click="layout.toolpane=!layout.toolpane" icon="build" flat></q-btn>
      </q-toolbar>
    </q-layout-footer>

    <q-layout-drawer side="left" content-class="bg-grey-2 shadow-1 tree-drawer" v-model="layout.treepane">
      <div>
        <q-tree ref="tree" v-if="treeModel" class="designer-tree" :nodes="treeModel" node-key="id" :selected.sync="selectedNodeId" default-expand-all></q-tree>
      </div>
    </q-layout-drawer>

    <q-layout-drawer side="right" content-class="bg-grey-2 shadow-9" v-model="layout.toolpane">
      <div v-if="selectedNode" class="properties">
        <div class="node-header">
          <div class="q-title">{{selectedNode.label}}</div>
          <div class="q-caption">{{selectedNode.type}}</div>
        </div>
        <div v-if="selectedNode.type === 'component'">
          <q-field v-for="(value, prop) in selectedNode.config"
              :label="prop"
              class="config-field"
              orientation="vertical"
              helper="A really really really long help message" :key="prop">
            <div class="hidden">{{value}}</div>
            <q-input v-model="selectedNode.config[prop]"></q-input>
          </q-field>
          <q-btn class="bg-secondary text-white" @click="addSlot('main')">Add main slot</q-btn>
        </div>
        <div v-if="selectedNode.type === 'slot'">
          <q-btn class="bg-secondary text-white" @click="addComponent(selectedNode.label, 'HbListItem')">Add list item</q-btn>
          <q-btn class="bg-secondary text-white" @click="addComponent(selectedNode.label, 'HbSlider')">Add slider</q-btn>
          <q-btn class="bg-secondary text-white" @click="addComponent(selectedNode.label, 'HbKnob')">Add knob</q-btn>
        </div>
      </div>
    </q-layout-drawer>

    <div class="fixed-center">
      <hb-card ref="card" :model="cardModel" menu="designer"></hb-card>
    </div>
  </q-layout>
</template>

<style lang="stylus">
@import '~variables'
.designer-tree
  font-size 10pt
  .q-tree-children
    padding-left 10px
  .q-tree-node
    padding-bottom 0
  .q-tree-node:after
    display none
  .q-tree-node-header:before
    display none
.properties
  padding 1rem
  .node-header
    margin -15px -15px 10px -15px
    background $white
    padding 15px
    border-bottom 1px solid $grey-5
.config-field
  padding-bottom 8px
.fixed-center
  .q-card
    width 100%
@media (max-width 575px)
  .fixed-center
    width calc(100% - 20px)
@media (min-width 576px)
  .fixed-center
    min-width 400px
</style>

<script>
import HbCard from 'components/HbCard.vue'
import Vue from 'vue'

function componentToTreeNode (c, prefix) {
  let node = {
    id: prefix,
    type: 'component',
    component: c,
    icon: 'widgets',
    label: c.component
  }
  if (c.title) node.title = c.title
  if (c.subtitle) node.subtitle = c.subtitle
  if (c.config) node.config = c.config
  // pull slots from component schema
  if (c.slots) {
    node.children = []
    for (let slot in c.slots) {
      let slotPrefix = prefix + '-' + slot
      let slotNode = {
        id: slotPrefix,
        label: slot,
        component: c,
        type: 'slot',
        icon: 'view_compact',
        tickable: false,
        children: []
      }
      let idx = 0
      for (let subcomponent of c.slots[slot]) {
        slotNode.children.push(componentToTreeNode(subcomponent, slotPrefix + '-' + idx++))
      }
      node.children.push(slotNode)
    }
  }

  return node
}

export default {
  name: 'CardDesigner',
  props: [
    'uid'
  ],
  components: {
    HbCard
  },
  data () {
    return {
      layout: {
        treepane: true,
        toolpane: true
      },
      cardModel: {
        // title: 'My Card',
        // subtitle: 'The subtitle',
        // component: 'HbCard',
        // slots: {
        //   list: [
        //     {
        //       component: 'HbList',
        //       config: {
        //         link: true
        //       },
        //       slots: {
        //         items: [
        //           {
        //             component: 'HbListItem',
        //             config: {
        //               label: 'Test',
        //               item: 'Light_GF_Corridor_Ceiling',
        //               control: 'Switch'
        //             }
        //           }
        //         ]
        //       }
        //     }
        //   ]
        // }
      },
      treeModel: null,
      selectedNodeId: 'card',
      newCard: false
    }
  },
  methods: {
    goBack () {
      this.$router.push('/cards/deck')
    },
    save () {
      this.card.uid = this.uid
      let request = (this.newCard) ? this.$http.post('/rest/habot/cards/', this.card) : this.$http.put('/rest/habot/cards/' + this.uid, this.card)
      request.then(() => {
        this.$q.notify({ type: 'positive', message: 'Card saved' })
      }).catch((err) => {
        this.$q.notify(err.message)
      })
    },
    redrawCard () {
      this.$refs.card.$forceUpdate()
    },
    buildTree () {
      this.flattenedComponents = {}
      this.treeModel = null
      this.cardModel = null
      Vue.nextTick(() => {
        this.cardModel = this.card
        this.treeModel = [componentToTreeNode(this.card, 'card')]
      })
    },
    addSlot (name) {
      let component = this.selectedNode.component
      if (!component.slots) component.slots = {}
      component.slots[name] = []
      // this.redrawCard()
      this.buildTree()
    },
    addComponent (slot, type) {
      let component = this.selectedNode.component
      if (!component.slots[slot]) component.slots[slot] = []
      component.slots[slot].push({
        component: type,
        config: {
          label: '',
          item: '',
          state: '',
          control: ''
        }
      })
      // this.redrawCard()
      this.buildTree()
    }
  },
  computed: {
    selectedNode () {
      let findInTree = (node, id) => {
        if (!node || !id) return
        if (node.id === id) return node
        if (node.children) {
          for (let child of node.children) {
            let found = findInTree(child, id)
            if (found) return found
          }
          return null
        }
      }

      if (!this.treeModel || !this.selectedNodeId) return
      return findInTree(this.treeModel[0], this.selectedNodeId)
    }
  },
  created () {
    let vm = this
    this.$http.get('/rest/habot/cards/' + this.uid).then((resp) => {
      vm.card = resp.data
      vm.buildTree()
    }).catch((err) => {
      if (err.response.status === 404) {
        vm.newCard = true
        vm.card = {
          title: 'New Card',
          subtitle: 'Subtitle',
          component: 'HbCard'
        }

        // adds a list skeleton if the designer was invoked with a 'type' query string
        if (vm.$route.query.type === 'list') {
          vm.card.title = 'New List Card'
          vm.card.slots = {
            list: [
              {
                component: 'HbList',
                config: {},
                slots: {
                  items: []
                }
              }
            ]
          }
        } else {
          vm.card.slots = {
            main: []
          }
        }

        vm.buildTree()
      }
    })
  }
}
</script>
