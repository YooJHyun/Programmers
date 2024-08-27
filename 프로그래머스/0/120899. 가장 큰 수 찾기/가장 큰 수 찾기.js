function solution(array) {
    var answer = [0, 0]; // 정답 배열 초기화
    let max = array[0]; // max는 array의 첫 번째 원소 값을 넣어둔다
        
    for (let i = 0; i < array.length; i++) {
        if (max <= array[i]) {
            max = array[i];
            answer[0] = max;
            answer[1] = i; 
            // max보다 큰 수가 발견되면
            // answer의 0번째는 max보다 큰 값을 넣어주고
            // answer의 1번째는 max의 인덱스를 넣어준다
        }
    }
    return answer;
}