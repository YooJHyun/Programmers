function solution(price, money, count) {
    var answer = 0;

    for (let i = 1; i <= count; i++) {
        answer += (price * i);
    } // answer에 count 횟수만큼 price의 n번에 해당하는 값을 더해줍니다.

    answer -= money;
    // answer에서 가지고 있는 money를 빼줍니다.

    if (answer < 0) {
        answer = 0;
    } // 만약 금액이 부족하지 않으면 0을 반환합니다.
    return answer;
}