function solution(n) {
    let answer = 0;
    
    for (let i = 1; i <= n; i++) {
        if (n % i === 0) {
            answer += i;
        }
    } // i가 n의 약수일때 answer에 누적 합산한다
    return answer;
}
