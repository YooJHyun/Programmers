function solution(myString) {
    let answer = "";

    answer += myString.replace(/[aeiou]/g, "");
    // my_string에서 모음 발견시 해당 원소를 제거한다
    return answer;
}