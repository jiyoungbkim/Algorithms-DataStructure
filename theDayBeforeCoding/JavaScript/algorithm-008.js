// 최솟값과 최댓값_reduce
// Math.max와 Math.min은 아주 큰 값을 만나면 에러가 나고 메모리 효율이 나쁘다.
let a = [6, 5, 4, 3, 2];
const reducerOne = (accumulator, currentvalue) => accumulator + currentvalue;
const reducerTwo = (accumulator, currentvalue) => accumulator - currentvalue;
console.log(a.reduce(reducerOne)); // 20 : 6+5+4+3+2
console.log(a.reduce(reducerTwo)); // -8 : 6-(5+4+3+2)

const reducerThree = (accumulator, currentvalue) => 
accumulator > currentvalue ? accumulator : currentvalue;
const reducerFour = (accumulator, currentvalue) => 
accumulator < currentvalue ? accumulator : currentvalue;
console.log(a.reduce(reducerThree)); // 6
console.log(a.reduce(reducerFour)); // 2