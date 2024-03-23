function solution(numbers) {
    let answer = 0;
    numbers.sort((a, b) => a - b); // numbers를 정렬해준다

    let max = numbers[0] * numbers[1]; // max에 임의의 원소를 곱한 값을 넣는다

    for (let i = 0; i < numbers.length; i++) {
        for (let j = i + 1; j < numbers.length; j++) {
            if (numbers[i] * numbers[j] > max) {
                answer = numbers[i] * numbers[j];
            } // i와 j를 차례대로 곱해서 max와 값이 크면 그 값을 넣어주고 
            else {
                answer = max;
            } // 같거나 작다면 기존의 max값을 넣어준다
        }
    }
    return answer;
}
