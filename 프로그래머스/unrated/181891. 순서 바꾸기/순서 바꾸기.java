import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> after = new ArrayList<>();
        // n과 n 이후의 원소를 담을 list를 선언한다
		List<Integer> before = new ArrayList<>();
        // n 이전의 원소를 담을 list를 선언한다
        
		for(int i = 0; i < num_list.length; i++) {
			if(i >= n) {
				after.add(num_list[i]);
			} // 인덱스가 n과 같거나 크다면 after에 넣어준다
			else {
				before.add(num_list[i]);
			} // 인덱스가 n보다 작다면 before에 넣어준다
		}
		after.addAll(before);
        // after에 before을 붙여준다
		int[] answer = new int[after.size()];
		for (int i = 0 ; i < after.size(); i++) {
            answer[i] = after.get(i).intValue();
        } // answer에 after를 배열로 변환하여 넣어준다
        return answer;
    }
}