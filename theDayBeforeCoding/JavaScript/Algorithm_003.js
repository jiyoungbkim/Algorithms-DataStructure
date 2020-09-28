// 재귀함수 사례 - 2진수 변환
// 2  | 11 ... 1
// 2  | 5  ... 1
// 2  | 2  ... 0
//     ----
//     1   ----^

// 반복문
let result = '';
let x = 11;
while(true){
    if(x%2 == 0){
        result += '0'; //result = '0' + result;
    } else {
        result += '1'; //result = '1' + result;
    }
    // Math.ceil() : 소수점 올림
    // Math.floor() : 소수점 버림
    // Math.round() : 소수점 반올림
    x = Math.floor(x / 2);
    if(x == 1 || x == 0){
        result += String(x);//result = String(x) + result;
        break;
    }
}
console.log(result.split('').reverse().join('')); // console.log(result);

//재귀함수
function 이진법(숫자) {
    if(숫자 == 1 || 숫자 == 0){
        return String(숫자);
    }
    return  이진법(Math.floor(숫자 / 2)) + String(숫자 % 2);
}
console.log(이진법(11));

// 이진법(11)  이진법(5) + String(1) -- 101 + String(1)
// 이진법(5)   이진법(2) + String(1) -- 10 + String(1)
// 이진법(2)   이진법(1) + String(0) -- 1 + String(0)
// 이진법(1)   1