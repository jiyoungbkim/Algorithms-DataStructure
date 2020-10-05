// 로컬일 경우 다 에러가 남
// 1. MDN https://developer.mozilla.org/ko/docs/Learn/JavaScript/Objects/JSON
// var requestURL = 'dogs.json';
// var request = new XMLHttpRequest();
// request.open('GET', requestURL);
// request.responseType = 'json';
// request.send();
// request.onload = function() {
//     var 독 = request.response;
// }
// 2. import https://qastack.kr/programming/34944099/how-to-import-a-json-file-in-ecmascript-6
// import * as data from './dogs.json';
// console.log(data);
// 3. fetch
// fetch('./dogs.json')
//   .then(response => response.json())
//   .then(obj => console.log(obj))

const 돌의내구도 = [5, 3, 4, 1, 3, 8, 3];
const 독 = [{
    "이름" : "루비독",
    "나이" : "95년생",
    "점프력" : "3",
    "몸무게" : "4",
    },{
    "이름" : "피치독",
    "나이" : "95년생",
    "점프력" : "3",
    "몸무게" : "3",
    },{
    "이름" : "씨-독",
    "나이" : "72년생",
    "점프력" : "2",
    "몸무게" : "1",
    },{
    "이름" : "코볼독",
    "나이" : "59년생",
    "점프력" : "1",
    "몸무게" : "1",
    },
];
let jump = 0;
let arrival = [];
for (const dog of 독) {
    jump = dog.점프력-1; //1
    while(jump < 돌의내구도.length){
        돌의내구도[jump] = 돌의내구도[jump]-dog.몸무게;
        if(돌의내구도[jump] >= 0){ 
            jump += dog.점프력; //3
        } else {
            break;
        }        
    }
    if(jump > 돌의내구도.length) {
        arrival.push(dog.이름);
    }    
}
console.log(arrival);

// function crosstheSteppingstone(돌의내구도, 독){
//     let answer = [];
//     for (const 개별독 of 독) {
//         let position = 0;
//         let fail = false;
//         while(position < 돌의내구도.length){
//             position += parseInt(개별독['점프력'], 10);
//             돌의내구도[position-1] -= parseInt(개별독['몸무게'], 10);
//             if(돌의내구도[position-1] < 0) {
//                 fail = true;
//                 break;
//             }
//         }
//         if(!fail){
//             answer.push(개별독['이름']);
//         }       
//     }
//     return answer
// }
// console.log(crosstheSteppingstone(돌의내구도, 독));