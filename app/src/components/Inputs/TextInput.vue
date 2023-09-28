<template>
 <q-input
    :v-model="text"
    dense
    outlined
    filled
    :label="valueLabel">
 </q-input>
</template>

<script>
export default {
  name: 'TemplateTextInput',
  props: {
    typeInput: {
      type: String,
      default: 'String'
    },
    value: {
      type: String,
      default: 'teste'
    },
    valueLabel: {
      type: String,
      default: ''
    }

  }
}
</script>

<style>

</style>
