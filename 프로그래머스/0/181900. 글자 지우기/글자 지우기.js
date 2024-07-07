function solution(my_string, indices) {
    let answer = "";

    let arr = my_string.split("");
    // my_string을 배열로 변환한다
    
    for (let i = 0; i < indices.length; i++) {
        arr[indices[i]] = "";
    }   // indices의 각 원소의 자리를 빈값으로 바꾼다

    for (let i = 0; i < arr.length; i++) {
        answer += arr[i];
    } // arr의 원소를 누적 합산한다

    return answer;
}
