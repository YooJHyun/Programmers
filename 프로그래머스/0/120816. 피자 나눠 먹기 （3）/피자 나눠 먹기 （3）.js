function solution(slice, n) {
    let answer = 0;
    if (n % slice === 0) {
        answer = Math.floor(n / slice);
    } // 만약 인당 피자 조각수가 나누어 떨어지면 인원수 / 조각수의 몫을 넣어주고
    else {
        answer = Math.floor(n / slice) + 1;
    } // 인당 피자 조각수가 인원수 보다 모자라면 1판을 더해서 넣어준다
    return answer;
}
