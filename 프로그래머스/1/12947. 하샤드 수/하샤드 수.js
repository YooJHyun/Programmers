function solution(x) {
    let a = 0;
    let b = x;
    
    while (b >= 1) {
        a += b % 10;
        b = Math.floor(b / 10);
    } // x가 1 이상인 경우 a에는 b의 1의 자릿수를 누적 합산하여 자릿수의 합을 구하고, b는 1의 자릿수를 잘라낸 수를 넣는다

    return x % a === 0;
    // x를 각 자릿수의 합으로 나누어지면 true, 그렇지 않으면 false를 반환한다
}
