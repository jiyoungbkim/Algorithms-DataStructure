// 삽입정렬
let a = [5, 10, 66, 77, 54, 32, 11, 15];
let sort = [];
let len = a.length;

function insertIndex(sort, insert){
    for(var i in sort){
        if(insert < sort[i]){
            return i;
        }
    }
    return sort.length;
}
for(var i = 0; i < len; i++){
    insert = a.shift();
    index = insertIndex(sort, insert);
    sort.splice(index, 0, insert);
    console.log(`index : ${index}`);
    console.log(`sort : ${sort}`);
}