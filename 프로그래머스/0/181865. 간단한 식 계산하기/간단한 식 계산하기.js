function solution(binomial) {
    let answer = 0;
    const bioindex = binomial.split(" ");
    // binomial을 배열로 변환한다
    
    const a = parseInt(bioindex[0]);
    const op = bioindex[1];
    const b = parseInt(bioindex[2]);
    // parseInt를 사용하여 문자열을 정수로 변환한다
    
    if (op === "+") {
        answer += a + b;
    } // op가 +라면 a + b를 수행하고  
    else if (op === "-") {
        answer += a - b;
    } // op가 -라면 a - b를 수행하고 
    else if (op === "*") {
        answer += a * b;
    } // op가 *라면 a * b를 수행한다

    return answer;
}
