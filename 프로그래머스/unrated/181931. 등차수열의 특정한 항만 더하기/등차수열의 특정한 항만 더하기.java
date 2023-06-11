class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i = 0; i < included.length; i++) {
			if(included[i] == true) {
				answer += a + (d * i);
			} // included의 원소 값이 true일시 answer에 등차 수열의 값을 더해준다
		}
        return answer;
    }
}