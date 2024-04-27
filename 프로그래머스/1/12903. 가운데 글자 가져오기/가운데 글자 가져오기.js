function solution(s) {
    let answer = "";
    
    if (s.length % 2 === 0) {
        // s의 길이가 짝수인 경우 s의 길이 절반의 앞과 뒤를 함께 가져온다
        answer = s.substring((s.length / 2) - 1, (s.length / 2) + 1);
    } else {
        // s의 길이가 홀수인 경우 s의 길이 절반, 즉 가운데 글자를 가져온다
        answer = s.substring(Math.floor(s.length / 2), Math.floor(s.length / 2) + 1);
    }
    return answer;
}
