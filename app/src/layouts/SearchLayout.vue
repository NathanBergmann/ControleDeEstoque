<template>
    <q-layout view="lHh Lpr lFf">
      <q-header elevated>
        <q-toolbar>
          <q-btn
            flat
            dense
            round
            icon="menu"
            aria-label="Menu"
            @click="toggleLeftDrawer"
          />

          <q-toolbar-title>
            Controle de Estoque2222222222222222222222
          </q-toolbar-title>

          <div>@univille</div>
        </q-toolbar>
      </q-header>

      <q-drawer
        v-model="leftDrawerOpen"
        show-if-above
        bordered
      >
        <q-list>
          <q-item-label
            header
          >
            Menu Principal
          </q-item-label>

          <EssentialLink
            v-for="link in essentialLinks"
            :key="link.title"
            v-bind="link"
          />
        </q-list>
      </q-drawer>
        <create-product>

        </create-product>
      <q-page-container>
        <router-view />
      </q-page-container>
    </q-layout>
  </template>

<script>
import { defineComponent, ref } from 'vue'
import EssentialLink from 'components/EssentialLink.vue'
import CreateProduct from 'components/products/CreateProduct.vue'

const menuList = [
  {
    title: 'Cadastrar Produto',
    icon: 'create'
  },
  {
    title: 'Cadastrar Entrada de Produto',
    icon: 'edit_note'
  },
  {
    title: 'Cadastrar Saida de Produto',
    icon: 'arrow_downward'
  },
  {
    title: 'Consultar Produtos',
    icon: 'search'
  }
]

export default defineComponent({
  name: 'MainLayout',

  components: {
    EssentialLink,
    CreateProduct
  },

  setup () {
    const leftDrawerOpen = ref(false)

    return {
      essentialLinks: menuList,
      leftDrawerOpen,
      toggleLeftDrawer () {
        leftDrawerOpen.value = !leftDrawerOpen.value
      }
    }
  }
})
</script>
