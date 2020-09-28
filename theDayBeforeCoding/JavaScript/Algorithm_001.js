// 재귀함수
// 내가 나를 호출하는 함수
// 반복문 <-> 재귀함수

//O(n) : 더하기 반복문
let s = 0;
for(var i = 1; i < 101; i++) {
    s += i;
}
console.log(s);

//O(1)
let n = 100;
console.log(n*(n+1)/2);

// 더하기 재귀함수
function f(n){
    if (n <= 1) {
        return 1
    }
    return n + f(n-1);
}
console.log(`재귀함수 : ${f(100)}`)

// 곱하기 반복문
let m = 1;
for(var i = 1; i < 6; i++) {
    m *= i;
}
console.log(m);

// 곱하기 재귀함수
function f2(m){
    if (m <= 1) {
        return 1
    }
    return m * f2(m-1);
}
console.log(`재귀함수 : ${f2(5)}`)