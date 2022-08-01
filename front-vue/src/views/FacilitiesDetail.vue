<template>

  <div class="row gy-2">
    <h3>Facility details</h3>
    <div class="col-sm"></div>
    <div class="col-sm">
    </div>
    <div class="col-sm"></div>

    <div  class="row gy-2 text-center bg-secondary text-white" >
      <!--      <router-link to="/facilitiesDetail">-->
      <div  class="container-sm d-flex align-items-center justify-content-center">

        <SportFacility :sportFacility="sportFacility"></SportFacility>
<!--        <h3>{{sportFacility.name}}</h3>
        <p>{{sportFacility.location}}</p>
        <p> {{convertStatus(sportFacility.worikng)}}</p>-->

      </div>
      <!--      </router-link>-->
    </div>

  </div>
<!--  <SportFacilitieDetailPage :sportFacility="sportFacility"/>-->
</template>

<script>
import SportFacilitieDetailPage from "@/components/SportFacilitieDetailPage";
import SportFacility from "@/components/SportFacility";
export default {
  name: "FacilitiesDetail",
  /*props:{ sportFacility: Object},*/
  data(){
    return{
     sportFacility:{
       sportFacilityId: '',
       name : '',
       location : '',
       isWorking : false,
       type : '',
       worikng:false,
       closeTime:'',
       openTime:'',
       averageGrade:'',
       facilityContent:[],

    }}
  },
  components: {SportFacility, SportFacilitieDetailPage},
  created() {
    console.log(this.sportFacility.name);
    /*console.log(this.$route.params.data);
    this.sportFacility = JSON.parse(JSON.stringify(this.$route.params.data));
    console.log(this.sportFacility.name);*/
    this.sportFacility = JSON.parse(this.$route.params.data);
  // this.sportFacility.name = this.$route.params.name;
  // this.sportFacility.location = this.$route.params.location;
    // this.sportFacility.worikng = this.$route.params.worikng;

},methods: {
    convertStatus(sportFacility) {
      // console.log(typeof(sportFacility.isWorking))
      if (sportFacility.worikng === true)
        return "Open";
      else
        return "Closed";
    }
  }
}
</script>

<style scoped>

</style>