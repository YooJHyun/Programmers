import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
            // answer에 arr의 원소를 담아준다
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]) {
                    answer.remove(Integer.valueOf(arr[i]));
                } // arr의 원소와 delete_list의 원소가 같다면
                  // answer에서 지운다
            }
        }
        return answer;
    }
}