class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        boolean yorn = str1.contains(str2);
        // str2가 str1에 포함되는지 판별하는 변수 선언
        if (yorn == true) {
            answer = 1;
        }   // 포함한다면 1 반환
        else {
            answer = 2;
        }   // 포함하지 않는다면 2 반환
        return answer;
    }
}