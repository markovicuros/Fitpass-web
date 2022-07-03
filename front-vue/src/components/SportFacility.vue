<template>
  <div class="sportFacility">
        <h3>{{sportFacility.name}}</h3>
        <p> Location : {{sportFacility.location}}</p>
        <p> Status : {{convertStatus(sportFacility)}}</p>
         <p> Type: {{sportFacility.type}}</p>
        <p> Average grade: {{sportFacility.averageGrade}}</p>

  </div>
</template>

<script>
export default {
  name: "SportFacility",
  props:{
    sportFacility : Object
  },
  methods:{
    convertStatus(sportFacility) {
     // console.log(typeof(sportFacility.isWorking))
      if (sportFacility.worikng === true)
        return "Open";
      else
        return "Closed";
    }
  }/*,
  data(){
    return{
      sportFacility: null
    }
  }*/
}
</script>

<style scoped>

</style>