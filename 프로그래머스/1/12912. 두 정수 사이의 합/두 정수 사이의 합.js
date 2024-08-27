function solution(a, b) {
    let answer = 0;
        
    if (a > b) {
        for (let i = b; i <= a; i++) {
            answer += i;
        } // a가 더 큰 숫자인 경우 b부터 a까지의 수를
    }     // answer에 누적합산하고
    else {
        for (let i = a; i <= b; i++) {
            answer += i;
        } // b가 더 큰 숫자인 경우 a부터 b까지의 수를
    }     // a부터 b까지의 수를 answer에 누적 합산한다
    return answer;
}