var body = document.body;
var table = document.createElement('table');
var trArray = [];
var tdArray = []; //빈배열
var callback = function(event) {
    console.log(event.target);
};
for(var i = 0; i < 3; i++) {
    var tr = document.createElement('tr');
    trArray.push(tr);
    tdArray.push([]); //배열안에 빈배열이 생긴다
    for(var j = 0; j < 3; j++) {
        var td = document.createElement('td');
        td.addEventListener('click', callback);
        tdArray[i].push('td'); //칸이 들어간 배열
        tr.appendChild(td);
    }
    table.appendChild(tr)
}
body.appendChild(table);
console.log(trArray, tdArray);