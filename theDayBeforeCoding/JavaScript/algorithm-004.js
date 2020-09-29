// 재귀함수 사례 - 문자열 뒤집기
// 반복문
let result = '';
let x = 'leehojun';
while(true){
    if(x.length == 1){
        result += x;
        break;
    }
    let y = x.split('');
    console.log(y);
    result += String(y.pop());
    x = y.join('');
    console.log(x);
}
//console.log(result.split('').reverse().join(''));
console.log(result);

// 재귀함수
function 문자열역순(문자) {
    if(문자.length == 1){
        return 문자;
    }
    return 문자[문자.length-1] + 문자열역순(문자.slice(0, 문자.length-1));
}
console.log(문자열역순('leehojun'));