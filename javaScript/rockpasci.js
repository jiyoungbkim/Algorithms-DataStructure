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
        return v[1] === coordinate;
    })[0];
}

var Interval;
function IntervalMaker(){
    Interval = setInterval(function () {
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
}

IntervalMaker();

var scores = {
    scissors : 1,
    rock : 0,
    paper : -1,
    가위 : 1,
    바위 : 0,
    보 : -1,
};

document.querySelectorAll('.btn').forEach(function(btn) {
    btn.addEventListener('click', function() {
        clearInterval(Interval);
        setTimeout(function() {
            IntervalMaker();
        }, 1000);
        var myChoice = this.textContent;
        var myScore = scores[myChoice];
        var comsScore = scores[comsChoice(coordinate)];
        var scoreGap = myScore - comsScore;
        console.log(myChoice, comsChoice(coordinate));
        if(scoreGap === 0) {
            console.log('비겼습니다. ');
        } else if ([-1,2].includes(scoreGap)) {
            console.log('이겼습니다 !!!');
        } else {
            console.log('졌습니다. ㅠㅠ');
        }

        // if (myChoice === '바위') {
        //     if (comsChoice(coordinate) === 'rock') {
        //         console.log('비겼습니다. ');
        //     } else if (comsChoice(coordinate) === 'scissors') {
        //         console.log('이겼습니다 !!!');
        //     } else {
        //         console.log('졌습니다. ㅠㅠ');
        //     }
        // } else if (myChoice === '보') {
        //     if (comsChoice(coordinate) === 'paper') {
        //         console.log('비겼습니다. ');
        //     } else if (comsChoice(coordinate) === 'rock') {
        //         console.log('이겼습니다 !!!');
        //     } else {
        //         console.log('졌습니다. ㅠㅠ');
        //     }
        // } else if (myChoice === '가위') {
        //     if (comsChoice(coordinate) === 'scissors') {
        //         console.log('비겼습니다. ');
        //     } else if (comsChoice(coordinate) === 'paper') {
        //         console.log('이겼습니다 !!!');
        //     } else {
        //         console.log('졌습니다. ㅠㅠ');
        //     }    
        // }
    });        
});