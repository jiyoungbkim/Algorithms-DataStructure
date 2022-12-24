// 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
// 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
function solution(n) {
  let arr = Array.from({ length: n + 1 }, (_, i) => i);
  let set = new Set(arr);
  for (let i = 2; i * i <= n; i++) {
    for (let j = i * i; j <= n; j += i) {
      set.delete(arr[j]);
    }
  }
  return arr.filter((v) => !set.has(v)).length;
  // return Array.from({ length: n }, (_, i) => i + 1).filter((v) => !isPrime(v)).length;
}
console.log(solution(10));

function isPrime(num) {
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i === 0) return false;
  }
  return true;
}
