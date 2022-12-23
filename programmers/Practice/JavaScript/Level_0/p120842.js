// 정수 배열 num_list와 정수 n이 매개변수로 주어집니다.
// num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
// num_list: [1, 2, 3, 4, 5, 6, 7, 8] n: 2 -> result: [[1, 2], [3, 4], [5, 6], [7, 8]]
function solution(num_list, n) {
  var answer = [];
  for (let i = 0; i < num_list.length; i += n) {
    answer.push(num_list.slice(i, i + n));
  }
  return answer;
}
console.log(solution([100, 95, 2, 4, 5, 6, 18, 33, 948], 3));
