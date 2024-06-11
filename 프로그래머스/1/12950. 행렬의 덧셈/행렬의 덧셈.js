function solution(arr1, arr2) {
    const answer = Array(arr1.length).fill(null).map(() => Array(arr1[0].length).fill(0));
    // answer는 각 arr1, arr2의 길이만큼 선언한다

    for (let i = 0; i < arr1.length; i++) {
        for (let j = 0; j < arr1[i].length; j++) {
            answer[i][j] = arr1[i][j] + arr2[i][j];
        } // answer의 i,j에 각 arr1, arr2의 동일한 자리의 원소를 더해준다
    }
    return answer;
}
