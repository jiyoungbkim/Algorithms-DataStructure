var comsChoice = 0;
var dictionary = { // 딕셔너리 자료구조
    rock : '0',
    paper : '-380px',
    scissors : '-770px'
};
setInterval(function () {
    if (comsChoice === dictionary.rock) {
        comsChoice = dictionary.paper;
    } else if (comsChoice === dictionary.paper) {
        comsChoice = dictionary.scissors;
    } else {
        comsChoice = dictionary.rock;
    }
    document.querySelector('#computer').style.background = 
    'url(../image/rock-paper-scissors.png) ' + comsChoice + ' 0';
}, 100);

document.querySelectorAll('.btn').forEach(function(btn) {
    btn.addEventListener('click', function() {
        console.log(this.textContent, comsChoice);
    });        
});