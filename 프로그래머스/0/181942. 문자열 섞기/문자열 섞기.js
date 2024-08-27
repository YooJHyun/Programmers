function solution(str1, str2) {
    var answer = '';
    
    for (let i = 0; i < str1.length; i++) {
        answer += str1[i];
        answer += str2[i];
    } // answer에 두 문자열의 원소를 한번씩 누적합산한다
    
    return answer;
}
