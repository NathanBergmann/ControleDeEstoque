<template>

    <div class="col-auto q-pt-md q-pl-lg " style="height: 50px">
        <div class="text-h5 q-auto-sm">
            Cadastrar Entrada de Produto
        </div>
    </div>
    <form  id="app-form">
        <div class="col-auto q-pl-lg q-pt-md ">
            <div class="row">
                <div class="col-md-2 justify-left">
                    <q-input v-model="form.codProduto" label="Código do Produto">
                    </q-input>
                </div>
                <div class="col-md-10">
                    <q-btn type="button" v-model="searchProduct" color="primary" icon="search" label="Pesquisar" />
                </div>
            </div>
            <div class="row-7 ">
                    <div class="row q-pt-lg">
                        <div class="col-md-8">
                            <label>Descrição do Produto:</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-8 col-md-9">
                        <q-input type="textarea"  filled v-model="form.descricaoProduto"/>
                    </div>
                    </div>
                </div>
            <div class="row q-pt-lg">
                <div class="col-3 col-md-3 q-pr-lg">
                    <q-input type="number" v-model="form.quantidadeEstoqueAtual" disable outlined filled label="Quantidade Atual no Estoque">
                    </q-input>
                </div>
                <div class="col-2 col-md-3 q-pr-lg">
                    <q-input type="text" disable v-model="form.dataUltimaAlteracao" dense outlined filled label="Última Atualização:">
                    </q-input>
                </div>
                <div class="col-3 col-md-4">
                    <q-input type="number" v-model="form.quantidadeAdicionada" dense outlined filled label="Quantidade de Entrada">
                    </q-input>
                </div>

            </div>
            <div class="row q-pt-lg">
                    <q-btn label="Salvar alterações" type="submit" color="primary" />
                    <q-btn label="Cancelar" type="reset" color="primary" flat class="q-ml-sm" />
            </div>
        </div>
    </form>
</template>

<script>

export default {
  components: { },
  data () {
    return {
      searchProduct: '',
      form: {
        codProduto: '',
        descricaoProduto: 'Está é a descrição do campo',
        quantidadeEstoqueAtual: '12',
        dataUltimaAlteracao: '30/09/2023',
        quantidadeAdicionada: ''
      }
    }
  },
  watch: {
    searchProduct: {
      handler (newValue) {
        console.log('buscou código')
      }
    }
  }

}
</script>

<style></style>
