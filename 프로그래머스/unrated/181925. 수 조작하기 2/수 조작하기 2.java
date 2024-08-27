class Solution {
    public String solution(int[] numLog) {
        String answer = "";

		for(int i = 1; i < numLog.length; i++) {
            if(numLog[i] - numLog[i - 1] == 1) {
				answer += "w"; 
			} // numLog의 인덱스 i와 그 앞의 인덱스 값의 차이가 1이면 answer에 w를
			else if(numLog[i] - numLog[i - 1] == -1) {
				answer += "s";
			} // -1이면 s를 넣어준다
			else if(numLog[i] - numLog[i - 1] == 10) {
				answer += "d";
			} // 값의 차이가 10이면 d를
			else {
				answer += "a";
			} // -10인 경우 a를 넣어준다
		}
        return answer;
    }
}