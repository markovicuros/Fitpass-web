<template>
  <div class="d-inline text-light justify-content-center align-items-center color-overlay  form rounded p-4 p-sm-3"  >
  <form @submit.prevent="handleLogin">
    <h3>Login</h3>
    <div>
    <div class="form-group">
      <label>Username:</label>
      <input type="text" v-model="user.username">
    </div>
    <div class="form-group">
      <label>Password:</label>
      <input type="password" autocomplete="on" v-model="user.password">
    </div>
<!--    <button  type="button"  class="btn btn-primary"> Log in</button>-->
    <input  type="submit" class="btn btn-primary" value="Log in"/>
    </div>
  </form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "Login",
  data(){
    return{
      user : {
        username: '',
        password : ''
      }
    }
  },
  methods :{
    handleLogin(){
       axios.post('http://localhost:8080/FitnessCenter/rest/login/logInStatus',this.user)
              .then(
                  res =>{
                      if(res.data) {
                        const loggIn = this.user;
                        console.log(this.user.username);
                        this.$emit('loggedUser',res.data);
                        //console.log(res.data);
                      }
              }
          )
          .catch(
              error =>
              {
                console.log(error)
              }
          )

      /*localStorage.setItem('token', user.data.token)*/
    }
  },
  emits:['loggedUser']
}
</script>

<style scoped>
.color-overlay {
 position: absolute;
background: #2f855a;
  height: 40%;
  width: 40%;
  mix-blend-mode: normal;

}
.masthed{
  min-height: 100vh;
  position: relative;

}
.form{
  background: #263E51;
  box-shadow: 5px 5px 5px rgba(0,0,0,0.2);
}

</style>