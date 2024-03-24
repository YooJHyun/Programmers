function solution(n) {
    let count = 0;

    for (let i = 1; i <= n; i++) {
        if (n % i === 0) {
            count++;
        } // 약수의 갯수를 count해준다
    }
    let answer = new Array(count);
    // 약수가 담길 배열의 길이는 count로 정한다
    let j = 0;
    for (let i = 1; i <= n; i++) {
        if (n % i === 0) {
            answer[j] = i;
            j++;
        } // 약수를 answer에 담아준다
    }
    return answer;
}
