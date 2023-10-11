class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while(num > 1) {
        // num이 1보다 큰 경우 반복한다
			if(num % 2 == 0) {
            // num가 짝수인 경우
				num /= 2;
				answer++;
                // 2로 나누고 작업 횟수를 카운트한다
			}
			else {
            // num이 홀수인 경우
				num = num * 3 + 1;
				answer++;
                // 3을 곱한뒤 1을 더하고 작업 횟수를 카운트한다
			}
		}
        if(answer >= 500) {
            answer = -1;
        } // answer가 500번 이상 반복시에도 1이 되지 않는 경우 -1을 반환한다
        return answer;
    }
}