// import { getOwnPropertyDescriptor } from 'core-js/fn/object'
import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios"

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    index: 0
  },
  mutations: {
    // increment (state) {
    //   state.count++
    // },
    // decrement (state) {
    //   state.count--
    // }
    getId (state, username, password) {
        // axios.post('/api/member/signin', this.form)
        //   .then(res => {
        //       if(res.data.code == "OK"){
        //         //   this.index = res.data.message;
        //         //   console.log(this.index);
        //           location.href = "home";
        //       }
        //       else{
        //           console.log("아이디 또는 비밀번호를 확인해주세요.");
        //       }
        //   })
        axios.post('/api/member/signin', { username: username, password: password })
        .then(res => {
            if(res.data.code == "OK"){
                state.index = res.data.message;
                // console.log(state.index);
            }
            else{
                console.log("아이디 또는 비밀번호를 확인해주세요.");
            }
        })
    }
  },
  getters: {
      userId(state) {
          return state.index;
      }
  }
})