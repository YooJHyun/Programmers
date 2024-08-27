class Solution {
    public String solution(String myString) {
        String answer = myString.replaceAll("[abcdefghijk]", "l");
        // myString의 a부터 k를 l로 바꾼다
        return answer;
    }
}