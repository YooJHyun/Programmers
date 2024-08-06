function solution(my_string) {
    // my_string에서 숫자만 추출하고 배열로 변환
    let arr = my_string.replace(/[^0-9]/g, "").split("");
    // 숫자 배열을 정렬
    arr.sort();
    // 정수 배열로 변환
    let answer = arr.map(num => parseInt(num));
    return answer;
}
