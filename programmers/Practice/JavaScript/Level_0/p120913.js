// 문자열 my_str과 n이 매개변수로 주어질 때,
// my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
function solution(my_str, n) {
  var answer = [];
  for (let i = 0; i < my_str.length; i += n) {
    answer.push(my_str.substring(i, i + n));
  }
  return answer;
}
console.log(solution("abc1Addfggg4556b", 6));
console.log(solution("abcdef123", 3));