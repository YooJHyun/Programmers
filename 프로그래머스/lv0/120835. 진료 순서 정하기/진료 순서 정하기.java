class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
		// answer는 emergency와 동일한 길이로 설정한다
        
		for(int i = 0; i < emergency.length; i++) {
			for(int j = 0; j < emergency.length; j++) {
				if(emergency[i] <= emergency[j]) {
					answer[i] += 1;
				} // emergency의 인덱스를 비교하여 더 큰값이면
                  // 작은 값의 인덱스에 해당하는 원소에 1씩 더한다
			}
		}
        return answer;
    }
}