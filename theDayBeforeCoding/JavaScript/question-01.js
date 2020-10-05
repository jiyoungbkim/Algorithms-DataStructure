let data = ['   + -- + - + -   ',
            '   + --- + - +   ',
            '   + -- + - + -   ',
            '   + - + - + - +   '];
let result = '';
for (const s of data) {
    //console.log(s.replace(/ /g,'').replace(/\+/g,'1').replace(/-/g,'0'));
    //console.log(parseInt(s.replace(/ /g,'').replace(/\+/g,'1').replace(/-/g,'0'), 2));
    result += String.fromCharCode(parseInt(s.replace(/ /g,'').replace(/\+/g,'1').replace(/-/g,'0'), 2));
}
console.log(result);