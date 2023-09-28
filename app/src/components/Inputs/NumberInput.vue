<template>
 <q-input
  v-model.number="model"
  type="number"
  dense
  outlined
  :label="valueLabel">
 </q-input>
</template>

<script>
export default {
  name: 'TemplateNumberInput',
  props: {
    value: {
      type: Number,
      default: 0
    },
    valueLabel: {
      type: String
    }

  }
}
</script>

<style>

</style>
