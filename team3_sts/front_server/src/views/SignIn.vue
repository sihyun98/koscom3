<template>

  <v-row justify="center">
    <v-col
      cols="12"
      sm="10"
      md="8"
      lg="6"
    >
      <v-card ref="form">
        <v-card-text>
          <v-text-field
            ref="username"
            v-model="username"
            :rules="[() => !!username || '필수 입력 항목입니다.']"
            label="사용자 아이디"
            placeholder=""
            required
          ></v-text-field>
          <v-text-field
            ref="password"
            v-model="password"
            :rules="[() => !!password || '필수 입력 항목입니다.']"
            label="비밀번호"
            placeholder=""
            required
          ></v-text-field>
          
        </v-card-text>
        <v-divider class="mt-12"></v-divider>
        <v-card-actions>
          <v-btn text>
            취소
          </v-btn>
          <v-spacer></v-spacer>
          <v-btn
            color="primary"
            text
            @click="submit"
          >
            로그인
          </v-btn>
          <!-- <childhome v-bind:num="index"></childhome> -->
        </v-card-actions>
      </v-card>
    </v-col>
  </v-row>
</template>

<script>
import axios from "axios"
// import ChildHome from "./Home.vue"

  export default {
    // components: {
    //     childhome: ChildHome
    // },
    data: () => ({
      username: null,
      password: null,
    //   index: 0
    }),

    computed: {
      form () {
        return {
          username: this.username,
          password: this.password,
        }
      },
    },

    watch: {
      name () {
        this.errorMessages = ''
      },
    },

    methods: {
      submit () {
        //   this.$getId(this.form);
        //   location.href = "home";

          axios.post('/api/member/signin', this.form)
          .then(res => {
              if(res.data.code == "OK"){
                //   this.index = res.data.message;
                //   console.log(this.index);
                  location.href = "home";
              }
              else{
                  console.log("아이디 또는 비밀번호를 확인해주세요.");
              }
          })
      },
    },
  }
</script>