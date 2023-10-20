// 3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다.
// 정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.
function solution(n) {
  var answer = 0;
  for (let i = 1; i <= n; i++) {
    answer++;
    while (answer % 3 === 0 || String(answer).includes("3")) {
      answer++;
    }
  }
  return answer;
}
console.log(solution(15));
console.log(solution(40));
