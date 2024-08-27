function solution(q, r, code) {
    let answer = "";

    let arr = code.split("");
    // code를 배열로 변환한다

    for (let i = 0; i < arr.length; i++) {
        if (i % q === r) {
            answer += arr[i];
        } // 인덱스를 q로 나눈값이 i일 경우 해당 원소를 answer에 붙여준다
    }
    return answer;
}
