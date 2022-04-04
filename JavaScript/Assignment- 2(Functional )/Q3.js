const isEven = x => x % 2 === 0;
var arr = [9, 3, 5, 4, 2];
function Q3(){
    var i = 0;
    while(i<arr.length){
        if(isEven(arr[i])){
            var even = arr[i];
            break;
        }
        i++;
    }
    document.getElementById('hello').innerHTML = `The even number is ${even}`;
}