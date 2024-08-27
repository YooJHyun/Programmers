class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int fac = 1;
        // 누적 곱을 위한 항등원을 넣은 fac을 선언한다
        
		for(int i = 1; i <= n; i++) {
			fac *= i;
            // fac에 정수의 곱을 누적하고
			if (fac > n) {
				answer += (i - 1);
				break;
			} // 정수 누적곱이 n보다 크다면 누적된 곱의 -1을 answer에 넣는다
            else if (fac == n) {
                answer += i;
                break;
            } // 정수 누적곱이 n과 같다면 i를 answer에 넣는다
        }
        return answer;
    }
}