<template>
 <q-input
    v-model="text"
    filled
    type="textarea"
    dense
    outlined
    autogrow
  >
 </q-input>
</template>

<script>
export default {
  name: 'TemplateTextAreaInput',
  props: {
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
