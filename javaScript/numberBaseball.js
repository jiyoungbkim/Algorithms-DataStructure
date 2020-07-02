var body = document.body;

var nominee = [1,2,3,4,5,6,7,8,9];
var numberArray = [];

for (var i=0; i < 4; i ++) {
    var select = nominee.shift();
    numberArray.unshift(select);
}

console.log(numberArray);

var result = document.createElement('h1');
body.append(result);
var form = document.createElement('form');
body.append(form);
var input = document.createElement('input');
form.append(input);
var button = document.createElement('button');
button.textContent = '입력!';
form.append(button);

form.addEventListener('submit', function callback () {

});