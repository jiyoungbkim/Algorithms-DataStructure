// 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
// 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한 값이 total이 될 때,
// 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
function solution(num, total) {
  var answer = [];
  let center = 0;
  let range = (num - 1) / 2;
  let start = 0;

  center = total / num;
  start = center - range;

  for (let i = 0; i < num; i++) {
    answer.push(i + start);
  }
  return answer;
}
console.log(solution(3, 12));
console.log(solution(5, 15));
console.log(solution(4, 14));
console.log(solution(5, 5));
