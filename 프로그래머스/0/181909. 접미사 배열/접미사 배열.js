function solution(my_string) {
    let answer = [];

    for (let i = 0; i < my_string.length; i++) {
    // answer 배열을 my_string의 길이와 동일한 길이로 초기화한다    
        answer.push(my_string.substring(i));
        // i번째부터 끝까지의 부분 문자열을 answer 배열에 추가한다
    }
    answer.sort();
    // answer 배열을 정렬한다
    
    return answer;
}
