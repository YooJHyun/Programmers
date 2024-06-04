function solution(my_string, is_prefix) {
    let answer = 0;
    let yorn = my_string.startsWith(is_prefix);
    // my_string이 is_prefix로 시작하는지 판별하는 변수를 선언한다
    if (yorn) {
        answer = 1;
    }   // 참이라면 1,
    else {
        answer = 0;
    }   // 거짓이면 0을 받는다
    return answer;
}
