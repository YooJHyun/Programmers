function solution(i, j, k) {
    var answer = 0;
    for (let l = i; l <= j; l++) {
        let num = l.toString();
        // 각 숫자를 문자열로 변환한다

        for (let m = 0; m < num.length; m++) {
            if (k.toString() === num[m]) {
                answer++;
            } // 문자열에 k가 포함된 경우 answer를 증가시킨다
        }
    }
    return answer;
}
