class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        boolean yorn = str2.contains(str1);
        // str2에 str1이 포함되는지 판단하는 yorn를 선언
        if (yorn == true) {
            answer = 1;
        }   // 포함되어 있으면 1 반환
        else {
            answer = 0;
        }   // 불포함시 0 반환
        return answer;
    }
}