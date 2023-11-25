class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
		// answer의 길이는 start_num와 end_num의 차이에 1을 더한다
        int j = 0;
		for(int i = start_num; i >= end_num; i--) {
			answer[j] += i;
			j++;
		} // answer에 차례대로 내림차순으로 넣어준다
        return answer;
    }
}