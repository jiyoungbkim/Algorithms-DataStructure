let total = 0;
let count = 0;
const limit = prompt('제한 무게를 입력하세요.');
const n = prompt('인원수를 입력하세요.');

for(let i = 1; i <= n; i++){
    total += parseInt(prompt('몸무게를 입력하세요.'), 10);
    if(total <= limit){
        count = i;
    }
}
console.log(count);