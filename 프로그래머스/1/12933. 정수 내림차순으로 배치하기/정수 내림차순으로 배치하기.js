function solution(n) {
    let answer = 0;
    let a = "";
    
    let ans = n.toString();
    let list = ans.split("");
    // n을 문자열로 변환하고, 배열로 분리한다
    
    list.sort((a, b) => b - a);
    // 배열을 내림차순으로 정렬한다
    
    for (let i = 0; i < list.length; i++) {
        a += list[i];
    } // 배열을 다시 문자열로 합친다
    
    answer = parseInt(a);
    // 문자열을 정수형으로 변환한다
    
    return answer;
}
