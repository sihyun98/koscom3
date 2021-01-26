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
                <v-card-title class="layout justify-center">{{ name }}</v-card-title>
                <!-- 나이, 직업: 회원DB -->
                <v-card-subtitle class="layout justify-center">{{age}}세, {{job}}</v-card-subtitle>
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
                      <div v-if="grade === 'LV.1 파개미' ">
                        <img src="../assets/imglv1.png" width="30">
                      </div>
                      <div v-else-if="grade === 'LV.2 초개미' ">
                        <img src="../assets/imglv2.png">
                      </div>
                      <div v-else-if="grade === 'LV.3 노개미' ">
                        <img src="../assets/imglv3.png">
                      </div>
                      <div v-else-if="grade === 'LV.4 빨개미' ">
                        <img src="../assets/imglv4.png">
                      </div>
                      <div v-else>
                        <img src="../assets/imglv1.png">
                      </div>
                    </v-list-item-avatar>
                    <v-list-item-content class="ml-n2">

                      <!--레벨: 회원 DB -->
                      <v-list-item-title>{{grade}}</v-list-item-title>
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
                      <v-list-item-subtitle>{{investOpt}}</v-list-item-subtitle>
                  </v-list-item>

                  <v-list-item>
                      <v-list-item-avatar size="10" color="orange darken-3"></v-list-item-avatar>
                      <v-list-item-title class="ml-n2">연봉</v-list-item-title>
                      <v-list-item-subtitle>{{salary}}만원</v-list-item-subtitle>
                  </v-list-item>

                  <v-list-item>
                      <v-list-item-avatar size="10" color="orange darken-3"></v-list-item-avatar>
                      <v-list-item-title class="ml-n2">재산</v-list-item-title>
                      <v-list-item-subtitle>{{property}}만원</v-list-item-subtitle>
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
                    <v-list-item-title >{{profile}}</v-list-item-title>
                    <!-- <v-list-item-title >12:45</v-list-item-title> -->
                  </v-list-item>
                  <v-divider></v-divider>
                </v-list>

              </v-card>
            </v-flex>

            <!-- 왼쪽 프로필 Box3-------------------------------------------->
            <v-flex> 
              <v-card class="ma-5 text text-center mt-6" shaped elevation="10">
                <v-list-item three-line router to="/SubscribeList">
                  <v-list-item-content>
                    <v-list-item-title class="headline mb-1"> 옆집 놀러가기
                      <!-- <v-icon>구독하기</v-icon>                         -->
                     </v-list-item-title>
                    <!-- <v-list-item-subtitle>2345 4546 7889 5432</v-list-item-subtitle>  -->
                  </v-list-item-content>
                  <v-list-item-avatar size="60" color="orange darken-3">
                    <v-icon color="white">fas fa-suitcase-rolling</v-icon>
                  </v-list-item-avatar>
                </v-list-item>
              </v-card>
            </v-flex>
          </v-container>
        </v-app>
      </v-flex>

  <!-- 오른쪽 화면-------------------------------------------->
  <v-flex md9>
    <v-app :style="{background: $vuetify.theme.themes.dark.background}" class="rounded">
      <v-container>
        <v-flex>
          <v-list class="mt-5">
            <v-list-item>
              <v-list-item-title class="orange--text text--darken-3">Summary</v-list-item-title>
                <v-list-item-action>
                  <!-- SEE-ALL 버튼 숨김 -->
                  <!-- <v-btn class="ma-2" tile outlined="" color="orange darken-3"> -->
                    <!-- <v-icon left>fas fa-eye</v-icon> See ALL -->
                  <!-- </v-btn> -->
                </v-list-item-action>
            </v-list-item>
          </v-list>
        </v-flex>

  
  <v-flex>    
    <v-row no-gutter>   
      <!-- 오른쪽 상단 BOX1 --------------------------------------->   
      <v-col cols="12" md="4">
        <v-row>
          <v-col cols="12" md="2">
            <v-card height="80px" width="10px" color="orange darken-1"></v-card>
          </v-col>
          <v-col cols="12" md="10">            
            <v-list two-line="" subheader="" class="ml-n8" >
              <v-list-item>
                <v-list-item-avatar size="60" >
                    <v-icon color="orange darken-3">fas fa-wallet</v-icon>  
                </v-list-item-avatar>
                <v-list-item-content>                    
                    <v-list-item-subtitle>총 자산</v-list-item-subtitle>
                    <v-list-item-title>2,000,000원</v-list-item-title>                    
                </v-list-item-content>
                
              </v-list-item>
            </v-list>
          </v-col>
        </v-row>
      </v-col>

      <!-- 오른쪽 상단 BOX2 --------------------------------------->
      <v-col cols="12" md="4">
        <v-row>
          <v-col cols="12" md="2">
            <v-card height="80px" width="10px" color="orange darken-1"></v-card>
          </v-col>
          <v-col cols="12" md="10">
            <v-list two-line subheader class="ml-n8">
              <v-list-item>
                <!-- 데이터에 따라 up down if문 작성 -->
                <v-list-item-avatar size="60" >
                    <v-icon color="red accent-4" size="30">fas fa-sort-up</v-icon>  
                    <!-- <v-icon color="blue darken-4" size="30">fas fa-sort-down</v-icon>   -->
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-subtitle>손익</v-list-item-subtitle>
                  <v-list-item-title>1,000,000원</v-list-item-title>
                  <!-- <v-list-item-subtitle>Incurable</v-list-item-subtitle> -->
                </v-list-item-content>
              </v-list-item>
            </v-list>
          </v-col>
        </v-row>
      </v-col>

      <!-- 오른쪽 상단 BOX3 --------------------------------------->
      <v-col cols="12" md="4">
        <v-row>
          <v-col cols="12" md="2">
            <v-card height="80px" width="10px" color="orange darken-1"></v-card>
          </v-col>
          <v-col cols="12" md="10">
            <v-list two-line subheader class="ml-n8">
              <v-list-item>
                <!-- 데이터에 따라 up down if문 작성 -->
                <v-list-item-avatar size="60" >
                    <v-icon color="red accent-4" size="30">fas fa-sort-up</v-icon>  
                    <!-- <v-icon color="blue darken-4" size="30">fas fa-sort-down</v-icon>   -->
                </v-list-item-avatar>
                <v-list-item-content>
                  <v-list-item-subtitle>수익률</v-list-item-subtitle>
                  <v-list-item-title>50%</v-list-item-title>
                  <!-- <v-list-item-subtitle>Examiniations</v-list-item-subtitle> -->
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
      <v-col cols="12" md="4">

        <!-- 상단 제목 + 버튼 -------------------------->
        <v-flex>
          <v-list class="mt-5">
            <v-list-item>
              <v-list-item-title class="orange--text text--darken-3">포트폴리오 비율</v-list-item-title>
              <!-- <v-item-content>
                <v-btn class="mr-1" outlined color="orange darken-3">D</v-btn>
              </v-item-content>
              <v-item-content>
                <v-btn class="mr-1" outlined color="orange darken-3">W</v-btn>
              </v-item-content>
              <v-item-content>
                <v-btn class="mr-1" outlined color="orange darken-3">M</v-btn>
              </v-item-content>
              <v-item-content>
                <v-btn outlined color="orange darken-3">Y</v-btn>
              </v-item-content> -->
            </v-list-item>
          </v-list>
        </v-flex>
        
        <!-- 중간 그래프(기본 양식) -------------------------->
        <!-- <v-flex>
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
        </v-flex> -->

        <!-- 중간 그래프(원형 그래프 추가) -------------------------->
        <v-flex>
          <v-card>
            <!-- <v-card-title primary-title>
              <span class="grey--text">포트폴리오</span>
            </v-card-title> -->
          <v-card-text>
            <v-progress-circular
            :rotate="-90"
            :size="300"
            :width="30"
            :value=90
            color="orange darken-4"
            >           
            </v-progress-circular>
          </v-card-text>
        </v-card>

          <!-- <v-progress-circular 
          :value=50
          color="pink lighton-2"
          size="150"
          width="15" > 50% </v-progress-circular>
          <h1 class="headline pl-5">$11111</h1>
          <h6 class="grey--text pl-5">with 25 days</h6> -->
        </v-flex>

        <!-- 아래 항목명 -------------------------->
        <v-flex class="mt-5">
          <v-list class="ml-5">
            <v-list-item>
              <v-list-item-avatar color="orange darken-4" size="20px"></v-list-item-avatar>
              <v-list-item-title>주식</v-list-item-title>
              <v-list-item-avatar color="grey lighten-1" size="20px"></v-list-item-avatar>
              <v-list-item-title class="ml-5">채권</v-list-item-title>
            </v-list-item>
          </v-list>
        </v-flex>
        </v-col>
        <!-- 오른쪽 -------------------------->
        <v-col cols="12" md="8">
          <v-flex class="ml-10">
            <v-list>
              <v-list-item>
                <v-list-item-title class="orange--text text--darken-3">투자 종목 리스트</v-list-item-title>
              </v-list-item>
            </v-list>
          </v-flex>
          <v-flex class="ml-10">
            <v-row>
              <!-- 테이블 -->
              <!-- <v-data-table
                :headers="headers"
                :items="desserts"
                :items-per-page="5"
                class="elevation-1"
              ></v-data-table> -->
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
              <!-- <v-date-picker
              v-model="date2"
              :event-color="date => date[9] % 2 ? 'red' : 'yellow'"
              :events="functionEvents"
              color="orange darken-3"
              >
              </v-date-picker> -->
            </v-row>
          </v-flex>
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
    },
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
  name = 'app',
  data() {
    return {
      chartData: {
        '2017-05-13' : 2,
        '2017-05-14' : 3,
        '2017-05-15' : 4 
      }
    }
  }
  
}
</script>

