function solution(n) {
    var answer = 0;
    
    for (let i = 1; i <= n; i++) {
        let me = 0;
        // 약수의 수를 담아줄 변수 me를 선언한다
        for (let j = 1; j <= n; j++) {
            if (i % j === 0) {
                // i를 j로 나눈 나머지의 값이 0일 때마다
                me++;
                // 약수를 증가시킨다
            }
        }
        if (me >= 3) {
            answer++;
        } // 약수의 수가 1과 n자신을 포함한 
          // 3개 이상일 때 answer를 증가시킨다
    }
    return answer;
}
