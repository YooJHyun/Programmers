function solution(numbers) {
    var answer = 0;
    let tmp = 0;
    for (let i = 0; i < numbers.length; i++) {
        tmp += numbers[i];
    } // 배열의 0번째부터 길이까지 tmp에 합해주고
    answer = tmp / numbers.length;
    // 배열 속 수를 더한 tmp에서 전체 길이로 나누어 평균값을 구한다
    return answer;
}
