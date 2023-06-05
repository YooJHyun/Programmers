class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        for (int i = 0; i < dot.length; i++) {			
			if(dot[0] > 0) {
            // dot[0]가 양수일시
				if(dot[1] > 0) {
					answer = 1;
				} // dot[1]이 양수이면 1사분면
				else {
					answer = 4;
				} // dot[1]이 음수이면 4사분면
			}
			else {
            // dot[0]가 음수일시
				if(dot[1] > 0) {
					answer = 2;
				} // dot[1]이 양수이면 2사분면
				else {
					answer = 3;
				} // dot[1]이 음수이면 3사분면
			}
		}
        return answer;
    }
}