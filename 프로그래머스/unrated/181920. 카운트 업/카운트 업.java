class Solution {
    public int[] solution(int start_num, int end_num) {
		int[] answer = new int[end_num - start_num + 1];
        // answer의 길이를 정한다
		int j = 0;
        
		for(int i = start_num; i <= end_num; i++) {
			answer[j] += i;
			j++;
		} // answer에 시작 숫자부터 종료 숫자까지 넣어준다
        return answer;
    }
}