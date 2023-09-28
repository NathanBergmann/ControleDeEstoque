<template>
    <div class="col-auto q-pt-md q-pl-lg" style="height: 50px">
        <div class="text-h5 q-auto-sm">
            Cadastrar Saída de Produto
        </div>
    </div>
    <div class="col-auto q-pl-lg q-pt-md ">
        <div class="row">
            <div class="col-md-2 justify-left">
                <q-input :v-model="text" dense outlined filled label="Código do Produto">
                </q-input>
            </div>
            <div class="col-md-10">
                <q-btn color="primary" icon="search" label="Pesquisar" />
            </div>
        </div>
        <div class="row q-pt-lg">
            <div class="col-2 col-md-2 q-pr-lg">
                <q-input :v-model="text" dense outlined filled label="Quantidade Atual no Estoque">
                </q-input>
            </div>
            <div class="col-2 col-md-2 q-pr-lg">
                <q-input :v-model="text" dense outlined filled label="Última Atualização:">
                </q-input>
            </div>
            <div class="col-2 col-md-2 q-pr-lg">
                <q-input :v-model="text" dense outlined filled label="Valor de Entrada">
                </q-input>
            </div>
            <div class="col-2 col-md-2 q-pr-lg">
                <q-input :v-model="text" dense outlined filled label="Data de Entrada">
                </q-input>
            </div>

        </div>
    </div>
</template>

<script>
export default {

}
</script>

<style>

</style>
