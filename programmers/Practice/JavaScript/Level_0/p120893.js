// 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을
// return하도록 solution 함수를 완성해주세요.
function solution(my_string) {
  const lower = /^[a-z]+$/;
  const upper = /^[A-Z]+$/;

  return [...my_string]
    .map((v) => (lower.test(v) ? v.toUpperCase() : v.toLowerCase()))
    .join("");
}
console.log(solution("abCdEfghIJ"));
