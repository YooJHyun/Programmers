function solution(n) {
    let len = n.toString();
    // n을 문자열로 변환한다
    
    let arr = len.split("");
    // 변환된 문자열을 배열로 나눈다
    
    let tmp = "";
    
    for (let i = arr.length - 1; i >= 0; i--) {
        tmp += arr[i];
    } // tmp에 역 순서로 넣는다
    
    let answer = new Array(tmp.length);
    
    for (let i = 0; i < tmp.length; i++) {
        answer[i] = tmp.charCodeAt(i) - '0'.charCodeAt(0);
    } // 기존의 역 순서화시킨 tmp를 int[]로 변환한다
    
    return answer;
}