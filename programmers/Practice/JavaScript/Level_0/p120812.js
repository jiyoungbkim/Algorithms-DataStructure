function solution(array) {
  if (array.length === 1) return array[0];

  let countArr = {};
  for (let val of array) {
    countArr[val] = (countArr[val] || 0) + 1;
  }
  // countArr { 1: 1, 2: 1, 3: 3, 4: 1 }

  let result = [];
  for (let val in countArr) {
    result.push([+val, countArr[val]]);
  }

  result.sort((a, b) => b[1] - a[1]);
  // result [ [ 3, 3 ], [ 1, 1 ], [ 2, 1 ], [ 4, 1 ] ]

  return result.length === 1 || result[0][1] > result[1][1] ? result[0][0] : -1;
}
console.log(solution([1, 2, 3, 3, 3, 4]));
console.log(solution([1, 1]));

function solution2(array) {
  if (array.length === 1) return array[0];

  let result = new Map();

  array.forEach((v) => result.set(v, (result.get(v) || 0) + 1));

  result = [...result].sort((a, b) => b[1] - a[1]);

  return result.length === 1 || result[0][1] > result[1][1] ? result[0][0] : -1;
}
console.log(solution2([1, 2, 3, 3, 3, 4]));
console.log(solution2([1, 1]));
