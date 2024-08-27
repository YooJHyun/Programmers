function solution(my_string, is_suffix) {
    let yorn = my_string.endsWith(is_suffix);
    // my_string이 is_suffix로 끝나는지 판별하는 변수를 선언한다
    let answer = 0;

    if (yorn === true) {
        answer = 1;
    } // 맞다면 1을
    else {
        answer = 0;
    } // 아니라면 0을 answer에 넣어준다
    return answer;
}