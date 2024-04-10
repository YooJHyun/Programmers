function solution(order) {
    let answer = 0;

    for (let i = 0; i < order.length; i++) {
        if (order[i] === "anything") {
            answer += 4500;
        } // order의 i번째 원소가 아무거나와 같다면 아메리카노 가격 4500원을 더하고 
        else if (order[i].includes("americano")) {
            answer += 4500;
        } // order의 i번째 원소가 아메리카노를 포함한다면 아메리카노 가격 4500원을 더하고 
        else if (order[i].includes("cafelatte")) {
            answer += 5000;
        } // order의 i번째 원소가 카페라떼를 포함한다면 카페라떼 가격 5000원을 더한다
    }
    return answer;
}
