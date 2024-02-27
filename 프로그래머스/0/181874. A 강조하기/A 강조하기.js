function solution(myString) {
    let answer = myString.toLowerCase();
    // 문자열을 모두 소문자로 바꾼다
    answer = answer.replaceAll("a", "A");
    // 소문자 a를 대문자 A로 변환한다
    return answer;
}
