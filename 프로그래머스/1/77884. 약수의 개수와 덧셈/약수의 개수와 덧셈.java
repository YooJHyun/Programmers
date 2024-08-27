class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        int count = 0;
        // 약수의 갯수를 세는 변수 count를 선언한다
		for(int i = left; i <= right; i++) {
        // left부터 right까지 진행하는 for문
			for(int j = 1; j <= i; j++) {
            // i의 약수를 확인하는 for문
				if(i % j == 0) {
					count++;
				} // j가 i의 약수일때 count로 약수의 총 갯수를 확인한다
			}
			if(count % 2 == 0) {
				answer += i;
			} // 만약 약수의 갯수가 짝수라면 answer에 해당 i를 더해주고
			else {
				answer -= i;
			} // 약수의 갯수가 홀수라면 answer에 해당 i를 뺀다
			count = 0;
            // 위 연산이 완료되면 다음 i의 약수 갯수를 확인해야 하므로 0으로 초기화한다
		}  
        return answer;
    }
}