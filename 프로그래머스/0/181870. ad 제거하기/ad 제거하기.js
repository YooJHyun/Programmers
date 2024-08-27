function solution(strArr) {
    let answer = [];

    for (let i = 0; i < strArr.length; i++) {
        let str = strArr[i];
        if (!str.includes("ad")) {
            answer.push(str);
        } // str에 strArr의 원소를 대입하고 ad를 포함하지 않는 경우
          // answer에 대입하고 이를 반복한다
    }
    return answer;
}
