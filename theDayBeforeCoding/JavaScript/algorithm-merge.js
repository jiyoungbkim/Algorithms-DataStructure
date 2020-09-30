// 병합정렬(O(nlogn))
let a = [5, 10, 66, 77, 54, 32, 11, 15];

// // 분할
// [5, 10, 66, 77], [54, 32, 11, 15]
// [5, 10], [66, 77], [54, 32], [11, 15]
// [5], [10], [66], [77], [54], [32], [11], [15]
// // 정복
// [5, 10],[66,77],[32, 54],[11,15]
// [5, 10, 66, 77],[11, 15, 32, 54] 
// [5, 10, 11, 15, 32, 54, 66, 77]

// function mergeSort(inputArray){
//     let len = inputArray.length;
//     if(len <= 1) {
//         return inputArray;
//     }
//     let middleValue = parseInt(len/2);
//     let groupOne = mergeSort(inputArray.slice(0, middleValue));
//     let groupTwo = mergeSort(inputArray.slice(middleValue, ));
//     return `groupOne : ${groupOne}, groupTwo : ${groupTwo}\n`
// }
// console.log(mergeSort(a));

function mergeSort(inputArray){
    let len = inputArray.length;
    let result = [];
    if(len <= 1) {
        return inputArray;
    }
    let middleValue = parseInt(len/2);
    let groupOne = mergeSort(inputArray.slice(0, middleValue));
    let groupTwo = mergeSort(inputArray.slice(middleValue, ));

    while(groupOne.length != 0 && groupTwo.length != 0){
        if(groupOne[0] < groupTwo[0]){
            result.push(groupOne.shift())
        } else {
            result.push(groupTwo.shift());
        }
    }
    while(groupOne.length != 0){
        result.push(groupOne.shift());
    }
    while(groupTwo.length != 0){
        result.push(groupTwo.shift());
    }
    return result;
}
console.log(mergeSort(a));