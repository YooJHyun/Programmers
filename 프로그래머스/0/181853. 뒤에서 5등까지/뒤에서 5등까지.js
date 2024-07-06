function solution(num_list) {
    let answer = new Array(5).fill(0);
    // answer의 길이는 5칸으로 선언한다
    num_list.sort((a, b) => a - b);
    // num_list를 정렬한다

    for (let i = 0; i < num_list.length; i++) {
        if (i < 5) {
            answer[i] = num_list[i];
        } // i가 5보다 작을 때 answer에 num_list를 넣어준다
    }
    return answer;
}
