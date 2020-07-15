var body = document.body;
var table = document.createElement('table');
var trArray = [];
var tdArray = []; //빈배열
var turn = 'X';
var result = document.createElement('div');
var callback = function(event) {
    console.log(event.target); // 칸
    console.log(event.target.parentNode); // 줄
    console.log(event.target.parentNode.parentNode); // 테이블

    var trNum = trArray.indexOf(event.target.parentNode);
    console.log('몇줄', trNum);
    var tdNum = tdArray[trNum].indexOf(event.target);
    console.log('몇칸', tdNum);

    if(tdArray[trNum][tdNum].textContent !== '' ) { //칸이 이미 채워져 있는가? 
        console.log('Not Empty');            
    } else { // 빈칸이면
        console.log('Empty');
        tdArray[trNum][tdNum].textContent = turn;
        // 세칸이 다 채워졌나?
        var full = false;
        // 가로줄 검사
        if(tdArray[trNum][0].textContent === turn && 
            tdArray[trNum][1].textContent === turn && 
            tdArray[trNum][2].textContent === turn){
            full = true;
        }
        // 세로줄 검사
        if(tdArray[0][tdNum].textContent === turn && 
            tdArray[1][tdNum].textContent === turn && 
            tdArray[2][tdNum].textContent === turn){
            full = true;
        }
        // 대각선 검사
        if(trNum - tdNum === 0) { // 대각선 검사 필요한 경우
            if(tdArray[0][0].textContent === turn &&
                tdArray[1][1].textContent === turn &&
                tdArray[2][2].textContent === turn ){
                full = true;    
            }
        }
        if(Math.abs(trNum - tdNum) === 2) {
            if(tdArray[0][2].textContent === turn &&
                tdArray[1][1].textContent === turn &&
                tdArray[2][0].textContent === turn ){
                full = true;
            }
        }
        // 다 찼으면 
        if(full){ // 조건문에 ===true는 생략 가능
           // console.log(turn + '님이 승리!');
           result.textContent = turn + '님이 승리!';
            // 초기화
            turn = 'X';
            tdArray.forEach(function(tr){
                tr.forEach(function (td){
                    td.textContent = '';
                })
            })
        } else { // 다 안찼으면
            if(turn === 'X') {
                turn = 'O';
            } else {
                turn = 'X';
            } 
        }      
    }   
};
for(var i = 0; i < 3; i++) {
    var tr = document.createElement('tr');
    trArray.push(tr);
    tdArray.push([]); //배열안에 빈배열이 생긴다
    for(var j = 0; j < 3; j++) {
        var td = document.createElement('td');
        td.addEventListener('click', callback);
        tdArray[i].push(td); //칸이 들어간 배열
        tr.appendChild(td);
    }
    table.appendChild(tr)
}
body.appendChild(table);
body.appendChild(result);
console.log('줄들', trArray, '칸들', tdArray);