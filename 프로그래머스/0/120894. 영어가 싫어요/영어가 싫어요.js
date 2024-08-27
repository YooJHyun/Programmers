function solution(numbers) {
    var answer = 0;
    
    let change1 = numbers.replace(/one/g, "1");
    let change2 = change1.replace(/two/g, "2");
    let change3 = change2.replace(/three/g, "3");
    let change4 = change3.replace(/four/g, "4");
    let change5 = change4.replace(/five/g, "5");
    let change6 = change5.replace(/six/g, "6");
    let change7 = change6.replace(/seven/g, "7");
    let change8 = change7.replace(/eight/g, "8");
    let change9 = change8.replace(/nine/g, "9");
    let change10 = change9.replace(/zero/g, "0");
    // 영문 숫자를 숫자로 변환해준다
    answer = parseInt(change10, 10);
    // 변환한 숫자는 문자열 형태이므로 정수로 변환한다
    return answer;
}
