function solution(num, k) {
    var answer = 0;

    var nums = num.toString();
    var arr = nums.split("");
    // num을 문자열로 변환한 다음 배열로 분할합니다.

    var k_string = k.toString();
    // k도 문자열로 변환합니다.

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === k_string) {
            answer = i + 1;
            break;
        } // arr의 i번째 요소가 k_string과 같으면
          // 인덱스 번호 + 1을 answer에 할당하고 반복문을 종료합니다.
        else if (arr[i] !== k_string) {
            answer = -1;
        } // arr의 모든 요소가 k_string과 같지 않으면
          // answer에 -1을 할당합니다.
    }
    return answer;
}
