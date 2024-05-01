function solution(n) {
    let answer = 0;

    let fac = 1;
    // 누적 곱을 위한 항등원을 넣은 fac을 선언합니다

    for (let i = 1; i <= n; i++) {
      fac *= i;
      // fac에 정수의 곱을 누적합니다
      if (fac > n) {
        answer += i - 1;
        break;
      } // 정수 누적곱이 n보다 크다면 i - 1을 answer에 더합니다
      else if (fac === n) {
        answer += i;
        break;
      } // 정수 누적곱이 n과 같다면 i를 answer에 더합니다
    }
    return answer;
 }