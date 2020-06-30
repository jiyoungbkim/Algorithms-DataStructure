var body = document.body;
var word = document.createElement('div');
word.textContent = '딸기';
document.body.append(word);
var input = document.createElement('input');
document.body.append(input);
var button = document.createElement('button');
button.textContent = '입력!';
document.body.append(button);
var result = document.createElement('div');
document.body.append(result);

/* var word = '딸기'
while(true) {
    var newWord = prompt(word);
    if(word[word.length-1] === newWord[0]) {
        word = newWord;
    } else {
        alert("끝말 잇기!");
    }
} */