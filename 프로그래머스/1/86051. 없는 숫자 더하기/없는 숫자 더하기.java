class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int tmp = 0;
        
		for(int i = 0; i < numbers.length; i++) {
			tmp += numbers[i];
            // tmp에 존재하는 수를 모두 더한다
		}
        answer = 45 - tmp;
        // 0부터 9까지 모두 더하면 45이므로 45에서 tmp를 뺀다
        return answer;
    }
}