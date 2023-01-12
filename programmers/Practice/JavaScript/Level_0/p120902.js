// my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때,
// 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
function solution(my_string) {
  let arr = my_string.split(" ");
  let answer = parseInt(arr[0]);
  for (let i = 1; i < arr.length; i += 2) {
    if (arr[i] === "+") answer += +arr[i + 1];
    else answer -= +arr[i + 1];
  }
  return answer;
}
console.log(solution("3 + 4 - 2 + 5"));
