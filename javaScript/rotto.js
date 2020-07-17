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

var result = document.getElementById('result');
//var result = document.getElementsByTagName('div');

/* for(var i = 0; i < winningNum.length; i++) {
    setTimeout(function callback() {
        var ball = document.createElement('div');
        ball.textContent = winningNum[i];
        result.appendChild(ball);
    }, 1000); // 밀리초   
} */

setTimeout(function callback() {
    var ball = document.createElement('div');
    ball.textContent = winningNum[0];
    ball.style.display = 'inline-block';
    ball.style.border = '1px solid black';
    ball.style.borderRadius = '10px'; //css에서는 border-radius인데 자바스크립트에서는 빼기이기 때문에 카멜케이스로 바뀐다
    ball.style.width = '20px';
    ball.style.height = '20px';
    ball.style.textAlign = 'center';
    result.appendChild(ball);
}, 1000);
setTimeout(function callback() {
    var ball = document.createElement('div');
    ball.textContent = winningNum[1];
    ball.style.display = 'inline-block';
    ball.style.border = '1px solid black';
    ball.style.borderRadius = '10px'; //css에서는 border-radius인데 자바스크립트에서는 빼기이기 때문에 카멜케이스로 바뀐다
    ball.style.width = '20px';
    ball.style.height = '20px';
    ball.style.textAlign = 'center';
    result.appendChild(ball);
}, 2000);
setTimeout(function callback() {
    var ball = document.createElement('div');
    ball.textContent = winningNum[2];
    ball.style.display = 'inline-block';
    ball.style.border = '1px solid black';
    ball.style.borderRadius = '10px'; //css에서는 border-radius인데 자바스크립트에서는 빼기이기 때문에 카멜케이스로 바뀐다
    ball.style.width = '20px';
    ball.style.height = '20px';
    ball.style.textAlign = 'center';
    result.appendChild(ball);
}, 3000);
setTimeout(function callback() {
    var ball = document.createElement('div');
    ball.textContent = winningNum[3];
    ball.style.display = 'inline-block';
    ball.style.border = '1px solid black';
    ball.style.borderRadius = '10px'; //css에서는 border-radius인데 자바스크립트에서는 빼기이기 때문에 카멜케이스로 바뀐다
    ball.style.width = '20px';
    ball.style.height = '20px';
    ball.style.textAlign = 'center';
    result.appendChild(ball);
}, 4000);
setTimeout(function callback() {
    var ball = document.createElement('div');
    ball.textContent = winningNum[4];
    ball.style.display = 'inline-block';
    ball.style.border = '1px solid black';
    ball.style.borderRadius = '10px'; //css에서는 border-radius인데 자바스크립트에서는 빼기이기 때문에 카멜케이스로 바뀐다
    ball.style.width = '20px';
    ball.style.height = '20px';
    ball.style.textAlign = 'center';
    result.appendChild(ball);
}, 5000);
setTimeout(function callback() {
    var ball = document.createElement('div');
    ball.textContent = winningNum[5];
    ball.style.display = 'inline-block';
    ball.style.border = '1px solid black';
    ball.style.borderRadius = '10px'; //css에서는 border-radius인데 자바스크립트에서는 빼기이기 때문에 카멜케이스로 바뀐다
    ball.style.width = '20px';
    ball.style.height = '20px';
    ball.style.textAlign = 'center';
    result.appendChild(ball);
}, 6000);

setTimeout(function callback() {
    var bResult = document.getElementsByClassName('bResult')[0];
    var bBall = document.createElement('div');
    bBall.style.display = 'inline-block';
    bBall.style.border = '1px solid black';
    bBall.style.borderRadius = '10px'; //css에서는 border-radius인데 자바스크립트에서는 빼기이기 때문에 카멜케이스로 바뀐다
    bBall.style.width = '20px';
    bBall.style.height = '20px';
    bBall.style.textAlign = 'center';
    bBall.textContent = bonus;
    result.appendChild(bBall);
}, 7000);
