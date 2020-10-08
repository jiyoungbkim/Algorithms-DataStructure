const page = ['척추동물', '어류', '척추동물', '무척추동물', '파충류', '척추동물', '어류', '파충류'];

// ['척추동물'] #false 1min
// ['척추동물', '어류'] #false 1min
// ['어류', '척추동물'] #true 1sec
// ['어류', '척추동물', '무척추동물'] #false 1min
// ['척추동물', '무척추동물', '파충류'] #false 1min
// ['무척추동물', '파충류', '척추동물'] #true 1sec
// ['파충류', '척추동물', '어류'] #false 1min
// ['척추동물', '어류', '파충류'] #true 1sec

function solution(page, seat) {
    let chair = [];
    let count = 0;
    for (const animal of page) {    
        if(chair.length < 3) {        
            if(chair.includes(animal)) {
                chair.splice(chair.indexOf(animal), 1);
                chair.push(animal);
                count += 1;
            } else {
                chair.push(animal);
                count += 60;
            }        
        } else {
            if(chair.includes(animal)) {
                chair.splice(chair.indexOf(animal), 1);
                chair.push(animal);
                count += 1;
            } else {
                chair.shift();
                chair.push(animal);
                count += 60;
            } 
        }
        console.log(chair);
    }
    return `${parseInt((count/60), 10)}min ${count%60}sec`;
}
console.log(solution(page, 3));