<template>
    <div class="col-auto q-pt-md q-pl-lg" style="height: 50px">
        <div class="text-h5 q-auto-sm">
            Adicionar novos produtos
        </div>
    </div>
    <div class="col-12 q-pl-lg">
        <form class="q-gutter-md" v-on:subimit.prevent="insert">
            <div class="row justify-center">
            </div>
            <div class="row justify-center">
                <div class="col-4 col-md-4 q-pr-lg">
                    <TemplateTextInput  valueLabel="Novo Produto" />
                </div>
                <div class="col-4 col-md-4">
                    <TemplateTextInput value=":" valueLabel="Nome do produto:" ref="nameProduct" />
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
                    <TemplateTextAreaInput value="" />
                </div>
                </div>
            </div>
            <div class="row justify-center">
                <div class="col-4 col-md-4 q-pr-lg">
                    <TemplateTextInput value="" valueLabel="Preço:" />
                </div>
                <div class="col-4 col-md-4 ">
                    <TemplateNumberInput value="" valueLabel="Quantidade:" />
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
import TemplateTextInput from 'src/components/Inputs/TextInput.vue'
import MainLayout from 'src/layouts/MainLayout.vue'
import TemplateNumberInput from 'src/components/Inputs/NumberInput.vue'
import TemplateTextAreaInput from 'src/components/Inputs/TextAreaInput.vue'
export default {
  components: { TemplateTextInput, MainLayout, TemplateNumberInput, TemplateTextAreaInput }

}
</script>

<style>
.divMaster {
    background-color: blue;
}
</style>
