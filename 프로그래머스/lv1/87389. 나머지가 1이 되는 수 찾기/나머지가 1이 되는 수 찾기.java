class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i < n; i++) {
			if(n % i == 1) {
				answer = i;
                break;
			} // n을 i로 나눈 값이 answer가 되고 i를 1부터 시작함으로서 
		}     // 최솟값이 대입된 후 break문을 통해 빠져나간다
        return answer;
    }
}