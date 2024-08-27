function solution(s) {
    var answer = true;
    
    if (s.length !== 4 && s.length !== 6) {
        answer = false;
        // s의 길이가 4 또는 6이 아니면 false를 반환합니다.
    }
    
    for (let i = 0; i < s.length; i++) {
        let tmp = s.charAt(i);
        // s의 각 문자를 tmp에 저장합니다.
        
        if (!/\d/.test(tmp)) {
            answer = false;
        } // tmp가 숫자가 아니라면 false를 반환합니다.
    }
    return answer;
}
