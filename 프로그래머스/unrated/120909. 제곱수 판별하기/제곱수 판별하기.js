function solution(n) {
    let answer = 0;
    for (let i = 1; i <= 1000; i++) {
        let num = i * i;
        // n의 범위가 1에서 100만으로
        // 1에서 1000의 제곱수까지 이다
        // for문으로 1에서 1000까지 반복하면서
        if (num === n) {
            answer = 1;
            break;
        }   // 제곱수로 판정되면 1을 반환
        else {
            answer = 2;
        }   // 제곱수가 아니라고 판정되면 2를 반환한다
    }
    return answer;
}
