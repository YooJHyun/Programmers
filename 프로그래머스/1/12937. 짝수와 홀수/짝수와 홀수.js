function solution(num) {
    let answer = "";
    if(num % 2 === 0) {
        answer = "Even";  
        // num이 짝수라면 "Even"을 answer에 넣어준다
    } else {
        answer = "Odd";   
        // num이 홀수라면 "Odd"를 answer에 넣어준다
    }
    return answer;
}
