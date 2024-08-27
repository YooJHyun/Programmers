function solution(a, b) {
    // 문자열로 된 a와 b를 BigInt를 이용해 큰 정수로 변환
    let a1 = BigInt(a);
    let b1 = BigInt(b);
        
    // a1과 b1을 더하여 tmp에 저장
    let tmp = a1 + b1;
        
    // tmp를 다시 문자열로 변환하여 반환
    let answer = tmp.toString();
        
    return answer;
}