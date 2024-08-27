function solution(n) {
    let list = [];
    list.push(n);

    while (n !== 1) {
        // n이 1이 될 때까지 아래 if else문 반복
        if (n % 2 === 0) {
            n /= 2;
            // n이 짝수이면 2로 나누고
        } else {
            n = 3 * n + 1;
            // 홀수이면 3을 곱하고 1을 더한다
        }
        list.push(n);
        // 각 if else 구문 종료시 연산된 값을 리스트에 추가한다
    }
    return list;
}
