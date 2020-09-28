const n = prompt('2개의 숫자를 입력하세요').split(' ');
// let a = parseInt(n[0], 10);
// let b = parseInt(n[1], 10);
// console.log(`${Math.floor(a/b)} ${a%b}`);
const result = Math.floor(parseInt(n[0], 10) / parseInt(n[1], 10));
const left = parseInt(n[0], 10) % parseInt(n[1], 10);
console.log(result, left);