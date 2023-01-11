// 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을
// return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
function solution(s) {
  let answer = [];
  let sObj = {};
  for (let val of s) {
    sObj[val] = sObj[val] ? ++sObj[val] : 1;
  }
  for (let key in sObj) {
    if (sObj[key] === 1) answer.push(key);
  }
  return answer.sort().join("");
}
console.log(solution("abcabcadc"));
