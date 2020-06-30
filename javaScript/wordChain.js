var body = document.body;
var word = document.createElement('div');
word.textContent = '딸기';
document.body.append(word);
var form = document.createElement('form');
document.body.append(form);
var input = document.createElement('input');
form.append(input);
var button = document.createElement('button');
button.textContent = '입력!';
form.append(button);
var result = document.createElement('div');
document.body.append(result);

form.addEventListener('submit', function callback (event) {
    event.preventDefault();
    if(word.textContent[word.textContent.length-1] === input.value[0]) {
        result.textContent = '딩동댕';
        word.textContent = input.value;
        input.value = '';
        input.focus();
    } else {
        result.textContent = '땡';
        input.value = '';
        input.focus();
    }
});
/* var word = '딸기'
while(true) {
    var newWord = prompt(word);
    if(word[word.length-1] === newWord[0]) {
        word = newWord;
    } else {
        alert("끝말 잇기!");
    }
} */