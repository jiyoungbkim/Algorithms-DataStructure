var body = document.body;
var table = document.createElement('table');
var trArray = [];
var tdArray = []; //빈배열
var turn = 'X';
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
    } else {
        console.log('Empty');
        tdArray[trNum][tdNum].textContent = turn;
        if(turn === 'X') {
            turn = 'O';
        } else {
            turn = 'X';
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
console.log('줄들', trArray, '칸들', tdArray);