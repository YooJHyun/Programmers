class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        boolean yorn = my_string.startsWith(is_prefix);
		// my_string이 is_prefix로 시작하는지 판별하는 변수를 선언한다
		if(yorn == true) {
			answer = 1;
		}   // 참이라면 1,
		else {
			answer = 0;
		}   // 거짓이면 1을 받는다
        return answer;
    }
}