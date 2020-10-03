const participant = ['mislav','stanko','mislav','ana'];
const completion = ['stanko','mislav','ana'];
console.log(solution(participant, completion));

function solution(participant, completion) {
    var newList = completion.reduce(function(acc, c){
        acc[c] = acc[c] ? (acc[c]+1) : 1;
        return acc;
    },{});
    return participant.find(function(c){
        if(newList[c]) {
            newList[c] -= 1;
        } else {
            return true;
        }
    });
}