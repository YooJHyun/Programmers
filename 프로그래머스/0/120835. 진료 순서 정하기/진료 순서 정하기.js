function solution(emergency) {
    var answer = new Array(emergency.length).fill(0);
    // answer를 emergency와 같은 길이로 생성하고 0으로 채운다
    
    for (var i = 0; i < emergency.length; i++) {
        for (var j = 0; j < emergency.length; j++) {
            if (emergency[i] <= emergency[j]) {
                answer[i] += 1;
            } // emergency의 인덱스를 비교하여 더 큰 값이면
              // 작은 값의 인덱스에 해당하는 원소에 1씩 더한다
        }
    }
    return answer;
}
