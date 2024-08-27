function solution(my_strings, parts) {
    var answer = '';
    
    for (let i = 0; i < my_strings.length; i++) {
        let sum = my_strings[i];
        // sum에 my_strings를 담아서 문자열로 만든다
        answer += sum.substring(parts[i][0], parts[i][1] + 1);
        // sum에서 해당값을 잘라서 누적합산한다
    }    
    return answer;
}