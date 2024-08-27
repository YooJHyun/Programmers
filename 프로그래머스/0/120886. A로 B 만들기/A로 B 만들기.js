function solution(before, after) {
    let answer = 0;
    
    let a = after.split('');
    let b = before.split('');
    // 문자열을 배열로 변환
    
    a.sort();
    b.sort();
    // 배열 정렬
    
    let aa = a.join('');
    let bb = b.join('');
    // 정렬된 배열을 다시 문자열로 변환
    
    if (aa === bb) {
        answer = 1;
    } // 정렬된 문자열을 비교하여 같다면 answer에 1을 할당
    
    return answer;
}
