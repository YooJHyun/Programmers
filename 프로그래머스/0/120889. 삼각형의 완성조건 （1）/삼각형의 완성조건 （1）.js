function solution(sides) {
    let answer = 0;
    sides.sort((a, b) => a - b);
    // 배열을 정렬하여 가장 큰 수가 마지막에 올 수 있도록 합니다.
    const max = sides[sides.length - 1];
    // max를 선언하고 max는 배열의 마지막인 큰 수를 담습니다.
    for (let i = 0; i < sides.length - 1; i++) {
        for (let j = i + 1; j < sides.length - 1; j++) {
            if (sides[i] + sides[j] > max) {
                answer = 1;
            } // i와 i + 1번째인 j를 더한 값이 max보다 큰 경우 
            // 삼각형이 완성되므로 answer에 1을 넣어줍니다.
            else {
                answer = 2;
            } // max와 같거나 작은 경우 answer에 2를 넣어줍니다.
        }
    }
    return answer;
}
