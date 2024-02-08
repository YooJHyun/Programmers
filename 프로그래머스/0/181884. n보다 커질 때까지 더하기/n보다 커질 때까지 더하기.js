function solution(numbers, n) {
    let answer = 0;
    for(let i = 0; i < numbers.length; i++) {
        answer += numbers[i];
        // answer에 numbers의 원소들을 합쳐준다
        if(answer > n) {
            break;
        } // 만약 원소들의 합이 n보다 크면 for문을 빠져나간다
    }
    return answer;
}
