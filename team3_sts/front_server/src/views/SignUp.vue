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
            ref="name"
            v-model="name"
            :rules="[() => !!name || '필수 입력 항목입니다.']"
            :error-messages="errorMessages"
            label="이름"
            placeholder="홍길동"
            required
          ></v-text-field>
          <v-text-field
            ref="username"
            v-model="username"
            :rules="[
              () => !!username || '필수 입력 항목입니다.']"
            label="사용자 아이디"
            placeholder=""
            required
          ></v-text-field>
          <v-text-field
            ref="password"
            v-model="password"
            :rules="[
                () => !!password || '필수 입력 항목입니다.',
                () => !!password && password.length >= 8 || '8자리 이상의 비밀번호를 입력해 주세요.']"
            label="비밀번호"
            placeholder=""
            counter="8"
            required
          ></v-text-field>
          <v-text-field
            ref="age"
            v-model="age"
            :rules="[() => !!age || '필수 입력 항목입니다.']"
            label="나이"
            required
            placeholder=""
          ></v-text-field>
          <v-text-field
            ref="job"
            v-model="job"
            :rules="[() => !!job || '필수 입력 항목입니다.']"
            label="직업"
            required
            placeholder=""
          ></v-text-field>
          <v-autocomplete
            ref="investOpt"
            v-model="investOpt"
            :rules="[() => !!investOpt || '필수 입력 항목입니다.']"
            :items="investOpts"
            label="투자성향"
            placeholder="선택"
            required
          ></v-autocomplete>
          <v-text-field
            ref="salary"
            v-model="salary"
            :rules="[() => !!salary || '필수 입력 항목입니다.']"
            label="연봉"
            required
            placeholder=""
          ></v-text-field>
          <v-text-field
            ref="property"
            v-model="property"
            :rules="[() => !!property || '필수 입력 항목입니다.']"
            label="자산"
            required
            placeholder=""
          ></v-text-field>
          <v-text-field
            ref="profile"
            v-model="profile"
            :rules="[() => !!profile || '필수 입력 항목입니다.']"
            label="나의 한마디"
            required
            placeholder=""
          ></v-text-field>
        </v-card-text>
        <v-divider class="mt-12"></v-divider>
        <v-card-actions>
          <v-btn text>
            취소
          </v-btn>
          <v-spacer></v-spacer>
          <!-- <v-slide-x-reverse-transition>
            <v-tooltip
              v-if="formHasErrors"
              left
            >
              <template v-slot:activator="{ on, attrs }">
                <v-btn
                  icon
                  class="my-0"
                  v-bind="attrs"
                  @click="resetForm"
                  v-on="on"
                >
                  <v-icon>mdi-refresh</v-icon>
                </v-btn>
              </template>
              <span>Refresh form</span>
            </v-tooltip>
          </v-slide-x-reverse-transition> -->
          <v-btn
            color="primary"
            text
            @click="submit"
          >
            가입하기
          </v-btn>
        </v-card-actions>
      </v-card>
    </v-col>
  </v-row>
</template>

<script>
import axios from "axios"
  export default {
    data: () => ({
        investOpts: ['위험형', '적극투자형'],
    //   errorMessages: '',
      name: null,
      username: null,
      password: null,
      age: null,
      job: null,
      investOpt: null,
      salary: null,
      property: null,
      profile: null,
    }),

    computed: {
      form () {
        return {
          name: this.name,
          username: this.username,
          password: this.password,
          age: this.age,
          job: this.job,
          investOpt: this.investOpt,
          salary: this.salary,
          property: this.property,
          profile: this.profile,
        }
      },
    },

    watch: {
      name () {
        this.errorMessages = ''
      },
    },

    methods: {
      // addressCheck () {
      //   this.errorMessages = this.address && !this.name
      //     ? `Hey! I'm required`
      //     : ''

      //   return true
      // },
      // resetForm () {
      //   this.errorMessages = []
      //   this.formHasErrors = false

      //   Object.keys(this.form).forEach(f => {
      //     this.$refs[f].reset()
      //   })
      // },
      submit () {

          axios.post('/api/member', this.form)
          .then(res => {
              console.log(res);
          })

        // this.formHasErrors = false

        // Object.keys(this.form).forEach(f => {
        //   if (!this.form[f]) this.formHasErrors = true

        //   this.$refs[f].validate(true)
        // })
      },
    },
  }
</script>