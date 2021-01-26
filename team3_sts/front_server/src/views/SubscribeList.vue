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
                    <v-list-item-title class="orange--text text--darken-3">순위</v-list-item-title>
                    <v-list-item-title class="orange--text text--darken-3">구독자</v-list-item-title>
                    <v-list-item-title class="orange--text text--darken-3">수익률</v-list-item-title>
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
                    <v-list-item-avatar size="10" color="orange darken-3"></v-list-item-avatar>
                    <v-list-item-title class="ml-n2">투자성향</v-list-item-title>
                    <v-list-item-subtitle>투자주식</v-list-item-subtitle>
                  </v-list-item>
                  <v-list-item>
                    <v-list-item-title class="orange--text text--darken-3">Mon</v-list-item-title>
                    <v-list-item-title class="orange--text text--darken-3">WED</v-list-item-title>
                    <v-list-item-title class="orange--text text--darken-3">FRI</v-list-item-title>
                    <v-list-item-title class="orange--text text--darken-3">SUN</v-list-item-title>
                  </v-list-item>
                  <v-list-item class="mt-n5">
                    <v-list-item-subtitle>2 times in a day before food</v-list-item-subtitle>
                  </v-list-item>
                  <v-divider></v-divider>
                </v-list> -->

                <!-- 왼쪽 프로필 Box2-1  -------------------->
                <v-list two-line="" subheader="">
                  <v-list-item>
                    <!-- 레벨에 따라서 이미지 변경 필요 : if문 -->
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

                <!-- 왼쪽 프로필 Box2-2  -------------------->
                <!--투자성향, 연봉, 재산: 회원 DB -->
                <v-list two-line="" subheader="">
                  <v-list-item>
                      <v-list-item-avatar size="10" color="orange darken-3"></v-list-item-avatar>
                      <v-list-item-title class="ml-n2">투자성향</v-list-item-title>
                      <v-list-item-subtitle>단타위주</v-list-item-subtitle>
                  </v-list-item>

                  <v-list-item>
                      <v-list-item-avatar size="10" color="orange darken-3"></v-list-item-avatar>
                      <v-list-item-title class="ml-n2">연봉</v-list-item-title>
                      <v-list-item-subtitle>5,000만원</v-list-item-subtitle>
                  </v-list-item>

                  <v-list-item>
                      <v-list-item-avatar size="10" color="orange darken-3"></v-list-item-avatar>
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
                    <v-list-item-title class="orange--text text--darken-3">소개글</v-list-item-title>
                    <!-- <v-list-item-title class="orange--text text--darken-3">Time</v-list-item-title> -->
                  </v-list-item>
                  <v-list-item class="mt-n10" >
                    <v-list-item-title >나는야 파개미!! 주식을 좋아하지</v-list-item-title>
                    <!-- <v-list-item-title >12:45</v-list-item-title> -->
                  </v-list-item>
                  <v-divider></v-divider>
                </v-list>

              </v-card>
            </v-flex>            
          </v-container>
        </v-app>
      </v-flex>

  <!-- 오른쪽 화면-------------------------------------------->
  <v-flex md9 >
    <v-app :style="{background: $vuetify.theme.themes.dark.background}" class="rounded">
      <v-container>
        <v-flex>
          <v-list class="mt-5" align="center" justify="center">
            <v-list-item>
              <v-list-item-title class="orange--text text--darken-3">구독한 옆집 개미들</v-list-item-title>
                <v-list-item-action>
                  <!-- SEE-ALL 버튼 숨김 -->
                  <!-- <v-btn class="ma-2" tile outlined="" color="orange darken-3"> -->
                    <!-- <v-icon left>fas fa-eye</v-icon> See ALL -->
                  <!-- </v-btn> -->
                </v-list-item-action>             

            </v-list-item>

            <!-- <v-list-item class="mt-5" align="center" justify="center">
                <v-card>
                        <v-card-title>
                        <v-text-field
                            v-model="search"
                            append-icon="mdi-magnify"
                            label="Search"
                            single-line
                            hide-details
                        ></v-text-field>
                        </v-card-title>
                        <v-data-table
                        :headers="headers"
                        :items="desserts"
                        :search="search"
                        ></v-data-table>
                    </v-card>
            </v-list-item> -->

          </v-list>
          
        </v-flex>
  
        <v-flex class="mt-5" >
            <v-row align="center" justify="center">
            <v-col>
                <v-card>
                        <v-card-title>
                        <v-text-field
                            v-model="search"
                            append-icon="mdi-magnify"
                            label="Search"
                            single-line
                            hide-details
                        ></v-text-field>
                        </v-card-title>
                        <v-data-table 
                        :headers="headers"
                        :items="desserts"
                        :search="search"
                        :move="move"
                        ></v-data-table>
                    </v-card>
            </v-col>
        </v-row>
        </v-flex>
<!-- 
  <v-flex class="mt-12">
    <v-row no-gutters="">
      <v-col cols="12" md="4"> -->



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
      
  }),
  
  
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


<script>
export default {
  data: () => ({
//테이블
    search: '',
    headers: [
      {
        text: '아이디',
        align: 'start',
        sortable: false,
        value: 'id',
      },
      { text: '이름', value: 'name' },
      { text: '레벨', value: 'grade' },
      { text: '투자성향', value: 'investOpt' },    
      { text: '순위', value: 'ranking' },
      { text: '수익률', value: 'earningRate' },
      { text: '이동', value: 'move' },
      
    ],
    desserts: [
      {
        id: 'koscom2',
        name: '윤하은',
        grade: 'LV.2 초개미',
        investOpt: '단타위주',
        ranking: '2위',
        earningRate: '25.71%',
        move: '놀러가기',
      },
      {
        id: 'koscom3',
        name: '안기현',
        grade: 'LV3. 노개미',
        investOpt: '투자주식',
        ranking: '3위',
        earningRate: '25.71%',
        move: '놀러가기',
      },
      {
        id: 'koscom4',
        name: '조태율',
        grade: 'LV4. 빨개미',
        investOpt: '투자주식',
        ranking: '4위',
        earningRate: '25.71%',
        move: '놀러가기',
      },
      {
        id: 'koscom5',
        name: '노영록',
        grade: 'LV.1 파개미',
        investOpt: '투자주식',
        ranking: '5위',
        earningRate: '25.71%',
        move: '놀러가기',
      },
      {
        id: 'koscom6',
        name: '이예은',
        grade: 'LV.2 초개미',
        investOpt: '투자주식',
        ranking: '6위',
        earningRate: '25.71%',
        move: '놀러가기',
      },
      {
        id: 'koscom7',
        name: '이영인',
        grade: 'LV3. 노개미',
        investOpt: '투자주식',
        ranking: '7위',
        earningRate: '25.71%',
        move: '놀러가기',
      },
      {
        id: 'koscom8',
        name: '박용수',
        grade: 'LV4. 빨개미',
        investOpt: '위험은조금만',
        ranking: '8위',
        earningRate: '25.71%',
        move: '놀러가기',
      },
      {
        id: 'koscom9',
        name: '김태현',
        grade: 'LV.1 파개미',
        investOpt: '위험은조금만',
        ranking: '9위',
        earningRate: '25.71%',
        move: '놀러가기',
      },
      {
        id: 'koscom10',
        name: '김수아',
        grade: 'LV.2 초개미',
        investOpt: '투자주식',
        ranking: '10위',
        earningRate: '25.71%',
        move: '놀러가기',
      },
      
    ],
  }),
}
</script>



<style scoped>
.rounded {
  border-top-left-radius: 50px;
  border-bottom-left-radius: 50px;
}
</style>

