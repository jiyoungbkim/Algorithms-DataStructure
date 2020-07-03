var body = document.body;

var nominee;
var numberArray;

function numberPick() {
    nominee = [1,2,3,4,5,6,7,8,9];
    numberArray = [];
    for (var i=0; i < 4; i ++) {
        var select = nominee.splice(Math.floor(Math.random() * (9 - i)), 1)[0];
        numberArray.push(select);
    }
}
numberPick();
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
var wrongCount = 0;

form.addEventListener('submit', function callback (event) {
    event.preventDefault();
    var answer = input.value;
    console.log(answer, numberArray, answer === numberArray.join(''));
    if ( answer === numberArray.join('')) { //답이 맞으면
        result.textContent = 'Home Run';
        input.value = '';
        input.focus();
        numberPick();
        wrongCount = 0;
    } else { //답이 틀리면
        var answerArray = answer.split('');
        var strike = 0;
        var ball = 0;
        wrongCount++;
        if(wrongCount > 9) { //10번 넘게 틀린 경우
            result.textContent = '10번 넘어서 실패! 답은' + numberArray.join(',') + '였습니다.'
            input.value = '';
            input.focus();
            numberPick();
            wrongCount = 0;
        } else {  //10번 미만으로 틀린경우
            console.log('wrong answer',answerArray);
            for(var i = 0; i < 3; i ++) {
                if(Number(answerArray[i]) === numberArray[i]) {
                    strike++;
                } else if (numberArray.indexOf(Number(answerArray[i])) > -1) {
                    ball++;
                }
            }
            result.textContent = strike + ' strike ' + ball + ' ball입니다.';
            console.log(wrongCount);
            input.value = '';
            input.focus();
        }        
    }
});