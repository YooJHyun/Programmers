function solution(a, b) {
   let answer = 0;
        
    const a1 = a.toString();
    const b1 = b.toString();
    // a와 b를 문자열로 변환합니다.
        
    const sum1 = a1 + b1;
    const sum2 = b1 + a1;
    // a와 b를 붙입니다.
        
    const tmp1 = parseInt(sum1);
    const tmp2 = parseInt(sum2);
    // 붙인 문자열을 다시 정수로 변환합니다.
        
    if (tmp1 >= tmp2) {
        answer = tmp1;
    } 
    else {
        answer = tmp2;
    }
    // tmp1이 tmp2보다 크거나 같은 경우 tmp1을 반환하고, 그렇지 않은 경우 tmp2를 반환합니다.
    return answer;
}