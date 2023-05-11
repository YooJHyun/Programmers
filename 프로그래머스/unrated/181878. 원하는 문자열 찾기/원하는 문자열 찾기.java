class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myString_confix = myString.toLowerCase();
        String pat_confix = pat.toLowerCase();
        // 대소문자 구별을 없애기 위해 소문자로 통일
        boolean yorn = myString_confix.contains(pat_confix);
        if ( yorn == true) {
            answer = 1;
        }   // contains 사용해서 포함되는지 확인하여 포함되면 1 반환
        else {
            answer = 0;
        }
        return answer;
    }
}