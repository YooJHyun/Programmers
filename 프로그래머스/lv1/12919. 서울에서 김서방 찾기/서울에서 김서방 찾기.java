class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer += "김서방은 " + i + "에 있다";
			} // seoul의 i번째 원소가 Kim과 같으면 answer에 i를 입력한다
		}
        return answer;
    }
}