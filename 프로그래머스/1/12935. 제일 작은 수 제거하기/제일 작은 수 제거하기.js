function solution(arr) {
    if (arr.length === 1) {
        return [-1];
    }

    let answer = [];
    let min = arr[0];

    // 배열의 최소값을 찾는다
    for (let i = 0; i < arr.length; i++) {
        min = Math.min(min, arr[i]);
    }

    // 최소값을 제외한 배열을 생성한다
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === min) {
            continue;
        }
        answer.push(arr[i]);
    }

    return answer;
}
