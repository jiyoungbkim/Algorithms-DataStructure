const keys = prompt("이름?").split(' ');
const values = prompt("점수?").split(' ');
const obj = {};

for(let i = 0; i < keys.length; i++){
    obj[keys[i]] = parseInt(values[i],10);
}
console.log(obj);