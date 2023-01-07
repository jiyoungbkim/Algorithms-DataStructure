// 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를
// return 하도록 solution 함수를 완성해주세요.
function solution(array, n) {
  array.sort((a, b) => b - a);
  let answer = array[0];
  for (let value of array) {
    if (Math.abs(n - answer) >= Math.abs(n - value)) answer = value;
  }
}
console.log(solution([3, 10, 28], 20));
// console.log(solution([10, 11, 12], 13));
