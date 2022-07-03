<template>

<h1>All fitness centers</h1>
  <input type="text" v-model="search">
  <div  v-for="sportFacility in filterSportsFacilities">
         <SportFacility :sportFacility="sportFacility"/>
  </div>
</template>

<script>
import SportFacility from "@/components/SportFacility";
import axios from "axios";
export default {
  name: "Facilities",
  components: {SportFacility},
  props:{
    sportFacilities : Array
  },
  data(){
    return{
      sportFacilities : [],
      search : ''
    }
  },
  created() {
    this.getAll()
  },
  computed:{
    filterSportsFacilities(){
      return this.sportFacilities.filter(sportFacility => sportFacility.name.toLowerCase().includes(this.search.toLocaleLowerCase()) || sportFacility.location.toLowerCase().includes(this.search.toLowerCase()) || sportFacility.averageGrade.toString().includes(this.search) || sportFacility.type.toLowerCase().includes(this.search.toLowerCase()) )
    }

  },
  methods:
  {
     getAll(){
      axios.get('http://localhost:8080/FitnessCenter/rest/facilities/GetAll')
          .then(response =>{
            this.sportFacilities =response.data
          })}
  }
}

</script>

<style scoped>
</style>