const unsorted = prompt('');

let sorted = unsorted
            .split(' ')
            .sort(function(a , b){
                return a - b;
            })
            .join(' ');
console.log(unsorted);
console.log(sorted);
let result = (unsorted === sorted) ? 'YES' : 'NO';
console.log(result);