function solution(my_string, num1, num2) {
    let answer = "";
    let arr = my_string.split("");
    // my_string을 배열로 변환한다
    
    for (let i = 0; i < arr.length; i++) {
        if (i === num1) {
            answer += arr[num2];
        } // arr의 원소 인덱스가 num1과 같을때 num2 인덱스의 원소를 넣어주고 
        else if (i === num2) {
            answer += arr[num1];
        } // arr의 원소 인덱스가 num2과 같을때 num1 인덱스의 원소를 넣어준다
        else {
            answer += arr[i];
        } // 두 조건에 해당하지 않는 경우 answer에 바로 원소를 넣어준다
    }
    return answer;
}
