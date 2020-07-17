var nominee = Array(45).fill().map(function(element, index) {
    return index + 1;
})
console.log(nominee);

var shuffle = [];
while(nominee.length > 0) {
    var shiftValue = nominee.splice(Math.floor(Math.random() * nominee.length),1)[0];
    shuffle.push(shiftValue);
}
console.log(shuffle);
var bonus = shuffle[shuffle.length - 1];
var winningNum = shuffle.slice(0, 6); // 0~5
console.log('당첨숫자들', winningNum.sort(function(p, c){ return p - c; }), '보너스', bonus);

//var result = document.getElementById('result');
var result = document.querySelector('#result');
//var result = document.getElementsByTagName('div');

/* for(var i = 0; i < winningNum.length; i++) {
    setTimeout(function callback() {
        var ball = document.createElement('div');
        ball.textContent = winningNum[i];
        result.appendChild(ball);
    }, 1000); // 밀리초   
} */
function ballStyle(Num, result){
    var ball = document.createElement('div');
    ball.textContent = Num;
    ball.style.display = 'inline-block';
    ball.style.border = '1px solid black';
    ball.style.borderRadius = '10px'; //css에서는 border-radius인데 자바스크립트에서는 빼기이기 때문에 카멜케이스로 바뀐다
    ball.style.width = '20px';
    ball.style.height = '20px';
    ball.style.textAlign = 'center';
    ball.style.marginRight = '10px';
    ball.style.fontSize = '12px';
    ball.className = 'ballId' + Num;
    var backgroundColor;
    if (Num <= 10) {
        backgroundColor = 'red';
    } else if (Num <= 20) {
        backgroundColor = 'orange';
    } else if (Num <= 30) {
        backgroundColor = 'yellow';
    } else if (Num <= 40) {
        backgroundColor = 'blue';
    } else {
        backgroundColor = 'green';
    }
    ball.style.backgroundColor = backgroundColor;
    result.appendChild(ball);
}
setTimeout(function callback() {
    ballStyle(winningNum[0], result);
}, 1000);
setTimeout(function callback() {
    ballStyle(winningNum[1], result);
}, 2000);
setTimeout(function callback() {
    ballStyle(winningNum[2], result);
}, 3000);
setTimeout(function callback() {
    ballStyle(winningNum[3], result);
}, 4000);
setTimeout(function callback() {
    ballStyle(winningNum[4], result);
}, 5000);
setTimeout(function callback() {
    ballStyle(winningNum[5], result);
}, 6000);

setTimeout(function callback() {
    //var bResult = document.getElementsByClassName('bResult')[0];
    var bResult = document.querySelector('.bResult');
    ballStyle(bonus, bResult);
}, 7000);
