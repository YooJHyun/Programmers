function solution(number) {
    var answer = 0;
    let tmp = 0;
    // 세 학생의 정수 번호를 더할 변수를 선언한다

    for (let i = 0; i < number.length; i++) {
        for (let j = i + 1; j < number.length; j++) {
            for (let k = j + 1; k < number.length; k++) {
                tmp = (number[i] + number[j] + number[k]);
                // 각자 다른 i,j,k 세 학생의 번호를 tmp에 더한다
                if (tmp === 0) {
                    answer++;
                    // 만약 세 학생의 번호 합이 0이면 answer를 증가시킨다
                }    
            }
        }
    }
    return answer;
}