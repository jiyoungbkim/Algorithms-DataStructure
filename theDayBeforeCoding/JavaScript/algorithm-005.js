// 재귀함수 사례 - 각 자릿수의 합
// 반복문
let result = 0;
let x = '123123';
while (true) {
    if(x.length == 1){
        result += parseInt(x, 10);
        break;
    }
    let y = x.split('');
    result += parseInt(y.pop(), 10);
    x = y.join('');
}
console.log(result);

// 재귀함수
function 문자열합(문자){
    if(문자.length == 1){
        return parseInt(문자);
    } else {
        return parseInt(문자[문자.length-1]) + 문자열합(문자.slice(0, 문자.length-1));
    }
}
console.log(문자열합('123123'));