import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        // string을 배열로 변환한다
        
        Arrays.sort(arr, Collections.reverseOrder());
        // 배열을 역정렬한다
        
        for (int i = 0; i < arr.length; i++) {
            String tmp = arr[i];
            answer += tmp;
        } // 역정렬한 배열의 원소를 answer에 누적합산한다
        
        return answer;
    }
}