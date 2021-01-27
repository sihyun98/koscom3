// 가격 콤마찍는 함수

const priceComma = (x)=>{
    return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
  }
  export default priceComma;