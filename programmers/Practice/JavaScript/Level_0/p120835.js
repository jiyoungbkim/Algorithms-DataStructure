// 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
// 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을
// return하도록 solution 함수를 완성해주세요.
function solution(emergency) {
  var priority = [...emergency].sort((a, b) => b - a);
  let map = new Map();
  priority.forEach((v, i) => map.set(v, i + 1));
  // Map { 24 => 2, 3 => 3, 76 => 1 }

  return emergency.map((v) => map.get(v));
}

console.log(solution([3, 76, 24]));
// console.log(solution([1, 2, 3, 4, 5, 6, 7]));
// console.log(solution([30, 10, 23, 6, 100]));
