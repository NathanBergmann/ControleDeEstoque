<template>
 <div>
    <div class="row">
        <TemplateInput
        this.typeInput='String'
        this.value=''
        this.valueLabel="Digite o produto"
        ></TemplateInput>
    </div>
 </div>
</template>

<script>
import TemplateInput from `products/Input.vue`

export default {
  name: 'CreateProduct',
  components: {
    TemplateInput
  }
}
</script>

<style>

</style>
