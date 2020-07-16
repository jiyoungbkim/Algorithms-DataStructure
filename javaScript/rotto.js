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