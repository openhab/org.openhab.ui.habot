<template>
  <q-layout view="hHh Lpr fFf">
    <q-layout-header>
      <q-toolbar>
        <q-btn flat round dense icon="arrow_back" @click="goBack()" />
        <q-toolbar-title>
          Card Designer
        </q-toolbar-title>
        <q-btn @click="save()" icon="save" flat label="Save"></q-btn>
      </q-toolbar>
    </q-layout-header>

    <q-layout-footer>
      <q-toolbar>
        <q-btn @click="layout.treepane=!layout.treepane" icon="format_indent_increase" flat label="Tree"></q-btn>
        <q-toolbar-title>
        </q-toolbar-title>
        <q-btn @click="layout.toolpane=!layout.toolpane" icon-right="build" flat label="Tools"></q-btn>
      </q-toolbar>
    </q-layout-footer>

    <q-layout-drawer side="left" content-class="bg-grey-2 shadow-1 tree-drawer" v-model="layout.treepane">
      <div>
        <q-tree ref="tree" v-if="treeModel" class="designer-tree" :nodes="treeModel" node-key="id" :selected.sync="selectedNodeId" default-expand-all></q-tree>
      </div>
    </q-layout-drawer>

    <q-layout-drawer side="right" content-class="bg-grey-2 shadow-9 tools-drawer" v-model="layout.toolpane">
      <div v-if="selectedNode" class="properties">
        <div class="node-header">
          <div class="q-title">{{selectedNode.label}}</div>
          <div class="q-caption">{{selectedNode.type}}</div>
        </div>
        <div v-if="selectedNode.type === 'slot'">
          <div class="q-body-2">{{currentComponent.slotDescriptions[selectedNode.label].description}}</div>
        </div>
        <div v-if="selectedNode.type === 'component'">
          <div class="q-body-2">{{currentComponent.description}}</div>
          <br />

          <!-- Special handling for the root HbCard -->
          <div v-if="selectedNode && selectedNode.id === 'card'">
            <q-field label="title" class="config-field" orientation="vertical"
                     helper="The title of the card">
              <config-text v-model="selectedNode.component.title"></config-text>
            </q-field>
            <q-field label="subtitle" class="config-field" orientation="vertical"
                     helper="The subtitle of the card">
              <config-text v-model="selectedNode.component.subtitle"></config-text>
            </q-field>
            <q-field label="tags" class="config-field" orientation="vertical"
                    helper="The tags attached to the card - use object:<tag> and location:<tag> to make HABot present this card instead of the default generated one when asked about those tags">
              <q-chips-input v-model="selectedNode.component.tags" color="secondary"></q-chips-input>
            </q-field>
            <q-field label="suggestcriteria" class="config-field" orientation="vertical"
                    helper="The expression to evaluate in order to determine whether the card will be considered as a suggestion. Leave blank if the card is not to be suggested. Example: items.Temperature.state < 16">
              <config-expr v-model="selectedNode.config.suggestcriteria" color="secondary"></config-expr>
            </q-field>
            Result: {{suggestcriteriaError}}
          </div>

          <q-field
              v-if="currentComponent && currentComponent.configDescriptions && selectedNode.config"
              v-for="(configDesc, prop) in currentComponent.configDescriptions"
              :label="prop"
              class="config-field"
              orientation="vertical"
              :helper="configDesc.description" :key="prop">
            <div class="hidden">{{selectedNode.config[prop]}}</div>
            <config-bool v-if="configDesc.type === 'boolean'" v-model="selectedNode.config[prop]"></config-bool>
            <config-option-group v-else-if="configDesc.type === 'optiongroup'" v-model="selectedNode.config[prop]" :options="configDesc.options"></config-option-group>
            <config-item v-else-if="configDesc.type === 'item'" v-model="selectedNode.config[prop]"></config-item>
            <config-text v-else v-model="selectedNode.config[prop]"></config-text>
          </q-field>
        </div>
      </div>

      <q-list v-if="selectedNode && selectedNode.type === 'slot'" no-border>
        <q-list-header>Add a component</q-list-header>
        <q-item v-for="subcomponent in validSubcomponents(selectedNode.label)" :key="subcomponent" inset-separator>
          <q-item-side>
            <q-btn class="bg-secondary text-white" round icon="add" @click="addComponent(selectedNode.label, subcomponent)"></q-btn>
          </q-item-side>
          <q-item-main>
            <q-item-tile label>{{subcomponent}}</q-item-tile>
            <q-item-tile sublabel>{{components[subcomponent].description}}</q-item-tile>
          </q-item-main>
        </q-item>
      </q-list>

      <q-list v-if="selectedNode && selectedNode.type === 'component' && currentComponent && currentComponent.slotDescriptions" no-border>
        <q-list-header>Slots</q-list-header>
        <q-item v-for="(slotDescription, slotName) in currentComponent.slotDescriptions" :key="slotName" inset-separator>
          <q-item-side>
            <q-btn class="bg-secondary text-white" round icon="add" @click="addSlot(slotName)" :disabled="selectedNode.component.slots[slotName]"></q-btn>
          </q-item-side>
          <q-item-main>
            <q-item-tile label>{{slotName}}</q-item-tile>
            <q-item-tile sublabel>{{slotDescription.description}}</q-item-tile>
          </q-item-main>
        </q-item>
      </q-list>

      <div v-if="selectedNode" class="actions">
        <div v-if="selectedNode.type === 'component' && selectedNode.label !== 'HbCard'">
          <q-btn-group push>
            <q-btn push icon="delete" color="red" @click="deleteComponent()"></q-btn>
            <q-btn push icon="keyboard_arrow_up" color="white" text-color="black" @click="moveComponent(-1)"></q-btn>
            <q-btn push icon="keyboard_arrow_down" color="white" text-color="black" @click="moveComponent(1)"></q-btn>
            <q-btn push icon="content_copy" color="secondary" @click="cloneComponent()"></q-btn>
          </q-btn-group>
        </div>
        <!-- <div v-if="selectedNode.type === 'slot'">
          <q-btn-group push>
            <q-btn push icon="delete" color="red"></q-btn>
          </q-btn-group>
        </div> -->
      </div>

    </q-layout-drawer>

    <div class="card-container">
      <hb-card ref="card" v-if="cardModel" :model="cardModel" menu="designer"></hb-card>
    </div>
  </q-layout>
