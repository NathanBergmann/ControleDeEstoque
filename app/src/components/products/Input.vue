<template>
 <q-input :type="typeInput" :value="value" densee outlined :label="valueLabel"></q-input>
</template>

<script>
export default {
  name: 'TemplateInput',
  props: {
    typeInput: {
      type: String,
      default: 'String'
    },
    value: {
      type: String,
      default: ''
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
