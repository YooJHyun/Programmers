import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
		// answer의 길이는 5칸으로 선언한다
		Arrays.sort(num_list);
        // num_list를 정렬한다
        
        for(int i = 0; i < num_list.length; i++) {
            if(i < 5) {
				answer[i] += num_list[i];
            } // i가 5보다 작을 때 answer에 num_list를 넣어준다
		}
        return answer;
    }
}