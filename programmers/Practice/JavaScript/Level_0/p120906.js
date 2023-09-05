// 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
function solution(n) {
  // var answer = String(n).split("");
  // return answer.reduce((a, b) => +a + +b, 0);
  return n
    .toString()
    .split("")
    .reduce((a, b) => +a + +b, 0);
}
console.log(solution(1234));
console.log(solution(930211));
