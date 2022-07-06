<template>
  <div class="container-fluid">
    <div class="row">
      <nav @loggedUser="loggedInUser" class="navbar navbar-expand-xxl navbar-light" >
        <ul class="navbar-nav ms-auto text-center">
          <li>
          <router-link v-if="!loggedin" class="nav-link"  to="/login">Login</router-link>
          </li>
          <li>
            <router-link v-if="!loggedin" class="nav-link"  to="/register">Sign up</router-link>
          </li>
        </ul>

        <div>
          <button @click="logOut" v-if="loggedin" style="float: right">Log out</button>
        </div>
      </nav>
    </div>
<!--  <router-view/>-->
  </div>
  <SideBarView />
  <div class="container margin"  >
    <router-view @loggedUser="loggedInUser"/>
  </div>
</template>
<style>
.margin {
  margin-left: 300px;
  max-width: 1150px;

}
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#nav {
  padding: 30px;
}
#nav a {
  font-weight: bold;
  color: #2c3e50;
}
#nav a.router-link-exact-active {
  color: #42b983;
}
</style>

<!--<style>-->
<!--#app {-->
<!--  font-family: Avenir, Helvetica, Arial, sans-serif;-->
<!--  -webkit-font-smoothing: antialiased;-->
<!--  -moz-osx-font-smoothing: grayscale;-->
<!--  text-align: center;-->
<!--  color: #2c3e50;-->
<!--}-->

<!--nav {-->
<!--  padding: 30px;-->
<!--}-->

<!--nav a {-->
<!--  font-weight: bold;-->
<!--  color: #2c3e50;-->
<!--}-->

<!--nav a.router-link-exact-active {-->
<!--  color: #42b983;-->
<!--}-->
<!--</style>-->

<script>
import SideBarView from "@/components/SideBarView";
import { sidebarWidth } from '@/components/state'
import HeaderView from "@/views/HeaderView";
import axios from "axios";
export default {
  components: {
    SideBarView,
    HeaderView
  },
  data(){
    return{
      user: {
        username: '',
        password : '',

      },
      loggedin : false
    }
  },
  created()
  {

    axios.get('http://localhost:8080/FitnessCenter/rest/login/loggedUser')
        .then(response =>{
          this.user =response.data
          console.log(this.user.username)
        })
  },
  methods :{
    loggedInUser(obj){
     this.loggedin = obj;
     console.log("aaa")
    },
    isLoggedIn(user){/*
      if(user !== null){
        return true
      }else return false*/

    },
    logOut()
    {
      this.loggedin = false;
    }
  },
  setup(){
    return { sidebarWidth }
  }

}
</script>