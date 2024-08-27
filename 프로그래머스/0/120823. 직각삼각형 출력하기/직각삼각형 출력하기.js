const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    const n = Number(input[0]);
    const triple = '*';
    // 출력될 문자를 선언한다

    for (let i = 0; i < n; i++) {
        let line = '';
        for (let j = 0; j <= i; j++) {
            line += triple;
        } // j는 가로 행을 의미하며 i의 값 증가마다 *을 입력하고
        // i는 세로 행을 의미하며 scanner를 통해 받아온 n만큼의 줄을 만들어준다
        console.log(line);
    }
});
