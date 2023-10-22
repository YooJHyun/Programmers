class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0) {
			answer = s.substring((s.length() / 2) - 1, (s.length() / 2) + 1); 
		}   // s의 길이가 짝수인 경우 s의 길이 절반의 앞과 뒤를 함께 가져온다
		else {
			answer = s.substring(s.length() / 2, (s.length() / 2) + 1);
		}   // s의 길이가 홀수인 경우 s의 길이 절반, 즉 가운데 글자를 가져온다
        return answer;
    }
}