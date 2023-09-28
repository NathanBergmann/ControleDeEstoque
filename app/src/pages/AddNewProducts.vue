<template>
    <div class="col-auto q-pt-md q-pl-lg" style="height: 50px">
        <div class="text-h5 q-auto-sm">
            Adicionar novos produtos
        </div>
    </div>
        <div class="col-12 q-pl-lg">
            <form @submit.prevent.stop="onSubmit" @reset.prevent.stop="onReset" class="q-gutter-md">
                <div class="row justify-center">
                </div>
                <div class="row justify-center">
                    <div class="col-md-4">
                        <TemplateTextInput
                            value=":"
                            valueLabel="Novo Produto"
                        />
                    </div>
                    <div class="col-md-4">
                        <TemplateTextInput
                            value=":"
                            valueLabel="Nome do produto:"
                            ref="nameProduct"
                        />
                    </div>
                </div>
                <div class="row-7 justify-center">
                    <div class="row justify-center">
                        <div class="col-md-8">
                            Descrição do Produto:
                        </div>
                    </div>
                    <div class="row-md-7 justify-center">
                        <TemplateTextAreaInput
                            value=""
                        />
                    </div>
                </div>
                <div class="row justify-center">
                    <div class="col-md-4">
                        <TemplateTextInput
                            value=""
                            valueLabel="Preço:"
                        />
                    </div>
                    <div class="col-md-4" >
                        <TemplateNumberInput
                            value=""
                            valueLabel="Quantidade:"
                        />
                    </div>
                </div>
                <div>
                    <q-btn label="Submit" type="submit" color="primary" />
                    <q-btn label="Reset" type="reset" color="primary" flat class="q-ml-sm" />
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
