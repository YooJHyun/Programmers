class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            answer += (num_str.charAt(i) - 48);
        }   // 문자열의 한글자씩 빼내 -48로 숫자로 변환(아스키 코드 이용)해서 더해준다
        return answer;
    }
}