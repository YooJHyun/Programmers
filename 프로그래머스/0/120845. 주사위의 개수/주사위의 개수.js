function solution(box, n) {
    let answer = 1;
    // answer에 각 모서리별 값을 곱해야 하므로 1을 넣어준다		
    for (let i = 0; i < box.length; i++) {
        answer *= Math.floor(box[i] / n);
    } // box의 모서리별 n크키의 상자가 들어가는 수만큼 곱해준다
    return answer;
}
