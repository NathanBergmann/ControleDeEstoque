<template>
    <div class="col-auto q-pt-md q-pl-lg" style="height: 50px">
        <div class="text-h5 q-auto-sm">
            Adicionar novos produtos
        </div>
    </div>
    <div class="col-12 q-pl-lg">
        <form class="q-gutter-md" @submit.prevent="submit">
            <div class="row justify-center">
            </div>
            <div class="row justify-center">
                <div class="col-4 col-md-4 q-pr-lg">
                    <q-input type="text" disable  label="Novo Produto" />
                </div>
                <div class="col-4 col-md-4">
                    <q-input type="text" v-model="form.nomeProduto" label="Nome do produto:" ref="nameProduct" />
                </div>
            </div>
            <div class="row-7 justify-center">
                <div class="row justify-center">
                    <div class="col-md-8">
                        <label>Descrição do Produto:</label>
                    </div>
                </div>
                <div class="row justify-center">
                    <div class="col-8 col-md-8">
                    <q-input type="textarea" filled v-model="form.descricaoProduto"/>
                </div>
                </div>
            </div>
            <div class="row justify-center">
                <div class="col-4 col-md-4 q-pr-lg">
                    <q-input mask="#.##" fill-mask="0" reverse-fill-mask v-model="form.precoProduto" value="" label="Preço:" />
                </div>
                <div class="col-4 col-md-4 ">
                    <q-input v-model="form.quantidadeAdicionada" type="number" label="Quantidade:" />
                </div>
            </div>
            <div class="row justify-end">
                <div class="col-4 col-md-4">
                    <q-btn label="Confirmar" type="submit" color="primary"/>
                    <q-btn label="Cancelar" type="reset" color="primary" flat class="q-ml-sm" />
                </div>
                </div>
        </form>
    </div>
    <MainLayout>
        <div class="row" name="divMaster">

        </div>
    </MainLayout>
</template>

<script>
import MainLayout from 'src/layouts/MainLayout.vue'
export default {
  components: { MainLayout },
  data () {
    return {
      form: {
        codProduto: '',
        nomeProduto: '',
        descricaoProduto: '',
        quantidadeEstoqueAtual: '',
        dataUltimaAlteracao: '',
        quantidadeAdicionada: '',
        precoProduto: ''
      }
    }
  },
  methods: {
    submit () {
      console.log(this.form)
      const dataEnvio = {
        nomeProduto: this.form.nomeProduto,
        descricaoProduto: this.form.descricaoProduto,
        quantidadeEstoqueAtual: this.form.quantidadeEstoqueAtual,
        dataUltimaAlteracao: this.form.dataUltimaAlteracao,
        quantidadeAdicionada: this.form.quantidadeAdicionada,
        precoProduto: this.form.precoProduto
      }

      const dataJson = JSON.stringify(dataEnvio);

      const req = await fetch("url", {
        method: "POST",
        headers: {"Content-Type": "applications/json"},
        body: dataJson
      })

      console.log(req)
    }
  }
}
</script>

<style>

</style>
