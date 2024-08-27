function solution(s) {
    let answer = "";

    let arr = s.split("");
    // 문자열을 배열로 변환한다

    arr.sort().reverse();
    // 배열을 역정렬한다

    for (let i = 0; i < arr.length; i++) {
        let tmp = arr[i];
        answer += tmp;
    } // 역정렬한 배열의 원소를 answer에 누적합산한다

    return answer;
}
