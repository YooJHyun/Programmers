class Solution {
    public String solution(String my_string, String alp) {
        String answer = my_string.replaceAll(alp, alp.toUpperCase());
        // 기존 my_string이 소문자로 이루어져 있으므로 alp만 uppercaser를 이용해
        // 대문자로 변환해준다
        return answer;
    }
}