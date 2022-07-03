<template>
  <form @submit.prevent="handleSubmit">
    <h3>Sign up</h3>

    <div class="form-group">
      <label>Name:</label>
      <input type="text" v-model="name">
    </div>

    <div class="form-group">
      <label>Surname:</label>
      <input type="text" v-model="surname">
    </div>

    <div class="form-group">
      <label>Username:</label>
      <input type="text" v-model="username">
    </div>

    <div class="form-group">
      <label>Password:</label>
      <input type="password" v-model="password" autocomplete="off">
    </div>

    <div class="form-group">
      <label>Gender:</label>
      <select v-model="gender" >
        <option>MALE</option>
        <option>FEMALE</option>
      </select>
    </div>

    <div class="form-group">
      <label>Birthday:</label>
      <input type="date" v-model="birthdate">
    </div>

    <input  type="submit" class="btn btn-primary" value="Sign up"/>
  </form>
</template>

<script>
import axios from "axios";

export default {
  name: "Register",
  data(){
    return{
      name : '',
      surname : '',
      username : '',
      password : '',
      gender : '',
      birthdate : ''
    }
  },
  methods:{
    handleSubmit(){
      const user = {
        name : this.name,
        surname : this.surname,
        username : this.username,
        password : this.password,
        gender : this.gender,
        birthday : this.birthdate

      }
          axios.post('http://localhost:8080/FitnessCenter/rest/customers/Create',user)
              .then(
                  res =>{
                    console.log(res)
                  }
              )
              .catch(
                  error =>
                  {
                    console.log(error)
                  }
              )
            this.$router.push('/login')
    }
  }
}
</script>

<style scoped>

</style>