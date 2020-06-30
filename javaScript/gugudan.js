var num1 = Math.ceil(Math.random() * 9);
var num2 = Math.ceil(Math.random() * 9);
var sum = num1 * num2;
var body = document.body;
var word = document.createElement('div');
word.textContent = String(num1) + '곱하기' + String(num2) + '는?';
document.body.append(word);
var form = document.createElement('form');
document.body.append(form);
var input = document.createElement('input');
input.type = 'number'; //소용없음
form.append(input);
var button = document.createElement('button');
button.textContent = '입력!';
form.append(button);
var result = document.createElement('div');
document.body.append(result);

form.addEventListener('submit', function callback (event) {
    event.preventDefault();
    console.log(sum, input.value);
    if(sum === Number(input.value)) {
        result.textContent = '딩동댕';
        num1 = Math.ceil(Math.random() * 9); //맞으면 새로운 문제 생성
        num2 = Math.ceil(Math.random() * 9);
        sum = num1 * num2;
        word.textContent = String(num1) + '곱하기' + String(num2) + '는?';
        input.value = '';
        input.focus();
    } else {
        result.textContent = '땡';
        input.value = '';
        input.focus();
    }
});