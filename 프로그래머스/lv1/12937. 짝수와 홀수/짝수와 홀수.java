class Solution {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0) {
			answer = "Even";
		} // num이 짝수라면 Even을 answer에 넣어주고
		else {
			answer = "Odd";
		} // 홀수라면 Odd를 넣어준다
        return answer;
    }
}