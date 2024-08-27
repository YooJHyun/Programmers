function solution(my_string) {
    let answer = "";
    let arr = my_string.split("");
     // my_string을 배열로 변환한다
    for (let i = arr.length - 1; i >= 0; i--) {
        // i가 배열의 뒷쪽부터 앞으로 넣을 수 있게 for문을 선언한다	
        answer += arr[i];
        // answer에 배열의 뒷 부분. 즉, 문자열을 반대로 넣어준다
    }
    return answer;
}
