function solution(n) {
  const piece = 6;
  const gcdFn = (a, b) => {
    return b === 0 ? a : gcdFn(b, a % b);
  };
  const gcd = gcdFn(n, piece);

  return (n * piece) / gcd / piece;
}

console.log(solution(10));
