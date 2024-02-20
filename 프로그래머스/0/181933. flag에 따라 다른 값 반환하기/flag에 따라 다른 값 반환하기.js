function solution(a, b, flag) {
    let answer = 0;
    
    if (flag === true) {
        answer = a + b;
    } // 만약 flag가 true라면 a+b를 반환하고 
    else {
        answer = a - b;
    } // 만약 flag가 false라면 a-b를 반환한다
    return answer;
}
