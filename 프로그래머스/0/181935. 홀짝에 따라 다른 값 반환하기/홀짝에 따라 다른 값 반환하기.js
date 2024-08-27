function solution(n) {
    let answer = 0;
    for (let i = 0; i <= n; i++) {
        if (n % 2 !== 0) {
            // 만약 n이 홀수라면 
            if (i % 2 !== 0) {
                answer += i;
            }   // n이하의 홀수들을 answer에 합해주고
        }
        if (n % 2 === 0) {
            // 만약 n이 짝수라면
            if (i % 2 === 0) {
                answer += (i * i);
            }   // n이하의 짝수들의 제곱을 answer에 합해준다
        }
    }
    return answer;
}
