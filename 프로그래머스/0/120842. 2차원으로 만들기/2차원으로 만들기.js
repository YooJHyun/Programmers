function solution(num_list, n) {
    let answer = [];
    let k = 0;

    for (let i = 0; i < num_list.length / n; i++) {
        answer.push([]);
        for (let j = 0; j < n; j++) {
            answer[i][j] = num_list[k++];
        }
    } // num_list를 answer에 넣어준다
    return answer;
}
