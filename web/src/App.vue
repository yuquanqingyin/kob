<template>

  <NavBar></NavBar>
  <router-view/>
</template>

<script>
import NavBar from '@/components/NavBar.vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap/dist/js/bootstrap'


export default{
  name: "App",
  components: {
    NavBar,
  }

}


</script>


<style>

body{
  background-image: url(@/assets/images/background.png);
  background-size: cover;
}

</style>
