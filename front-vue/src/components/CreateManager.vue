<template>
  <form @submit.prevent="ManagerSubmit">
    <h3>Add manager</h3>

    <div class="form-group">
      <label>Name:</label>
      <input type="text" v-model="manager.name">
    </div>

    <div class="form-group">
      <label>Surname:</label>
      <input type="text" v-model="manager.surname">
    </div>

    <div class="form-group">
      <label>Username:</label>
      <input type="text" v-model="manager.username">
    </div>

    <div class="form-group">
      <label>Password:</label>
      <input type="password" v-model="manager.password" autocomplete="off">
    </div>

    <div class="form-group">
      <label>Gender:</label>
      <select v-model="manager.gender" >
        <option>MALE</option>
        <option>FEMALE</option>
      </select>
    </div>

    <div class="form-group">
      <label>Birthday:</label>
      <input type="date" v-model="manager.birthday">
    </div>

    <input  type="submit" class="btn btn-primary" value="Add"/>
  </form>
</template>

<script>
import axios from "axios";

export default {
  name: "CreateManager",
  data() {
    return{
      manager :{
        username: '',
        password : '',
        name : '',
        surname : '',
        birthday : '',
        gender : '',
        userRole : '',
       /* deleted : false,
        banned : false,*/
        sportFacilityId: ''
      }
    }
  },
  methods : {
    ManagerSubmit(){
      console.log(this.manager);
      axios.post('http://localhost:8080/FitnessCenter/rest/managers/create',this.manager)
          .then(
              res =>{
                console.log(res.data)
              }
          )
          .catch(
              error =>
              {
                console.log(error)
              }
          )
    }
  }
}
</script>

<style scoped>

</style>