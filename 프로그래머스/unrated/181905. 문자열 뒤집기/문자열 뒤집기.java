class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String front = my_string.substring(0, s);
		answer += front;
        // front에는 s이전의 문자열을 잘라서 넣는다
        
		String middle = my_string.substring(s, e + 1);
		for(int i = middle.length() - 1; i >= 0; i--) {
			answer += middle.charAt(i);
		} // middle에는 s와 e 사이의 문자열을 잘라 반복문을 이용해 반대로 넣어준다
        
		String back = my_string.substring(e + 1);
		answer += back;
        // back에는 나머지 문자열을 잘라서 넣는다
        
        return answer;
    }
}