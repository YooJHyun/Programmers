function solution(array) {
    var answer = 0;
    array.sort((a, b) => a - b);
    // 배열 오름차순 정렬
    answer = array[Math.floor(array.length / 2)];
    // 배열의 길이를 2로 나누어 중앙값을 찾는다
    return answer;
}
