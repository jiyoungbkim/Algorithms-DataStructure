// 퀵정렬(worst - O(nlog2n), best - O(n**2))
// pivot : 66
// [77, 54, 32, 10, 5, 11, 15] + [66] + [77]
// pivot : 54
// [32, 10, 5, 11, 15] + [54] + [66] + [77]
// pivot : 32
// [10, 5, 11, 15] +[32] + [54] + [66] + [77]
// pivot : 10
// [5] + [10] + [11, 15] +[32] + [54] + [66] + [77]
// pivot : 11
// [5] + [10] + [11] + [15] +[32] + [54] + [66] + [77]

let input = [66, 77, 54, 32, 10, 5, 11, 15];
function quickSort(inputArray) {
    let len = inputArray.length;

    if(len <= 1) {
        return inputArray;
    }
    let pivot = [inputArray.shift()]
    let groupOne = [];
    let groupTwo = [];

    for(let i in inputArray) {
        if(inputArray[i] < pivot) {
            groupOne.push(inputArray[i]);
        } else {
            groupTwo.push(inputArray[i]);
        }
    }
    console.log(`groupOne : ${groupOne}\n groupTwo : ${groupTwo}\n pivot : ${pivot}`);
    return quickSort(groupOne).concat(pivot, quickSort(groupTwo));
}
console.log(quickSort(input));