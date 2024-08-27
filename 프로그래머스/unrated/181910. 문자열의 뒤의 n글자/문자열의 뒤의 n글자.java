class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int tmp = my_string.length() - n;
        answer = my_string.substring(tmp);
        // my_string의 전체 길이에서 n을 뺀값 만큼 출력해야
        // 전체 문자열의 뒷 n글자이므로 새로운 변수로 선언하여
        // 출력한다
        return answer;
    }
}