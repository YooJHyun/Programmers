class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0] * numbers[1];
		// answer에 numbers의 원소 중 임의의 수 두개를 곱한 값을 넣어둔다
        
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] * numbers[i] > answer) {
                // 만약 i와 j번째 원소의 곱이 기존 answer보다 크다면
					answer = numbers[j] * numbers[i];
                    // answer의 값은 i와 j번째 원소의 값을 넣어준다
				}
			}
		}
        return answer;
    }
}