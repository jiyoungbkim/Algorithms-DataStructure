// 문자열 str1, str2가 매개변수로 주어집니다.
// str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
function solution(str1, str2) {
  // var answer = 2;
  // for (let i = 0; i < str1.length; i++) {
  //   let temp = str1.substring(i, i + str2.length);
  //   if (temp.length === str2.length && temp === str2) answer = 1;
  // }
  // return answer;
  return str1.includes(str2) ? 1 : 2;
}
console.log(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
console.log(solution("ppprrrogrammers", "pppp"));
