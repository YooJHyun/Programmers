class Solution {
    public String solution(String n_str) {
        int str = Integer.parseInt(n_str);
        // n_str을 int로 변환하여 앞의 0을 사라지게 한다
        String answer = Integer.toString(str);
        // str을 다시 문자열로 변환한다
        return answer;
    }
}