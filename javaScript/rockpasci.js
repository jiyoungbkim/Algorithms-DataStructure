var coordinate = 0;
var dictionary = { // 딕셔너리 자료구조
    rock : '0',
    paper : '-380px',
    scissors : '-770px'
};
/* var dictionary2 = {
    '0' : '바위',
    '-380px' : '보',
    '-770px' : '가위'
};  */
console.log(Object.entries(dictionary));
function comsChoice(coordinate) {
    return Object.entries(dictionary).find(function(v) {
        return v[1] == coordinate;
    })[0];
}

setInterval(function () {
    if (coordinate === dictionary.rock) {
        coordinate = dictionary.paper;
    } else if (coordinate === dictionary.paper) {
        coordinate = dictionary.scissors;
    } else {
        coordinate = dictionary.rock;
    }
    document.querySelector('#computer').style.background = 
    'url(../image/rock-paper-scissors.png) ' + coordinate + ' 0';
}, 100);

document.querySelectorAll('.btn').forEach(function(btn) {
    btn.addEventListener('click', function() {
        console.log(this.textContent, comsChoice(coordinate));
    });        
});