// import serviceApi from './serviceApi'
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
        // GE_userId: state => state.userId,
    },
    actions: {
        ac_getId ({ commit }, username, password) {
            axios.post('/api/member/signin', { username: username, password: password })
            .then(res => {
                if(res.data.code == "OK"){
                    
                    commit('mu_getId', res.data.message)
                    // state.index = res.data.message;
                    // console.log(state.index);
                }
                else{
                    console.log("아이디 또는 비밀번호를 확인해주세요.");
                }
            })
        }
        // AC_userId: ({ commit }, payload => {
        //     serviceApi.getId(payload, res => {
        //         if(res.data.code === "OK") {
        //             commit('MU_userId', res.data.message)
        //         }else{
        //             console.log('일치하는 회원이 없습니다.')
        //         }
        //     }, err => {
        //         console.log(err)
        //     })
        // })
    },
    mutations: {
        mu_getId (state, num) {
            state.userId = num
        }
        // MU_userId: (state, payload) => {
        //     state.userId = payload
        // }
    },
})

// const state = {
//     userId: 0
// }

// const getters = {
//     GE_userId: state => state.userId,
// }

// const actions = {
//     AC_userId: ({ commit }, payload => {
//         serviceApi.getId(payload, res => {
//             if(res.data.code === "OK") {
//                 commit('MU_userId', res.data.message)
//             }else{
//                 console.log('일치하는 회원이 없습니다.')
//             }
//         }, err => {
//             console.log(err)
//         })
//     })
// }

// const mutations = {
//     MU_userId: (state, payload) => {
//         state.userId = payload
//     }
// }

// export default {
//     namespaced: true,
//     state,
//     getters,
//     actions,
//     mutations
// }