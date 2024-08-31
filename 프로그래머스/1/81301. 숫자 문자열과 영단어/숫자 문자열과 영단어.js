function solution(s) {
    var answer = 0;
    
    let s1 = s.replace(/zero/g, "0");
    let s2 = s1.replace(/one/g, "1");
    let s3 = s2.replace(/two/g, "2");
    let s4 = s3.replace(/three/g, "3");
    let s5 = s4.replace(/four/g, "4");
    let s6 = s5.replace(/five/g, "5");
    let s7 = s6.replace(/six/g, "6");
    let s8 = s7.replace(/seven/g, "7");
    let s9 = s8.replace(/eight/g, "8");
    let s10 = s9.replace(/nine/g, "9");
    // 0부터 9까지의 문자을 숫자 형태의 문자로 변경한다
    
    answer = parseInt(s10, 10);
    // 변경된 문자열을 숫자로 변환한다
    
    return answer;
}
