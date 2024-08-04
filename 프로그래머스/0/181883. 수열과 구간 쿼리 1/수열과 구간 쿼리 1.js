function solution(arr, queries) {
    for (let i = 0; i < queries.length; i++) {
        let s = queries[i][0];
        let e = queries[i][1];

        for (let j = s; j <= e; j++) {
            arr[j] += 1;
        } // queries에서 주어진 규칙에 해당하는 arr[i]에 1을 더해준다
    }
    return arr;
}
