function solution(my_string) {
    var my_arr = my_string.split(" ");
    // my_string을 배열로 변환한다
    const answer = [];
    // 공백을 제외한 값을 넣어줄 배열을 선언한다
    
    for (let i = 0; i < my_arr.length; i++) {
        if (my_arr[i].trim() !== "") {
            answer.push(my_arr[i]);
        } // my_arr의 원소에서 공백이 아니라면
    }     // answer에 그 값을 넣는다
    return answer;
}