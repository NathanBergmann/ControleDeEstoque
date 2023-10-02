<template>
        <div class="col-auto q-pt-md q-pl-lg" style="height: 50px">
        <div class="text-h5 q-auto-sm">
            Pesquisar Produtos
        </div>
    </div>
    <div class="col-12 q-pl-lg q-pt-md ">
        <div class="row">
            <div class="col-md-2">
                <q-input
                :v-model="text"
                dense
                outlined
                filled
                label="Nome do Produto">
                </q-input>
            </div>
            <div class="col-md-2">
                <q-btn color="primary" icon="search" label="Pesquisar" />
            </div>
        </div>
    </div>
    <DataTableResult></DataTableResult>
</template>

<script>

import DataTableResult from 'src/components/DataTable.vue'

export default {
  components: { DataTableResult }

}
</script>

<style>

</style>
