function solution(num_list, n) {
    let after = [];
    // n과 n 이후의 원소를 담을 배열을 선언한다
    let before = [];
    // n 이전의 원소를 담을 배열을 선언한다
    
    for(let i = 0; i < num_list.length; i++) {
        if(i >= n) {
            after.push(num_list[i]);
        } // 인덱스가 n과 같거나 크다면 after에 넣어준다
        else {
            before.push(num_list[i]);
        } // 인덱스가 n보다 작다면 before에 넣어준다
    }
    after = after.concat(before);
    // after에 before를 붙여준다

    return after;
}
