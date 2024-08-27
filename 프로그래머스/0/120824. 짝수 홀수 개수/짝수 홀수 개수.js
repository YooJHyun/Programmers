function solution(numList) {
    const answer = [0, 0];
    let evenCount = 0;
    let oddCount = 0;
    // 홀수와 짝수를 세어줄 변수 선언
    
    for (let i = 0; i < numList.length; i++) {
        if (numList[i] % 2 === 0) {
            evenCount++;
            // 2로 나눈 나머지가 0이면 짝수이므로 even이 카운트되고
        } else {
            oddCount++;
            // 나머지가 0이 아니라면 홀수이므로 odd가 카운트 된다
        }
    }

    answer[0] = evenCount;
    answer[1] = oddCount;
    // even, odd을 answer에 넣어준다
    return answer;
}