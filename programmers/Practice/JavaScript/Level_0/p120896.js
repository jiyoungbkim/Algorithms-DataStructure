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
