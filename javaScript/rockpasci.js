var left = 0;
setInterval(function () {
    if (left === 0) {
        left = '-380px';
    } else if (left === '-380px') {
        left = '-770px';
    } else {
        left = 0;
    }
    document.querySelector('#computer').style.background = 
    'url(../image/rock-paper-scissors.png) ' + left + ' 0';
}, 100);

document.querySelectorAll('.btn').forEach(function(btn) {
    btn.addEventListener('click', function() {
        console.log(this.textContent);
    });        
});

