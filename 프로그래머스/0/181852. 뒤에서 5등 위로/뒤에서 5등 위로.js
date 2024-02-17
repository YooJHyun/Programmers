function solution(num_list) {
    const answer = new Array(num_list.length - 5);
    // answer의 길이는 num_list에서 제외하고자 하는 수만큼 짧게 선언한다
    num_list.sort((a, b) => a - b);
    // num_list를 정렬한다
    let num = 0;

    for (let i = 0; i < num_list.length; i++) {
        if (i > 4) {
            answer[num] = num_list[i];
            num++;
        } // i가 num_list의 원소 번호가 5 이상일때 answer에 넣어준다
    }
    return answer;
}
