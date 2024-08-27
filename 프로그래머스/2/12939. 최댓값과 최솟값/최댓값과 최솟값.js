function solution(s) {
    let answer = "";
    
    const numbers = s.split(" ");
    // 문자열을 공백을 기준으로 나눈다
    let min = Number.MAX_SAFE_INTEGER;
    let max = Number.MIN_SAFE_INTEGER;
    
    for(let i = 0; i < numbers.length; i++) {
        const number = parseInt(numbers[i]);
        // 문자열의 요소를 정수로 변환한다
        
        min = Math.min(min, number);
        max = Math.max(max, number);
    }   // numbers의 요소 중에서 최솟값과 최댓값을 찾아서 넣어준다

    answer = min + " " + max;
    // 최솟값, 최댓값 순으로 정리하여 반환한다
    return answer;
}
