// 피보나치 수열
// 1   1   2   3   5   8   13 ...

// 반복문
let a = 1;
let b = 1;
for(var i = 0; i < 5; i++){
    let c = a + b;
    a = b;
    b = c;
}
console.log(b);
// 재귀함수
function 피보나치(숫자){
    if(숫자 == 1 || 숫자 == 2) {
        return 1;
    } else {
        return 피보나치(숫자-1) + 피보나치(숫자-2);
    }
}
console.log(피보나치(7));
// f(f(f(f(2) + f(1)) + f(2)) + f(f(2) + f(1)))
// 메모리 효율성 측면에서 재귀함수가 부적절할 수 있다