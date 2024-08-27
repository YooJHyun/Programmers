function solution(my_string) {
    let answer = 0;
    my_string = my_string.toLowerCase();
    my_string = my_string.replace(/[abcdefghijklmnopqrstuvwxyz]/g, "x");
    // 문자열의 소문자 알파벳을 모두 x로 대체한다
    let arr = my_string.split("x");
    // x를 기준으로 문자열을 분할하여 배열로 변환한다
    
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] !== "") {
            answer += parseInt(arr[i]);
        } // 배열의 원소가 비어있지 않다면 숫자로 변환하여 누적합산한다
    }
    return answer;
}
