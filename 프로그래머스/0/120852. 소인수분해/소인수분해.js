function solution(n) {
    var answer = [];
    // 소인수를 저장할 배열을 생성한다

    for (let i = 2; i <= n; i++) {
        while (n % i === 0) {
        // i가 n의 약수인 경우 반복한다
        if (!answer.includes(i)) {
            answer.push(i);
        } // 배열에 i가 없다면 추가한다
        n /= i;
        } // 실제로 나눠준 뒤 반복한다
    }
    return answer;
}