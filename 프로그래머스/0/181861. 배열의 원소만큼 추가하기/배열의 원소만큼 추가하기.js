function solution(arr) {
    let answer = [];
    
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr[i]; j++) {
            answer.push(arr[i]);
        } // i는 arr의 index이고 길이만큼 for문이 반복된다
    }     // j는 arr의 i번째 원소만큼 추가된다
    return answer;
}
