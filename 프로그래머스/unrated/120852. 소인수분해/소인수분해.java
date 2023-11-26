import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        // 소인수를 담아줄 list를 선언한다
        
		for(int i = 2; i <= n; i++) {
			while(n % i == 0) {
            // i가 n의 약수인 경우 반복한다
				if(!list.contains(i)) {
					list.add(i);
				} // list에 i가 없다면 list에 추가하고
				n /= i;
			} // 실제로 나눠준뒤 반복한다
		}     
       
		int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        } // list를 배열로 변환해준다
        return answer;
    }
}