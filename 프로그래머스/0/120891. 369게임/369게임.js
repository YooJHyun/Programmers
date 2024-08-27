function solution(order) {
    let answer = 0;
    let tmp = order.toString();
    let arr = tmp.split("");
    // order를 배열로 변환한다

    for(let i = 0; i < arr.length; i++) {
        if(arr[i] === "3" || arr[i] === "6" || arr[i] === "9") {
            answer++;
        } // arr의 i번째 값이 3,6,9 중 하나라면 카운트한다
    }
    return answer;
}
