var sportFacilities = new Vue({
    el:'#sportsFacilities',
    data:{
        sportFacilities: null,
        title: "Sports Facilities"
    },
    mounted(){
        axios.get('rest/facilities/GetAll')
             .then(response =>(this.sportFacilities = response.data))
    },
    methods:{
		convertStatus: function(sf) {
			
			if(sf.isWorking===true)
				return "Radi";
				else
				return "Ne radi";
		}
    }
});