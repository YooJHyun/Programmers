class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char tmp;
		
		if(s.length() != 4 && s.length() != 6) {
			answer = false;
            // s의 길이가 4 혹은 6이 아닐시 false를 리턴하고
		}
		
		for(int i = 0; i < s.length(); i++) {
			tmp = s.charAt(i);
		    // char 변수인 tmp에 s를 넣어 한글자씩 판별하고
            
			if(Character.isDigit(tmp) == false) {
				answer = false;
			} // tmp가 숫자가 아니라면 false를 리턴한다
		}
        return answer;
    }
}