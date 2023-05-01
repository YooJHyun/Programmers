class Solution {
    public String solution(String my_string, int k) {
		String answer = my_string;
        // 변수 answer에 문자열을 넣어 첫번째 순번을 삽입한다
	    for(int i = 1; i < k; i++) {
	    	if(i < k ) {
	    		answer += my_string;
	    	}	// answer에 문자열을 삽입한다
	    }  // answer를 선언할때 문자열이 한번 삽입되었으므로 
        // i = k 횟수를 한번 차감하여 문자열을 곱할 수 있게 한다.
	    return answer;
	}
}