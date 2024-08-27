import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                answer.add(arr[i]);
            } // i는 arr의 index이고 길이만큼 for문이 반복된다
              // j는 arr의 i번째 원소만큼 추가된다
        }
        return answer;
    }
}
