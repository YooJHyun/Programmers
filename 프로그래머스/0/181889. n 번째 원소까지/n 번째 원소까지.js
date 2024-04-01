function solution(num_list, n) {
    let answer = new Array(n).fill(0); // answer 배열을 0으로 초기화
    // answer의 크기는 n까지 이므로 n으로 설정한다
    for(let i = 0; i < num_list.length; i++) {
        if(i < n) {
            answer[i] += num_list[i];
        }   // num_list의 n번째 원소까지 answer에 넣어준다
    }
    return answer;
}