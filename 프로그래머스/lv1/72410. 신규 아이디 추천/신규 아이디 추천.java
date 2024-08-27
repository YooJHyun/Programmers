class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        new_id = new_id.toLowerCase();
        // LowerCase를 사용하여 소문자로 변환한다
        
		String filter = "abcdefghijklmnopqrstuvwxyz0123456789-_.";
		// 사용가능한 문자를 담은 변수를 선언한다
        
		for(int i = 0; i < new_id.length(); i++) {
			String ch = new_id.charAt(i) + "";
			if (filter.contains(ch)) { 
				answer += ch;
			}
		}
        // 앞서 선언한 필터 변수가 ch변수에 포함되어있으면 answer에 담는다
		while(answer.contains("..")) {
			answer = answer.replace("..", ".");
		}
        // 마침표의 2번 이상 반복은 .. 이 계속 포함되므로 이를 .으로 대체한다
        
		if(answer.startsWith(".")) {
			answer = answer.substring(1);
		}
		if(answer.endsWith(".")) {
			answer = answer.substring(0, answer.length() - 1);
		}
        // 마침표로 시작하거나 끝나는 경우 해당 마침표의 순서를 제거한다
        
		if(answer.equals("")) {
			answer = "a";
		}
        // answer가 비어있다면 a를 삽입한다
        
		if(answer.length() >= 16) {
			answer = answer.substring(0, 15);
        }
		if (answer.endsWith(".")) {
			answer = answer.substring(0, answer.length() - 1);
		}
        // answer가 16자 이상이면 15개로 줄이고 .으로 끝나면 이를 제거한다

		while(answer.length() <= 2) {
			answer += answer.substring(answer.length() - 1);
		}
        // answer의 길이가 2이하라면 마지막 문자를 한번 더 붙여준다
        
        return answer;
    }
}