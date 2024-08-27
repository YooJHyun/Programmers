function solution(my_string) {
    let answer = new Array(52).fill(0);

    for (let i = 0; i < my_string.length; i++) {
        let charCode = my_string.charCodeAt(i);

        if (charCode >= 65 && charCode <= 90) {
            // my_string의 i번째 원소가 대문자 A인 65부터 대문자 Z인 90 사이에 있으면
            answer[charCode - 65]++;
            // 앞쪽의 26개 인덱스 중 해당 원소를 1증가시키고
        } 
        else if (charCode >= 97 && charCode <= 122) {
            // my_string의 i번째 원소가 소문자 a인 97부터 소문자 z인 122 사이에 있으면
            answer[charCode - 71]++;
            // 뒤쪽의 26개 인덱스 중 해당 원소를 1증가시킨다
        }
    }
    return answer;
}
