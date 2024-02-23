function solution(cipher, code) {
    let answer = "";
    let arr_cipher = cipher.split("");
    // cipher를 arr로 변환한다
    
    for (let i = 0; i < arr_cipher.length; i++) {
        if ((i + 1) % code === 0) {
            answer += arr_cipher[i];
        } // i가 0일때, 배열의 인덱스가 0부터 시작하기 때문에 
          // i에 1을 더한 값을 code로 나누어 나머지가 0인 경우를 찾는다
          // i가 code의 배수 번째인 경우, arr_cipher[i]의 값을 answer에 추가한다
    }
    return answer;
}
