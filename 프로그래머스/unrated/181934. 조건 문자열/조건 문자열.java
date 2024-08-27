class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(ineq.equals("<")) {
        // ineq가 <인 경우
			 if(eq.equals("=")) {
             // eq가 = 인경우
				 if(n - m > 0) {
					 answer = 0;
				 } 
				 else {
					 answer = 1;
				 }
			 }
			 else {
             // eq가 ! 인경우
				 if(n - m < 0) {
					 answer = 1;
				 }
				 else {
					 answer = 0;
				 }
			 }
		}
		else {
        // ineq가 >인 경우
			if(eq.equals("=")) {
            // eq가 = 인경우
				if(n - m >= 0) {
					answer = 1;
				}
				else {
					answer = 0;
				}
			}
			else {
            // eq가 ! 인경우
				if(n - m > 0) {
					answer = 1;
				}
                else if(n - m == 0) {
                    answer = 0;
                }
				else {
					answer = 0;
				}
			}
		}
        return answer;
    }
}