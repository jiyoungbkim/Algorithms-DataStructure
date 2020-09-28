const score = prompt('국어? 수학? 영어? ').split(' ');
let sum = 0;
for(var i = 0; i < score.length; i++){
    sum += parseInt(score[i], 10);
}
console.log(Math.floor(sum / score.length));