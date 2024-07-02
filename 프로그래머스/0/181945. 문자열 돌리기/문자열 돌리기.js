const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    const str = input[0];
    const arr = str.split('');
    // 입력받은 문자열을 배열로 변환한다
    arr.forEach(char => {
        console.log(char);
        // 배열의 각 원소들을 다음줄로 하나씩 출력한다
    });
});