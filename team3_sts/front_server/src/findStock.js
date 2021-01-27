import axios from 'axios'

var stockLists = {};

axios.get('https://sandbox-apigw.koscom.co.kr/v2/market/stocks'
+ '/kospi/lists'
+ '?apikey=l7xxc460c2c4fca442ebaef0e2d8977dc043')
  .then(res => {
    stockLists = res.data;
    console.log(res.data);
  })
  .catch(err => {
    console.log('err', err);
  })

const findStock = (x)=>{
    console.log(stockLists);
    return x;
  }
  export default findStock;