function solution(array, height) {
    let answer = 0;

    for (let i = 0; i < array.length; i++) {
        if (array[i] > height) {
            answer++;
        // 만약 머쓱이보다 키가 큰 경우 answer가 1씩 증가한다
        }
    }
    return answer;
}