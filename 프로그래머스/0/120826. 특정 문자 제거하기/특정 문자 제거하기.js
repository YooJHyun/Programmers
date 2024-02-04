function solution(myString, letter) {
    let answer = myString.replace(new RegExp(letter, 'g'), '');
    // 기존 문자열에서 letter를 찾아 ""으로 대체한다
    return answer;
}
