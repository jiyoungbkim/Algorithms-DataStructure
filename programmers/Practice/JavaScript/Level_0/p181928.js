// 정수가 담긴 리스트 num_list가 주어집니다.
// num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
function solution(num_list) {
  let odd = "";
  let even = "";
  num_list.map((v) => {
    v % 2 === 0 ? (even += v) : (odd += v);
  });
  return +odd + +even;
}
console.log(solution([3, 4, 5, 2, 1]));

function solution2(num_list) {
  const { odds, evens } = num_list.reduce(
    ({ odds, evens }, num) => {
      // num % 2 === 0 ? evens.push(num) : odds.push(num);
      num % 2 === 0 ? (evens += num) : (odds += num);
      return { odds, evens };
    },
    // {
    //   odds: [],
    //   evens: [],
    // }
    {
      odds: "",
      evens: "",
    }
  );
  // return Number(odds.join("")) + Number(evens.join(""));
  return Number(odds) + Number(evens);
}
console.log(solution2([3, 4, 5, 2, 1]));
