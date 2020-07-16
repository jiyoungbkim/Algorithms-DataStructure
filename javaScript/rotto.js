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