var body = document.body;
var table = document.createElement('table');
for(var i = 0; i < 3; i++) {
    var tr = document.createElement('tr');
    for(var j = 0; j < 3; j++) {
        var td = document.createElement('td');
        tr.appendChild(td);
    }
    table.appendChild(tr)
}
body.appendChild(table);