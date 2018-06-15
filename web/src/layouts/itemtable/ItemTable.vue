<template>
  <q-modal-layout>
    <q-toolbar slot="header">
      <q-btn
        flat
        round
        dense
        v-close-overlay
        icon="arrow_back"
      />
      <q-toolbar-title>
        Item tags review
      </q-toolbar-title>
    </q-toolbar>

    <q-table
      :columns="columns"
      :filter="filter"
      :visible-columns="visibleColumns"
      :data="items"
      :selected.sync="selected"
      row-key="name">
      <template slot="top-left" slot-scope="props">
        <q-search
          hide-underline
          color="secondary"
          v-model="filter"
          class="col-6"
        />
      </template>
      <template slot="top-right" slot-scope="props">
        <q-table-columns
          color="secondary"
          class="q-mr-sm"
          v-model="visibleColumns"
          :columns="columns"
        />
        <q-btn
          flat round dense
          :icon="props.inFullscreen ? 'fullscreen_exit' : 'fullscreen'"
          @click="props.toggleFullscreen"
        />
      </template>
      <q-td slot="body-cell-attributes" slot-scope="props" :props="props">
        <q-chip small dense :color="attribute.source === 'TAG' ? 'secondary' : 'tertiary'"
          :style="{ opacity: attribute.inherited ? 0.4 : 1 }"
          v-for="attribute in props.value"
          :key="attribute" class="q-mr-sm">
            <q-icon :name="attribute.type === 'location' ? 'mdi-map-marker-outline' : 'mdi-cube-outline'" /> {{ attribute.value }}
        </q-chip>
      </q-td>
    </q-table>
  </q-modal-layout>
</template>

<style lang="stylus" scoped>
.fit-chart
  width 100%
  height 100%
</style>

<script>
import { extend } from 'quasar'

export default {
  props: ['model'],
  data () {
    return {
      columns: [
        { name: 'name', field: 'name', label: 'Name', align: 'left', sortable: true, required: true },
        { name: 'type', field: 'type', label: 'Type', align: 'center', sortable: true },
        { name: 'label', field: 'label', label: 'Label', align: 'left', sortable: true },
        { name: 'attributes', field: 'attributes', label: 'Attributes', sortable: true }
      ],
      items: [],
      filter: '',
      visibleColumns: ['name', 'type', 'label', 'attributes'],
      selected: []
    }
  },
  methods: {
    addInheritedTags (item, taglist, leaf) {
      if (!leaf) {
        for (var tag of item.tags) {
          if (tag.startsWith('object:') || tag.startsWith('location:')) {
            taglist.push(tag)
          }
        }
      }
      for (var groupName of item.groupNames) {
        let group = this.$store.state.items.map[groupName]
        if (group) {
          this.addInheritedTags(group, taglist)
        } else {
          console.warn(`Cannot find ${item.name} parent group: ${groupName}!`)
        }
      }
    },
    processItems () {
      this.$http.get('/rest/habot/attributes').then((response) => {
        let items = extend(true, [], this.$store.state.items.items).map(i => {
          let ret = {
            name: i.name,
            type: i.type,
            label: i.label,
            attributes: response.data[i.name]
          }

          let inheritedTags = []
          this.addInheritedTags(i, inheritedTags, true)
          ret.inheritedTags = inheritedTags
          return ret
        })
        this.items = items
      })
    }
  },
  created () {
    // this.processItems()
  }
}
</script>