<script>
import axios from 'axios'
export default {
  data: () => ({
//테이블
    search: '',
    headers: [
      {
        text: '타입',
        align: 'start',
        sortable: false,
        value: 'type',
      },
      { text: '종목', value: 'stockNm' },
      { text: '평가금액', value: 'valEvalu' },
      { text: '수익률', value: 'earningRate' },
      { text: '손익', value: 'profit' },
      { text: '잔고', value: 'qty' },      
      { text: '매입가', value: 'valTrade' },    
      { text: '현재가', value: 'valstock' },
    ],
    desserts: [
      {
        type: '국내주식',
        stockNm: '삼성전자',
        valEvalu: '880,000원',
        earningRate: '25.71%',
        profit: '180,000원',
        qty: 10,
        valTrade: '70,000원',
        valstock: '88,000원',
      },
      {
        type: '국내주식',
        stockNm: '대한항공',
        valEvalu: '303000원',
        earningRate: '21.20%',
        profit: '53,000원',
        qty: 10,
        valTrade: '25,000원',
        valstock: '30,300원',
      },
      {
        type: '국내주식',
        stockNm: '기아차',
        valEvalu: '892,000원',
        earningRate: '4.94%',
        profit: '42,000원',
        qty: 10,
        valTrade: '85,000원',
        valstock: '89,200원',
      },
      {
        type: '국내주식',
        stockNm: 'LG전자',
        valEvalu: '511,500원',
        earningRate: '3.33%',
        profit: '16,500원',
        qty: 3,
        valTrade: '170,500원',
        valstock: '495,000원',
      },
      {
        type: '국내주식',
        stockNm: '현대차',
        valEvalu: '1,272,500원',
        earningRate: '10.65%',
        profit: '122,500원',
        qty: 5,
        valTrade: '230,000원',
        valstock: '254,500원',
      },
      
    ],
    name: '',
    username: '',
    password: '',
    grade: '',
    age: '',
    job: '',
    investOpt: '',
    salary: '',
    property: '',
    profile: '',
  }),
  created(){
    console.log("hi");
    axios.get('/api/member/search/2')
      .then(res => {
        console.log(res.data);
        this.name = res.data.name,
        this.username = res.data.username,
        this.grade = res.data.grade,
        this.age = res.data.age,
        this.job = res.data.job,
        this.investOpt = res.data.investOpt,
        this.salary = res.data.salary,
        this.property = res.data.property,
        this.profile = res.data.profile
        console.log(this.name);
      })
      .catch(err => {
        console.log('err', err);
      })
  }
}
</script>



<style scoped>
.rounded {
  border-top-left-radius: 50px;
  border-bottom-left-radius: 50px;
}
</style>

