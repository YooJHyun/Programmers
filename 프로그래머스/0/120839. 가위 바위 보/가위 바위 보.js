function solution(rsp) {
    let answer = "";

    for (let i = 0; i < rsp.length; i++) {
        if (rsp.charAt(i) === "2") {
            answer += "0";
        } // rsp를 쪼개어 2와 같으면 answer에 0을 넣고 
        else if (rsp.charAt(i) === "5") {
            answer += "2";
        } // 5와 같으면 2를,
        else {
            answer += "5";
        } // 2와 같다면 5를 넣어 주어진 rsp를 이기는 문자열을 만들어준다
    }
    return answer;
}
