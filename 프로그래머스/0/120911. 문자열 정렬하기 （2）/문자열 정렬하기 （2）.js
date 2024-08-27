function solution(myString) {
    
    const lowerCaseString = myString.toLowerCase();
    // 문자열을 모두 소문자로 변환
    
    const sortedArray = lowerCaseString.split('').sort();
    // 문자열을 배열로 변환한 후 정렬
    
    const answer = sortedArray.join('');
    // 배열을 다시 문자열로 합치기
    return answer;
}
