function solution(arr, n) {
    var answer = new Array(arr.length);
    // arr과 동일한 길이로 배열을 선언합니다.
    
    for (let i = 0; i < arr.length; i++) {
        if (arr.length % 2 !== 0) {
            // arr의 길이가 홀수일 때,
            if (i % 2 === 0) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            } // 짝수 번째 원소에 n을 더하고, 홀수 번째는 기존의 원소를 넣습니다.
        } else {
            // arr의 길이가 짝수라면,
            if (i % 2 !== 0) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            } // 홀수 번째 원소에 n을 더하고, 짝수 번째 원소는 그대로 넣습니다.
        }
    }
    return answer;
}