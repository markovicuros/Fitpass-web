<template>
<Login @loggedUser="emitLoggedUser" />
</template>

<script>
import Login from "@/components/Login";
import axios from "axios";
export default {
  name: "LoginView",

  data(){
    return{
      user : {
        username: '',
        password: ''
      },
      logged:false
    }
  },
  created()
      {

         /* axios.get('http://localhost:8080/FitnessCenter/rest/login/loggedUser')
              .then(response =>{
               /!* console.log('aaa')*!/
                this.user =response.data
                console.log(this.user.username)
              })*/

      },
    methods: {
    emitLoggedUser(user) {
      //this.user = event;
      this.logged = user
      this.$emit('loggedUser', this.logged);
      console.log(this.logged);/*
      this
      console.log(this.user.username);*/
      this.$router.push('/')
    }
    },
  components: {Login},
  emits: ['loggedUser'],
}
</script>

<style scoped>

</style>