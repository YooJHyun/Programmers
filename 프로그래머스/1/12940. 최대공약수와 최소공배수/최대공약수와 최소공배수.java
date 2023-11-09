class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
	
        for(int i = 1; i < 1000000; i++) {
			if(n % i == 0 && m % i == 0) {
				answer[0] = i;
                // n과 i를 나누는 가장 작은 수가 최대공약수이므로 answer[0]에 넣어주고,
                answer[1] = (n * m) / i;
                // n과 m의 곱을 최대공약수로 나누면 최소공배수이므로 answer[1]에 넣어준다
			}
		}
        return answer;
    }
}