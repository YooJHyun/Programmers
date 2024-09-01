function solution(new_id) {
    var answer = "";
    
    // 1단계: 모든 대문자를 대응되는 소문자로 치환
    new_id = new_id.toLowerCase();
    
    // 2단계: 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
    const filter = "abcdefghijklmnopqrstuvwxyz0123456789-_.";
    for (let i = 0; i < new_id.length; i++) {
        const ch = new_id.charAt(i);
        if (filter.includes(ch)) { 
            answer += ch;
        }
    }

    // 3단계: 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
    while (answer.includes("..")) {
        answer = answer.replace("..", ".");
    }

    // 4단계: 마침표(.)가 처음이나 끝에 위치한다면 제거
    if (answer.startsWith(".")) {
        answer = answer.substring(1);
    }
    if (answer.endsWith(".")) {
        answer = answer.substring(0, answer.length - 1);
    }

    // 5단계: 빈 문자열이라면, "a"를 대입
    if (answer === "") {
        answer = "a";
    }

    // 6단계: 길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지를 제거
    if (answer.length >= 16) {
        answer = answer.substring(0, 15);
    }
    // 만약 제거 후 마침표(.)가 끝에 위치한다면, 끝에 위치한 마침표(.) 제거
    if (answer.endsWith(".")) {
        answer = answer.substring(0, answer.length - 1);
    }

    // 7단계: 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
    while (answer.length <= 2) {
        answer += answer.charAt(answer.length - 1);
    }

    return answer;
}
