const num = prompt('숫자입력');

function binary(n){
    if(n === 0 || n === 1) {
        return String(n);
    } else {
        return binary(Math.floor(n/2)) + String(n%2);
    }
}
console.log(binary(num));