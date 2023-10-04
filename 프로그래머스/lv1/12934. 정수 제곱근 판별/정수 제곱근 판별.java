class Solution {
    public long solution(long n) {
        long answer = -1;
		// 양의 정수 x의 제곱이 아닌 경우 -1을 리턴한다
        
		for(long i = 0; i * i <= n; i++) {
			if(i * i == n) {
				answer = ((i + 1) * (i + 1));
			} // 양의 정수 i의 제곱이 n인 경우 i + 1의 제곱을 answer에 넣는다
            else if (i * i > n) {
				break;
			} // 이때 i의 제곱이 n보다 큰 경우 break문으로 for문을 빠져나간다
		}
        return answer;
    }
}