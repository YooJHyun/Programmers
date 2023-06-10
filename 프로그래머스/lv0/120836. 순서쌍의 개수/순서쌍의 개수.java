class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer++;
			// n의 순서쌍을 구성하는 i를 세어준다
            }
		}
        
        return answer;
    }
}