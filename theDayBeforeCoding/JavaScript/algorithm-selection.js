// 선택정렬
let a = [10, 11, 9, 2, 3, 6, 5, 4];
let sort = [];
for(var i = 0; i < 8; i++){
    sort.push(Math.min.apply(null, a));
    a.splice(a.indexOf(Math.min.apply(null, a)), 1)
    console.log(a);
    console.log(sort);
}