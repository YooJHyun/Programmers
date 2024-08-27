function solution(x, n) {
    let answer = new Array(n);
    // answer의 길이는 n개로 정한다

    for (let i = 0; i < n; i++) {
        answer[i] = x * (i + 1);
    } // answer에 인덱스가 증가할수록 시작지점인 
      // x를 곱하면서 한칸씩 뒤로 움직이면서 넣어준다
      // 이때, 문제의 x를 int로 설정하면 범위값 오류가 
      // 발생하므로 x를 long으로 변경한다
    return answer;
}
