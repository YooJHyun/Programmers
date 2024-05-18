function solution(s) {
    let answer = 0;
    
    let arr = s.split(" ");
    // 문자열을 배열로 변환한다
    
    for(let i = 0; i < arr.length; i++) {
        if(arr[i] === "Z") {
            answer -= parseInt(arr[i - 1]);
            continue;
        } // arr의 원소가 Z인 경우 해당 인덱스 앞의 원소값을 빼고
        else {
            answer += parseInt(arr[i]);
        } // 이에 해당하지 않으면 answer에 합산한다
    }
    return answer;
}
