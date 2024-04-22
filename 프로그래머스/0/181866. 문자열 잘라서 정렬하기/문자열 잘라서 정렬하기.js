function solution(myString) {
    const arr = myString.split('x');
    // 문자열을 'x'를 기준으로 배열로 분할
    
    arr.sort();
    // 배열을 정렬
    
    const list = arr.filter(str => str !== '');
    // 빈 문자열이 아닌 원소만 새로운 배열에 추가
    return list;
}
