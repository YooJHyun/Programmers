class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter,"");
        // 기존 문자열에서 letter를 찾아 ""으로 대체한다
        return answer;
    }
}