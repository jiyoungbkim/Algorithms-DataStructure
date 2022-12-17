function solution(denum1, num1, denum2, num2) {
  let answer = [denum1 * num2 + denum2 * num1, num1 * num2];
  let min = answer[0] > answer[1] ? answer[1] : answer[0];

  let gcd = 1;
  for (let i = 2; i <= min; i++) {
    if (answer[0] % i === 0 && answer[1] % i === 0) gcd = i;
  }

  return [answer[0] / gcd, answer[1] / gcd];
}

console.log(solution(1, 2, 3, 4));
console.log(solution(9, 2, 1, 3));
