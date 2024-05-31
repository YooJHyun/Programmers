function solution(phone_number) {
    let answer = "";
    
    for (let i = 0; i < phone_number.length - 4; i++) {
        answer += "*";
    }
    // phone_number의 뒷 4자리를 제외한 자리는 *을 넣어주고
    answer += phone_number.substring(phone_number.length - 4);
    // 뒷 4자리를 기존 phone_number에서 가져와서 붙여준다
    return answer;
}
