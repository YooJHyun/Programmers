class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int tmp = 1;
        // 덧셈용 변수 answer와 곱셈용 변수 tmp를 선언한다
        for(int i = 0; i < num_list.length; i++ ) {
			if(num_list.length >= 11) {
				answer += num_list[i];
			}   // 리스트의 길이가 11이상이면 answer에 원소들을 더해준다
			else {
				tmp *= num_list[i];
                answer = tmp;
                // 리스트의 길이가 10이하이면 answer에 원소들을 곱해준다
			}
		}
        return answer;
    }
}