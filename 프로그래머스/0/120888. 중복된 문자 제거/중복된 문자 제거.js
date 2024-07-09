function solution(my_string) {
    var answer = '';
    
    for(let i = 0; i < my_string.length; i++) {
        if(my_string.indexOf(my_string[i]) === i) {
            answer += my_string[i];
            // my_string의 인덱스가 i와 일치하면 answer에 더해주고
            // 일치하지 않으면 더하지 않는다
        }
    }
    return answer;
}