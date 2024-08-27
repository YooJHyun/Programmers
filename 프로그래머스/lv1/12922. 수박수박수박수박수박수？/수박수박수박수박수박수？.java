class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				answer += "박";
			} // n까지 수와 박을 반복할때, 짝수번째는 박을 넣어주고 
			else {
				answer += "수";
			} // 홀수번째는 수를 넣어준다
		}
        return answer;
    }
}