function solution(n) {
    var answer = Array.from({ length: n }, () => Array(n).fill(0));
    // 이차원 배열의 크기는 i,j가 각 n개씩 가지도록 선언한다

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            // i, j가 각자 1칸씩 증가하여 정사각형의 이차원 배열을 생성할때,
            if (i === j) {
                answer[i][j] = 1;
            } // i,j가 같으면 1을 대입하고
        }
    }
    return answer;
}