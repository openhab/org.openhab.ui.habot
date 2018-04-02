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
      <q-td slot="body-cell-tags" slot-scope="props" :props="props">
        <q-chip small color="secondary" v-for="tag in props.value" :key="tag" class="q-mr-sm">{{ tag }}</q-chip>
      </q-td>
      <q-td slot="body-cell-inheritedTags" slot-scope="props" :props="props">
        <q-chip small color="secondary" style="opacity: 0.7" v-for="tag in props.value" :key="tag" class="q-mr-sm">{{ tag }}</q-chip>
      </q-td>
      <q-td slot="body-cell-groups" slot-scope="props" :props="props">
        <q-chip small color="green" v-for="group in props.value" :key="group" class="q-mr-sm">{{ group }}</q-chip>
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
        { name: 'groups', field: 'groupNames', label: 'Groups', align: 'left', sortable: true },
        { name: 'tags', field: 'tags', label: 'Direct Tags', align: 'left', sortable: true, required: true },
        { name: 'inheritedTags', field: 'inheritedTags', label: 'Inherited Tags', align: 'left', sortable: true, required: true }
      ],
      items: [],
      filter: '',
      visibleColumns: ['name', 'type', 'label', 'groups', 'tags'],
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
        this.addInheritedTags(this.$store.state.items.map[groupName], taglist)
      }
    },
    processItems () {
      let items = extend(true, [], this.$store.state.items.items).map(i => {
        let ret = {
          name: i.name,
          type: i.type,
          label: i.label,
          groupNames: i.groupNames,
          tags: i.tags
        }

        let inheritedTags = []
        this.addInheritedTags(i, inheritedTags, true)
        ret.inheritedTags = inheritedTags
        return ret
      })
      this.items = items
    }
  },
  created () {
    // this.processItems()
  }
}
</script>
