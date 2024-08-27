class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
		
		for(int i = 0; i < code.length(); i++) {
			if(code.charAt(i) == '1' && mode == 0) {
				mode = 1;
			} // code[i]가 1이고 mode가 0이면 모드를 1로 변경한다
			else if(code.charAt(i) == '1' && mode == 1) {
				mode = 0;
			} // code[i]가 1이고 mode가 1이면 0으로 변경한다
			
			if(mode == 0) {
				if(code.charAt(i) != '1' && i % 2 == 0) {
					answer += code.charAt(i);
				} // mode가 0일때, 1이 아니고 짝수이면 뒤에 추가한다
			}	
			else if(mode == 1) {
				if(code.charAt(i) != '1' && i % 2 != 0) {
					answer += code.charAt(i);
				} // mode가 1일때, 1이 아니고 홀수이면 뒤에 추가한다
			}
		}
		if(answer.isEmpty()) {
			answer += "EMPTY";
		} // answer가 비어있을 경우 EMPTY를 넣어준다
        return answer;
    }
}