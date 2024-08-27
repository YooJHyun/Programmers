function solution(bin1, bin2) {
    let num1 = parseInt(bin1, 2);
    let num2 = parseInt(bin2, 2);
    // bin1과 bin2를 각 2진수에서 10진수로 변환한다
    
    let tmp = num1 + num2;
    // tmp에서 10진수로 변환한 두 값을 더한다
    
    let answer = tmp.toString(2);
    // answer에 합산한 10진수 값을 2진수로 재변환한다
    return answer;
}
