function solution(num_list, n) {
    let answer = new Array(num_list.length - n + 1).fill(0);
    // answer 배열을 만들고 0으로 초기화합니다.
    let j = 0;
    for (let i = 0; i < num_list.length; i++) {
        if (i >= n - 1) {
            // i가 자르고자 하는 n보다 1이 적은 인덱스를 가지므로 이보다 i가 클때
            answer[j] += num_list[i];
            // answer에 채워줍니다.
            j++;
            // 이때, 1의 차이를 고려하여 answer의 인덱스는 0부터 시작할 수 있도록 합니다.
        }
    }
    return answer;
}
