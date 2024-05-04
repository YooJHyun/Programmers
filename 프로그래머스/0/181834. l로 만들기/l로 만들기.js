function solution(myString) {
    var answer = myString.replace(/[abcdefghijk]/g, 'l');
    // myString의 a부터 k를 l로 바꾼다
    return answer;
}