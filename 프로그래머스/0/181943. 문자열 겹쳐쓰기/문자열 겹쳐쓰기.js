function solution(my_string, overwrite_string, s) {
    var answer = '';
    
    let mlen = my_string.length;
    let olen = overwrite_string.length;
    // 각 문자열의 길이를 구한다
    
    let frontsub = my_string.substring(0, s);
    // 겹쳐쓰기 전 my_string의 구간만큼 자른다
    let backsub = my_string.substring(s + olen, mlen);
    // 겹쳐쓴 뒤부터 my_string의 구간만큼 자른다
    
    answer = frontsub + overwrite_string + backsub;
    // 앞서 잘라둔 구간 사이에 겹쳐쓸 문자열을 더한다
    return answer;
}