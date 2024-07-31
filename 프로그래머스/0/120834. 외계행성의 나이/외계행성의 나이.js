function solution(age) {
    var answer = '';
    let ageString = age.toString();
    let arr = ageString.split("");
    // age를 문자열, 배열로 순차 변환한다
    
    for(let i = 0; i < arr.length; i++) {
        if(arr[i] === "0") {
            answer += "a";
        } // arr의 i번째 원소가 0과 같으면 a를 넣어 준다
        else if(arr[i] === "1") {
            answer += "b";
        } // 이하 동일한 방법으로 누적시킨다
        else if(arr[i] === "2") {
            answer += "c";
        }
        else if(arr[i] === "3") {
            answer += "d";
        }
        else if(arr[i] === "4") {
            answer += "e";
        }
        else if(arr[i] === "5") {
            answer += "f";
        }
        else if(arr[i] === "6") {
            answer += "g";
        }
        else if(arr[i] === "7") {
            answer += "h";
        }
        else if(arr[i] === "8") {
            answer += "i";
        }
        else if(arr[i] === "9") {
            answer += "j";
        }
    }
    return answer;
}