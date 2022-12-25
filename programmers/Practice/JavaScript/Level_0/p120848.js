// i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
// 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
// 정수 n이 주어질 때 조건 i! <= n을 만족하는
// 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
function solution(n) {
  // let factorial = [];
  // let acc = 1;
  // for (let i = 1; i < 10; i++) {
  //   acc *= i;
  //   factorial.push(acc);
  // }
  // factorial;
  // return factorial.filter((v) => v < n).length;
  let answer = 0;
  let acc = 1;
  while (acc <= n) {
    answer++;
    acc *= answer;
  }
  return answer - 1;
}
console.log(solution(3628800));
