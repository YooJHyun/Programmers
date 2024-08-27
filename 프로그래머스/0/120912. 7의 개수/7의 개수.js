function solution(array) {
    let answer = 0;

    for (let i = 0; i < array.length; i++) {
        let ele = array[i].toString();
        let earr = ele.split("");
        // 배열의 요소를 문자열로 변환하여 분리한 후 배열로 저장합니다.
        for (let j = 0; j < earr.length; j++) {
            if (earr[j] === "7") {
                answer++;
            } // 배열의 요소 중 "7"이 있으면 answer를 증가시킵니다.
        }
    }
    return answer;
}
