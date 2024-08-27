function solution(a, d, included) {
    var answer = 0;
    
    for (let i = 0; i < included.length; i++) {
        if (included[i] === true) {
            answer += a + (d * i);
        } // included의 원소 값이 true일시 answer에 등차 수열의 값을 더해준다
    }
    return answer;
}