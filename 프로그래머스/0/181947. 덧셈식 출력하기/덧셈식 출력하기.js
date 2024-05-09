const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function(line) {
    input = line.split(' ');
}).on('close', function() {
    // 입력된 값을 숫자로 변환합니다.
    const a = Number(input[0]);
    const b = Number(input[1]);
    
    // a와 b를 더한 결과를 출력합니다.
    console.log(`${a} + ${b} = ${a + b}`);
});
