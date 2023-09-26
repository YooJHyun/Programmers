class Solution {
    public int[] solution(long n) {
		String len = Long.toString(n);
        // n을 문자열로 변환한다
		
		String[] arr = len.split("");
        // 변환된 문자열을 배열로 나눈다
		
        String tmp = "";
        
		for (int i = arr.length -1; i >= 0; i--) {
	    	tmp += arr[i];
	    } // tmp에 역 순서로 넣는다
        
		int[] answer = new int[tmp.length()];
	      
		for(int i = 0; i < tmp.length(); i++) {
			answer[i] = tmp.charAt(i) - '0';			
		} // 기존의 역 순서화시킨 tmp를 int[]로 변환한다
        return answer;
    }
}