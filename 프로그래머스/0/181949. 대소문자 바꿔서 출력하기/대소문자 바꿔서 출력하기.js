const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    let answer = "";

    for (let i = 0; i < str.length; i++) {
        let ul = str.charAt(i);
        // 입력받은 문자를 char형으로 변환한다
        
        if (ul === ul.toLowerCase()) {
            answer += ul.toUpperCase();
            // 만약 대상 글자가 소문자라면 대문자로 변환하여
        }   // answer에 누적합산하고
        else {
            answer += ul.toLowerCase();
        }   // 대문자이면 소문자로 변환하여 answer에 누적합산한다
    }
    console.log(answer);
});