</template>

<style lang="stylus">
@import '~variables'
.tree-drawer, .tools-drawer
  width 320px
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
.actions
  padding 1rem
.config-field
  padding-bottom 8px
.card-container
  position absolute
  top 80px
  margin-bottom 100px
  left 50%
  transform translateX(-50%)
  .q-card
    width 100%
@media (max-width $breakpoint-xs-max)
  .card-container
    width calc(100% - 20px)
@media (min-width $breakpoint-xs-min)
  .card-container
    min-width $card-min-width
</style>

<script>
import HbCard from 'components/HbCard.vue'
import ConfigText from 'components/designer/ConfigText.vue'
import ConfigBool from 'components/designer/ConfigBool.vue'
import ConfigOptionGroup from 'components/designer/ConfigOptionGroup.vue'
import ConfigItem from 'components/designer/ConfigItem.vue'
import ConfigExpr from 'components/designer/ConfigExpr.vue'

import Vue from 'vue'
import { extend } from 'quasar'

import Components from 'assets/components.json'

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
  if (!c.config) c.config = {}
  node.config = c.config

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
        children: [],
        parentNode: node
      }
      let idx = 0
      for (let subcomponent of c.slots[slot]) {
        let subnode = componentToTreeNode(subcomponent, slotPrefix + '-' + idx++)
        subnode.parentNode = slotNode
        subnode.parentSlotName = slot
        subnode.parentSlot = c.slots[slot]
        slotNode.children.push(subnode)
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
    HbCard,
    ConfigText,
    ConfigBool,
    ConfigOptionGroup,
    ConfigItem,
    ConfigExpr
  },
  data () {
    return {
      components: Components,
      layout: {
        treepane: true,
        toolpane: true
      },
      cardModel: null,
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
      // let request = (this.newCard) ? this.$http.post('/rest/habot/cards/', this.card) : this.$http.put('/rest/habot/cards/' + this.uid, this.card)
      let action = (this.newCard) ? this.$store.dispatch('cards/create', this.card) : this.$store.dispatch('cards/update', this.card)
      action.then(() => {
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
      this.buildTree()
    },
    addComponent (slot, type) {
      let component = this.selectedNode.component
      let newComponent = {
        component: type,
        config: {}
      }
      if (!component.slots[slot]) component.slots[slot] = []
      if (this.components[type].slotDescriptions) newComponent.slots = {}
      component.slots[slot].push(newComponent)
      this.buildTree()
    },
    cloneComponent () {
      let component = this.selectedNode.component
      let newComponent = extend(true, {}, component)
      let idx = this.selectedNode.parentSlot.indexOf(component)
      this.selectedNode.parentSlot.splice(idx, 0, newComponent)
      this.buildTree()
    },
    deleteComponent () {
      if (!this.selectedNode || !this.selectedNode.type === 'component') return
      let parentNode = this.selectedNode.parentNode
      let parentSlot = this.selectedNode.parentSlot
      let parentSlotName = this.selectedNode.parentSlotName
      let componentIdx = parentSlot.indexOf(this.selectedNode.component)
      if (componentIdx < 0) return
      if (parentSlot.length === 1 && componentIdx === 0) {
        // Remove the slot if it has no components left
        delete parentNode.component.slots[parentSlotName]
      } else {
        parentSlot.splice(componentIdx, 1)
      }
      this.buildTree()
    },
    moveComponent (delta) {
      let slot = this.selectedNode.parentSlot
      let component = this.selectedNode.component
      let parentNodeId = this.selectedNode.parentNode.id
      var index = slot.indexOf(component)
      var newIndex = index + delta
      if (newIndex < 0 || newIndex === slot.length) return
      var indexes = [index, newIndex].sort()
      slot.splice(indexes[0], 2, slot[indexes[1]], slot[indexes[0]])
      // We have to deselect because the ids change (could compute the new id but nah)
      this.selectedNodeId = parentNodeId + '-' + newIndex
      this.buildTree()
    },
    validSubcomponents (slot) {
      let allcomponents = Object.keys(this.components)
      if (!this.currentComponent || !this.currentComponent.slotDescriptions || !this.currentComponent.slotDescriptions[slot]) return allcomponents
      if (this.currentComponent.slotDescriptions[slot].allowedComponents) {
        return this.currentComponent.slotDescriptions[slot].allowedComponents
      } else if (this.currentComponent.slotDescriptions[slot].deniedComponents) {
        return allcomponents.filter((c) => this.currentComponent.slotDescriptions[slot].deniedComponents.indexOf(c) < 0)
      } else {
        return allcomponents
      }
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
            if (found) {
              found.component.highlighted = true
              return found
            }
          }
          return null
        }
      }

      if (!this.treeModel || !this.selectedNodeId) return
      return findInTree(this.treeModel[0], this.selectedNodeId)
    },
    currentComponent () {
      if (!this.selectedNode) return null
      return this.components[this.selectedNode.component.component]
    }
  },
  asyncComputed: {
    suggestcriteriaError () {
      let suggestresult = this.$expr('=' + this.selectedNode.config.suggestcriteria)
      debugger
      console.log(suggestresult)
      return suggestresult
    }
  },
  created () {
    let vm = this
    let card = vm.$store.getters['cards/copy'](this.uid)
    if (card) {
      vm.card = card
      if (!vm.card.tags) vm.card.tags = [] // temp
      vm.buildTree()
    } else {
      vm.newCard = true
      vm.card = {
        title: 'New Card',
        subtitle: 'Subtitle',
        component: 'HbCard',
        tags: [],
        bookmarked: false,
        config: {},
        slots: {}
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
      } else if (vm.$route.query.type === 'tabs') {
        vm.card.title = 'New Tabbed Card'
        vm.card.slots = {
          tabs: [
            {
              component: 'HbTabs',
              config: { inverted: true },
              slots: {
                tabs: [
                  {
                    component: 'HbTab',
                    config: {
                      name: 'tab1',
                      label: 'Tab 1'
                    }
                  },
                  {
                    component: 'HbTab',
                    config: {
                      name: 'tab2',
                      label: 'Tab 2'
                    }
                  }
                ],
                tabpanes: [
                  {
                    component: 'HbTabPane',
                    config: {
                      name: 'tab1'
                    },
                    slots: {
                      main: []
                    }
                  },
                  {
                    component: 'HbTabPane',
                    config: {
                      name: 'tab2'
                    },
                    slots: {
                      main: []
                    }
                  }
                ]
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
  }
}
</script>
