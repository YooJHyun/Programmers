class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        // 대소문자를 변환한 배열을 넣을 answer를 선언한다
        for(int i = 0; i < answer.length; i++) {
            if(i % 2 != 0) {
                answer[i] = strArr[i].toUpperCase();
            } // 짝수번째 인덱스는 대문자로 바꾸고,
            else {
                answer[i] = strArr[i].toLowerCase();
            } // 홀수번째 인덱스는 소문자로 바꾼다
        }
        return answer;
    }
}