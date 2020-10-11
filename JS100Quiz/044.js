let num = prompt('숫자를 입력');
let result = 0;
while(num !== 0) {
    result += num % 10;
    num = Math.floor(num/10);
}
console.log(result);