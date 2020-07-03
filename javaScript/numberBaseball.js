var body = document.body;

var nominee = [1,2,3,4,5,6,7,8,9];
var numberArray = [];

for (var i=0; i < 4; i ++) {
    var select = nominee.splice(Math.floor(Math.random() * (9 - i)), 1)[0];
    numberArray.push(select);
}

console.log(numberArray);

var result = document.createElement('h1');
body.append(result);
var form = document.createElement('form');
body.append(form);
var input = document.createElement('input');
form.append(input);
input.maxLength = 4;
var button = document.createElement('button');
button.textContent = '입력!';
form.append(button);
//var arraytoString = String(numberArray[0]) + String(numberArray[1]) + String(numberArray[2]) + String(numberArray[3]);

form.addEventListener('submit', function callback (event) {
    event.preventDefault();
    var answer = input.value;
    console.log(answer, numberArray, answer === numberArray.join(''));
    if ( answer === numberArray.join('')) {
        result.textContent = 'Home Run';
        input.value = '';
        input.focus();
        var nominee = [1,2,3,4,5,6,7,8,9];
        var numberArray = [];
        for (var i=0; i < 4; i ++) {
            var select = nominee.splice(Math.floor(Math.random() * (9 - i)), 1)[0];
            numberArray.push(select);
        }
    } else {

    }
});