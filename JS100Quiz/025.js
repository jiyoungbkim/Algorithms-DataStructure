function circle(n){
    const result = n * n * 3.14;
    return result;
}
const r = prompt('반지름의 길이는?');
console.log(circle(r));