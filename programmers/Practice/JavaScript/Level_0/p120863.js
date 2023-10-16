// 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
// 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
// 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
// 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
// 같은 식이라면 가장 짧은 수식을 return 합니다.
function solution(polynomial) {
  let arr = polynomial.split(" + ");
  let xCount = 0;
  let xNum = 0;
  let num = 0;
  arr.map((item) => {
    item.includes("x")
      ? isNaN(item.slice(0, 1))
        ? xCount++
        : (xNum += +item.slice(0, item.indexOf("x")))
      : (num += +item);
  });
  let answer = "";
  if (xCount + xNum) answer += xCount + xNum === 1 ? "x" : `${xCount + xNum}x`;
  if (num) answer += answer ? ` + ${num}` : `${num}`;
  return answer;
  // return `${
  //   num > 0
  //     ? xCount + xNum > 1
  //       ? xCount + xNum + "x + " + num
  //       : xCount === 0
  //       ? num
  //       : "x + " + num
  //     : xCount + xNum > 1
  //     ? xCount + xNum + "x"
  //     : "x"
  // }`;
}
console.log(solution("3x + 7 + x"));
console.log(solution("x + x + x"));
console.log(solution("7x + 4 + 9 + 5x"));
console.log(solution("x + 1"));
console.log(solution("0x + 0"));

console.log(solution("20x + 1"));
console.log(solution("20 + 1"));
