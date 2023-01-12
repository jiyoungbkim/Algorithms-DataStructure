function binarySearch(arr, value) {
  // add whatever parameters you deem necessary - good luck!
  let left = 0;
  let right = arr.length - 1;
  while (left <= right) {
    let pointer = Math.round((right + left) / 2);
    if (arr[pointer] === value) return pointer;
    if (arr[pointer] > value) right = pointer - 1;
    if (arr[pointer] < value) left = pointer + 1;
  }
  return -1;
}
console.log(
  binarySearch(
    [
      5, 6, 10, 13, 14, 18, 30, 34, 35, 37, 40, 44, 64, 79, 84, 86, 95, 96, 98,
      99,
    ],
    10
  )
);
// 솔루션 코드
function binarySearch2(arr, value) {
  // add whatever parameters you deem necessary - good luck!
  let start = 0;
  let end = arr.length - 1;
  let middle = Math.floor((start + end) / 2);
  while (arr[middle] !== value && start <= end) {
    if (arr[middle] > value) end = middle - 1;
    else start = middle + 1;
    middle = Math.floor((start + end) / 2);
  }
  return arr[middle] === value ? middle : -1;
}
