// 최솟값과 최댓값
let a = [10, 20, 30, 1, 2, 3, 5, 9, 11];
a.sort(); // 사전식 정렬 [1, 10, 11, 2, 20, 3, 30, 5, 9]
console.log(a[0]); // 1
console.log(a[a.length-1]); // 9


Math.max(10, 20); 
Math.min(10, 20);
// 배열을 넣지 못하기 때문에 다음과 같이 쓴다. 
console.log(Math.max.apply(null, a));
console.log(Math.min.apply(null, a));

let max = a[0];
for (var variable of a){
    if(variable > max) {
        max = variable;
    }
}
console.log(max);

let min = a[0];
for (var variable of a){
    if(variable < min) {
        min = variable;
    }
}
console.log(min);