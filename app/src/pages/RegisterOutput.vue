<template>
       <div class="col-auto q-pt-md q-pl-lg " style="height: 50px">
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
        <div class="row-7 ">
                <div class="row q-pt-lg">
                    <div class="col-md-8">
                        <label>Descrição do Produto:</label>
                    </div>
                </div>
                <div class="row">
                    <div class="col-8 col-md-9">
                    <TemplateTextAreaInput value="" />
                </div>
                </div>
            </div>
        <div class="row q-pt-lg">
            <div class="col-3 col-md-3 q-pr-lg">
                <q-input :v-model="text" dense outlined filled label="Quantidade Atual no Estoque">
                </q-input>
            </div>
            <div class="col-2 col-md-3 q-pr-lg">
                <q-input :v-model="text" dense outlined filled label="Última Atualização:">
                </q-input>
            </div>
            <div class="col-2 col-md-3">
                <q-input :v-model="text" dense outlined filled label="Quantidade de Entrada">
                </q-input>
            </div>

        </div>
        <div class="row q-pt-lg">
                <q-btn label="Salvar alterações" type="submit" color="primary" />
                <q-btn label="Cancelar" type="reset" color="primary" flat class="q-ml-sm" />
        </div>
    </div>
</template>

<script>
import TemplateTextAreaInput from 'src/components/Inputs/TextAreaInput.vue'
export default {
  components: { TemplateTextAreaInput }

}
</script>

<style>

</style>
