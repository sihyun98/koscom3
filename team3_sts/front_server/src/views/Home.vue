<template>
  <v-app :style="{background: $vuetify.theme.themes.light.background}">
    <v-layout row>      
      <v-flex md3>
        <v-app :style="{background: $vuetify.theme.themes.light.background}">
          <v-container>

            <!-- 왼쪽 프로필 Box1-------------------------------------------->
            <v-flex>
              <v-card class="ma-5 text-center mt-8" shaped elevation="10">
                <v-avatar class="mt-n7" size="60" elevation="10">
                  <!-- 프로필(개인) 이미지 -->
                  <img src="../assets/img8.png">
                </v-avatar>

                <!-- 이름: 회원DB NAME -->            
                <v-card-title class="layout justify-center">{{ loginId }} 차예린</v-card-title>
                <!-- 나이, 직업: 회원DB -->
                <v-card-subtitle class="layout justify-center">28세, 사무직</v-card-subtitle>
                <v-list class="mt-n5">
                  <v-list-item>
                    <!-- 순위, 구독자, 수익률: TEXT  -->
                    <v-list-item-title class="cyan--text text--darken-1">순위</v-list-item-title>
                    <v-list-item-title class="cyan--text text--darken-1">구독자</v-list-item-title>
                    <v-list-item-title class="cyan--text text--darken-1">수익률</v-list-item-title>
                  </v-list-item>
                  <v-list-item class="mt-n5">
                    <!-- 순위: 계산, 구독자: 구독 DB, 수익률: 계산 -->
                    <v-list-item-subtitle>1위</v-list-item-subtitle>
                    <v-list-item-subtitle>1.2만</v-list-item-subtitle>
                    <v-list-item-subtitle>543%</v-list-item-subtitle>
                  </v-list-item>
                </v-list>
              </v-card>
            </v-flex>

            <!-- 왼쪽 프로필 Box2-------------------------------------------->
            <v-flex>
              <v-card class="ma-5 mt-n2" shaped elevation="10">
                <!-- <v-list>
                  <v-list-item>
                    <v-list-item-avatar size="10" color="cyan darken-1"></v-list-item-avatar>
                    <v-list-item-title class="ml-n2">투자성향</v-list-item-title>
                    <v-list-item-subtitle>투자주식</v-list-item-subtitle>
                  </v-list-item>
                  <v-list-item>
                    <v-list-item-title class="cyan--text text--darken-1">Mon</v-list-item-title>
                    <v-list-item-title class="cyan--text text--darken-1">WED</v-list-item-title>
                    <v-list-item-title class="cyan--text text--darken-1">FRI</v-list-item-title>
                    <v-list-item-title class="cyan--text text--darken-1">SUN</v-list-item-title>
                  </v-list-item>
                  <v-list-item class="mt-n5">
                    <v-list-item-subtitle>2 times in a day before food</v-list-item-subtitle>
                  </v-list-item>
                  <v-divider></v-divider>
                </v-list> -->

                <!-- v-list -------------------->
                <v-list two-line="" subheader="">
                  <v-list-item>
                    <v-list-item-avatar size="50">
                      <img src="../assets/imglv1.png">
                    </v-list-item-avatar>
                    <v-list-item-content class="ml-n2">

                      <!--레벨: 회원 DB -->
                      <v-list-item-title>LV1. 파개미</v-list-item-title>
                      <!-- <v-list-item-subtitle>California Hospital Medical</v-list-item-subtitle> -->
                    </v-list-item-content>
                  </v-list-item>
                  <v-divider></v-divider>
                </v-list>

                <!-- <v-list two-line="" subheader="" class="mt-n5">
                  <v-list-item>
                    <v-list-item-title>투자성향</v-list-item-title>
                    <v-list-item-subtitle>단타위주</v-list-item-subtitle>
                  </v-list-item>               
                </v-list> -->

                <!-- v-list -------------------->
                <!--투자성향, 연봉, 재산: 회원 DB -->
                <v-list two-line="" subheader="">
                  <v-list-item>
                      <v-list-item-avatar size="10" color="cyan darken-1"></v-list-item-avatar>
                      <v-list-item-title class="ml-n2">투자성향</v-list-item-title>
                      <v-list-item-subtitle>단타위주</v-list-item-subtitle>
                  </v-list-item>

                  <v-list-item>
                      <v-list-item-avatar size="10" color="cyan darken-1"></v-list-item-avatar>
                      <v-list-item-title class="ml-n2">연봉</v-list-item-title>
                      <v-list-item-subtitle>5,000만원</v-list-item-subtitle>
                  </v-list-item>

                  <v-list-item>
                      <v-list-item-avatar size="10" color="cyan darken-1"></v-list-item-avatar>
                      <v-list-item-title class="ml-n2">재산</v-list-item-title>
                      <v-list-item-subtitle>3,000만원</v-list-item-subtitle>
                  </v-list-item>
                
                <!-- <v-list two-line="" subheader="" class="mt-n5">
                  <v-list-item>
                    <v-list-item-title>Surgeon</v-list-item-title>
                    <v-list-item-subtitle>spinal pain</v-list-item-subtitle>
                  </v-list-item>               
                </v-list>

                <v-list two-line="" subheader="" class="mt-n5">
                  <v-list-item>
                    <v-list-item-title>Surgeon</v-list-item-title>
                    <v-list-item-subtitle>spinal pain</v-list-item-subtitle>
                  </v-list-item>               
                </v-list> -->
                  <v-divider></v-divider>
                </v-list>

                <!-- v-list -------------------->
                <!-- 소개글: 회원 DB -->
                <v-list two-line="" subheader="" > <!--class="my-n8">  -->                
                  <v-list-item>
                    <v-list-item-title class="cyan--text text--darken-1">소개글</v-list-item-title>
                    <!-- <v-list-item-title class="cyan--text text--darken-1">Time</v-list-item-title> -->
                  </v-list-item>
                  <v-list-item class="mt-n10">
                    <v-list-item-title >나는야 파개미</v-list-item-title>
                    <!-- <v-list-item-title >12:45</v-list-item-title> -->
                  </v-list-item>
                  <v-divider></v-divider>
                </v-list>

              </v-card>
            </v-flex>

            <!-- 왼쪽 프로필 Box3-------------------------------------------->
            <v-flex>
              <v-card class="ma-5 text text-center mt-6" shaped elevation="10">
                <v-list-item three-line>
                  <v-list-item-content>
                    <v-list-item-title class="headline mb-1"> 구독하기
                      <!-- <v-icon>구독하기</v-icon>                         -->
                     </v-list-item-title>
                    <!-- <v-list-item-subtitle>2345 4546 7889 5432</v-list-item-subtitle>  -->
                  </v-list-item-content>
                  <v-list-item-avatar size="60" color="cyan darken-1">
                    <v-icon color="white">fas fa-plus</v-icon>
                  </v-list-item-avatar>
                </v-list-item>
              </v-card>
            </v-flex>
          </v-container>
        </v-app>
      </v-flex>

  <v-flex md9>
    <v-app :style="{background: $vuetify.theme.themes.dark.background}" class="rounded">
      <v-container>
        <v-flex>
          <v-list class="mt-5">
            <v-list-item>
              <v-list-item-title class="cyan--text text--darken-1">Examiniations</v-list-item-title>
                <v-list-item-action>
                  <v-btn class="ma-2" tile outlined="" color="cyan darken-1">
                    <v-icon left>fas fa-eye</v-icon> See ALL
                  </v-btn>
                </v-list-item-action>
            </v-list-item>
          </v-list>
        </v-flex>
  <v-flex>
    <v-row no-gutter>
      <v-col cols="12" md="4">
        <v-row>
          <v-col cols="12" md="2">
            <v-card height="80px" width="10px" color="green"></v-card>
          </v-col>
          <v-col cols="12" md="10">
            <v-list two-line="" subheader="" class="ml-n8">
              <v-list-item>
                <v-list-item-content>
                  <v-list-item-subtitle>21 Jul, 2019</v-list-item-subtitle>
                    <v-list-item-title>Hypertensive crisis</v-list-item-title>
                    <v-list-item-subtitle>Ongoing tratment</v-list-item-subtitle>
                </v-list-item-content>
              </v-list-item>
            </v-list>
          </v-col>
        </v-row>
      </v-col>
      <v-col cols="12" md="4">
        <v-row>
          <v-col cols="12" md="2">
            <v-card height="80px" width="10px" color="red"></v-card>
          </v-col>
          <v-col cols="12" md="10">
            <v-list two-line subheader class="ml-n8">
              <v-list-item>
                <v-list-item-content>
                  <v-list-item-subtitle>18 Jul, 2019</v-list-item-subtitle>
                  <v-list-item-title>Osteoporosis</v-list-item-title>
                  <v-list-item-subtitle>Incurable</v-list-item-subtitle>
                </v-list-item-content>
              </v-list-item>
            </v-list>
          </v-col>
        </v-row>
      </v-col>

      <v-col cols="12" md="4">
        <v-row>
          <v-col cols="12" md="2">
            <v-card height="80px" width="10px" color="grey"></v-card>
          </v-col>
          <v-col cols="12" md="10">
            <v-list two-line subheader class="ml-n8">
              <v-list-item>
                <v-list-item-content>
                  <v-list-item-subtitle>21 Jul, 2019</v-list-item-subtitle>
                  <v-list-item-title>Hypertensive crisis</v-list-item-title>
                  <v-list-item-subtitle>Examiniations</v-list-item-subtitle>
                </v-list-item-content>
              </v-list-item>
            </v-list>
          </v-col>
        </v-row>
      </v-col>

    </v-row>
  </v-flex>
  <v-flex class="mt-12">
    <v-row no-gutters="">
      <v-col cols="12" md="8">
        <v-flex>
          <v-list class="mt-5">
            <v-list-item>
              <v-list-item-title class="cyan--text text--darken-1">Health Curve</v-list-item-title>
              <v-item-content>
                <v-btn class="mr-1" outlined color="cyan darken-1">D</v-btn>
              </v-item-content>
              <v-item-content>
                <v-btn class="mr-1" outlined color="cyan darken-1">W</v-btn>
              </v-item-content>
              <v-item-content>
                <v-btn class="mr-1" outlined color="cyan darken-1">M</v-btn>
              </v-item-content>
              <v-item-content>
                <v-btn outlined color="cyan darken-1">Y</v-btn>
              </v-item-content>
            </v-list-item>
          </v-list>
        </v-flex>
        <v-flex>
          <v-sparkline
          :value="value"
          :gradient="gradient"
          :smooth="radius || false"
          :padding="padding"
          :line-width="width"
          :stroke-linCap="lineCap"
          :gradient-direction="gradientDirection"
          :fill="fill"
          :type="type"
          :auto-line-width="autoLineWidth"
          auto-draw=""
          >
          </v-sparkline>
        </v-flex>

        <v-flex class="mt-5">
          <v-list class="ml-5">
            <v-list-item>
              <v-list-item-avatar color="cyan darken-1" size="20px"></v-list-item-avatar>
              <v-list-item-title>Average</v-list-item-title>
              <v-list-item-avatar color="cyan darken-1" size="20px"></v-list-item-avatar>
              <v-list-item-title class="ml-5">My Data</v-list-item-title>
            </v-list-item>
          </v-list>
        </v-flex>
        </v-col>
        <v-col cols="12" md="4">
          <v-flex class="ml-10">
            <v-list>
              <v-list-item>
                <v-list-item-title class="cyan--text text--darken-1">Nearest Treatment & Advice</v-list-item-title>
              </v-list-item>
            </v-list>
          </v-flex>
          <v-flex class="ml-10">
            <v-row>
              <v-date-picker
              v-model="date2"
              :event-color="date => date[9] % 2 ? 'red' : 'yellow'"
              :events="functionEvents"
              color="cyan darken-1"
              >

              </v-date-picker>
            </v-row>
          </v-flex>
        </v-col>

    </v-row>
  </v-flex>
      </v-container>

    </v-app>
  </v-flex>
    </v-layout>
  </v-app>
