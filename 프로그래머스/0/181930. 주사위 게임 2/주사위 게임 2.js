function solution(a, b, c) {
    let answer = 0;

    if (a !== b && a !== c && b !== c) {
        answer = (a + b + c);
    } // a, b, c가 모두 다른 경우
    else if ((a !== b && a === c) || (a !== b && b === c) || (a !== c && a === b) || 
             (a !== c && b === c) || (b !== c && a === b) || (b !== c && a === c)) {
        answer = (a + b + c) * (a*a + b*b + c*c);
    } // 두 숫자가 같고 하나는 다른 경우
    else if (a === b && a === c && b === c) {
        answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
    } // 세 숫자가 모두 같은 경우

    return answer;
}
