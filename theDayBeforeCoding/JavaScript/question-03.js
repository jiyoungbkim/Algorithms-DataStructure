let standby = 14000605; // 대기인원
// 9:00     25     25
// 9:10     15     40
// 9:20     15     55
// 9:30     15     70
// 9:40     15     85
// 9:50     15     100

// 100명씩 12시간 : 1200명

console.log(`걸린일수 : ${standby/1200}`); // 걸린일수
let yearDays = 0; // 일년일수
for(var i = 1; i < 11; i++) {
    yearDays += 2**i;
}
console.log(`걸린연도 : ${(standby/1200)/yearDays}`); // 걸린연도

let month = 0;
let leftDays = (standby/1200)%yearDays; // 나머지일수
console.log(`걸린연도를 뺀 나머지일수(계산 전) : ${leftDays}`); // 걸린연도를 뺀 나머지 일수
for (let i = 10; i > 0; i--) {
    month++;
    if(leftDays < 2**i) {
        break;
    }
    leftDays -= 2**i; 
}

console.log(`걸린연도, 걸린월수를 뺀 나머지일수(계산 후) : ${leftDays}`); // 걸린연도를 뺀 나머지 일수
console.log(`걸린월수 : ${month-1}`); // 걸린월수 해당 월에 속한 것이기 때문에 -1

console.log(`시간 : ${standby%1200}`); // 연월일뺸 시간

console.log(`시간 : ${(standby%1200)/100 + 9}`); // 출발 시간
let startmin = [25, 40, 55, 70, 85, 100]; // 출발분
let finalmin = 0; // 최종계산된 분

for (const key in startmin) {
    if (startmin[key] > (standby%1200)%100) {
        finalmin = key*10;
        break;        
    }
}
console.log(`최종계산된 분 : ${finalmin}`);
let date = new Date();
console.log(date);

if(finalmin + date.getMinutes() > 60) {
    finalmin += date.getMinutes() - 60
    // 시간에도 +1 해야합니다.
}
console.log(`최종계산된 분 : ${finalmin+date.getMinutes()}`);

function 배를건너는시간(standby){
    let year = 0, month = 0, day = 0, hour = 0, min = 0;

    let takeDays = standby/1200;
    let yearDays = 0; // 일년일수
    for(var i = 1; i < 11; i++) {
        yearDays += 2**i;
    }
    year = parseInt((standby/1200)/yearDays, 10);

    let leftDays = (standby/1200)%yearDays; // 나머지일수
    let takeMonth = 0;
    for (let i = 10; i > 0; i--) {
        takeMonth++;
        if(leftDays < 2**i) {
            break;
        }
        leftDays -= 2**i; 
    }
    day = parseInt(leftDays, 10);
    month = parseInt(takeMonth, 10);

    hour = parseInt((standby%1200)/100 + 9, 10); // 출발 시간
    
    let startmin = [25, 40, 55, 70, 85, 100]; // 출발분
    let finalmin = 0; // 최종계산된 분

    for (const key in startmin) {
        if (startmin[key] > (standby%1200)%100) {
            finalmin = key*10;
            break;        
        }
    }
    
    let date = new Date();
    finalmin = finalmin+date.getMinutes();

    if(finalmin > 60) {
        finalmin += - 60
        hour += 1;
    }
    min = finalmin;

    return `
    ${year+20}년 
    ${month+1}월 
    ${day+1}일 
    ${hour}시 
    ${min}분
    `
}
console.log(배를건너는시간(standby));