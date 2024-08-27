function solution(absolutes, signs) {
    var answer = 0;

    for (let i = 0; i < signs.length; i++) {
        if (signs[i]) {
            answer += absolutes[i];
        } // sign의 i번째가 true이면 answer에 i의 값을 더해주고 
        else {
            answer -= absolutes[i];
        } // false인 경우 answer에서 i의 값을 빼준다
    }
    return answer;
}