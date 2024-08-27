function solution(my_string) {
    var arr = my_string.split(" ");
        // 주어진 my_string을 배열로 변환한다

        let answer = parseInt(arr[0]);
        // 계산의 기본값은 배열의 첫번째 숫자로 지정한다

        for (let i = 1; i < arr.length; i += 2) {
            if (arr[i] === "+") {
                answer += parseInt(arr[i + 1]);
            } // arr의 원소 중 +가 있으면 +의 뒤 숫자를 더하고
            else {
                answer -= parseInt(arr[i + 1]);
            } // 아니라면 -뒤의 숫자를 뺀다
        }
    return answer;
}