</template>

<script>
// import store from "../store/index"

// import userId from "../store/variable";
const gradients = [
  ['#222'],
    ['#42b3f4'],
    ['red', 'orange', 'yellow'],
    ['purple', 'violet'],
    ['#00c6ff', '#F0F', '#FF0'],
    ['#f72047', '#ffd200', '#1feaea'],
]
export default {
  // props: ["num"],
  data: () => ({
    with: 2,
    radius: 10,
    padding: 8,
    lineCap: 'round',
    gradient: gradients[5],
    value: [0, 2, 5, 9, 5, 10, 3, 5, 0, 0, 1, 8, 2, 9, 0],
    gradientDirection: 'top',
    gradients,
    fill: false,
    type: 'trend',
    autoLineWidth: false,
    arrayEvents: null,
    date2: new Date().toISOString().substr(0,10),

    // id: userId,
  }),
  created(){
    // console.log("id : " + $store.getters.Id);
    // console.log("id : " + this.$store);
    // console.log(this.id);
    // console.log(this.loginId);
    // console.log(this.num);
  },
  computed: {
    theme(){
      return this.$vuetify.theme.dark ? "dark" :"light";
    }
  },
  mounted (){
    this.arrayEvents = [...Array(6)].map(() => {
      const day = Math.floor(Math.random() * 30)
      const d = new Date()
      d.setDate(day)
      return d.toISOString().substr(0,10)
    })
  },
  methods: {
    functionEvents (date) {
      const [,, day] = date.split('-')
      if ([12, 17, 28].includes(parseInt(day, 10))) return true
      if ([1, 19, 22].includes(parseInt(day,10))) return ['red', '#00f']
      return false
    },
  }
}
</script>
<style scoped>
.rounded {
  border-top-left-radius: 50px;
  border-bottom-left-radius: 50px;
}
</style>