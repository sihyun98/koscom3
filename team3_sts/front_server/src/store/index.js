import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

// Vue.prototype.$id = 0
// new Vue({
//   beforeCreate: function(){
//     console.log(this.$id)
//   }
// })

export default new Vuex.Store({
  state: {},
  mutations: {},
  actions: {},
  modules: {},


  // methods: {
  //   getId (this.form) {
  //       axios.post('/api/member/signin', this.form)
  //       .then(res => {
  //           if(res.data.code == "OK"){
  //               this.$id = res.data.message;
  //               console.log(this.$id);
  //               // location.href = "home";
  //           }
  //           else{
  //               console.log("아이디 또는 비밀번호를 확인해주세요.");
  //           }
  //       })
  //   },
  // },
});