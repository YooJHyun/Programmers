class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        boolean torf = my_string.contains(target);
        // my_string에 target이 포함되는지를 boolean 타입으로 선언한 torf에서 판별하고
        if (torf == true) {
            answer = 1;
        }   // 만약 torf가 true이면 1을,
        else {
            answer = 0;
        }   // torf가 false면 0을 반환받는다
        return answer;
    }
}