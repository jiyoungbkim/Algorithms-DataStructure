const n = prompt('숫자를 입력하세요.');

function isPrime(n) {
    let prime = true;
    for (let i = 2; i*i < n; i++) {
        if(n%i === 0) {
            prime = false;
        }        
    }
    if(prime) {
        console.log('소수입니다.');
    } else {
        console.log('소수가 아닙니다.')
    }
}
isPrime(n);