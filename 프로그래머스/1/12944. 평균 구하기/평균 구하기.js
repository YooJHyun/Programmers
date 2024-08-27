function solution(arr) {
    let answer = 0;

    for(let i = 0; i < arr.length; i++) {
        answer += arr[i];
    } // answer에 arr의 원소를 더해주고
    answer /= arr.length;
    // answer를 arr의 길이로 나누어 평균으로 변환한다
    return answer;
}
