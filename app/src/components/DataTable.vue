<template>
    <div>
      <q-table
        :rows="rows"
        :rows-per-page-options="[10, 20, 30]"
        row-key="id"
        v-model:pagination="pagination"
      >
        <template v-slot:body="props">
          <q-tr :props="props">
            <q-td :props="props">
              {{ props.row.name }} <!-- Substitua "name" pelo nome do campo que deseja exibir na tabela -->
            </q-td>
            <q-td :props="props">
              <q-btn
                @click="editRow(props.row.id)"
                color="primary"
                icon="edit"
                label="Editar"
              />
            </q-td>
          </q-tr>
        </template>
      </q-table>
    </div>
  </template>

<script>
export default {
  name: 'DataTableResult',
  props: {
    rows: Array // Os dados da tabela que você receberá do backend
  },
  data () {
    return {
      pagination: {
        page: 1,
        rowsPerPage: 10 // Número de linhas por página inicial
      }
    }
  },
  methods: {
    editRow (id) {
      // Redirecione para a página de edição com o ID da linha
      this.$router.push({ name: 'editRow', params: { id } })
    }
  }
}
</script>
