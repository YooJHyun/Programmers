function solution(n_str) {
    let str = parseInt(n_str, 10);
    // n_str을 int로 변환하여 앞의 0을 사라지게 한다
    let answer = str.toString();
    // str을 다시 문자열로 변환한다
    return answer;
}
