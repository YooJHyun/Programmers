class Solution {
    public String solution(String my_string) {
        String answer5 = my_string.replace("a", "");
        String answer4 = answer5.replace("e", "");
        String answer3 = answer4.replace("i", "");
        String answer2 = answer3.replace("o", "");
        String answer = answer2.replace("u", "");
        // 순서대로 my_string에서 모음을 제거한다
        return answer;
    }
}