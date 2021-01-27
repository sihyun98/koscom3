// Store......ㅜㅜ

import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

export default new Vuex.Store({
    namespaced: true,
    state: {
        userId: 0
    },
    getters: {
        getId (state) {
            return state.userId;
        }
    },
    actions: {
        ac_getId ({ commit }, username, password) {
            axios.post('/api/member/signin', { username: username, password: password })
            .then(res => {
                if(res.data.code == "OK"){
                    commit('mu_getId', res.data.message)
                }
                else{
                    console.log("아이디 또는 비밀번호를 확인해주세요.");
                }
            })
        }
    },
    mutations: {
        mu_getId (state, num) {
            state.userId = num
        }
    },
})