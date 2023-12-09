import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr);
        // 문자열을 배열로 변경 후 정렬한다
        
        for(int i = 0; i < arr.length; i++) {
            int tmp = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                    tmp++;
                } // 이중 for문을 이용하여 동일한 글자가 발견되면 tmp를 증가시켜 세어준다
            }
            if(tmp == 1) {
                answer += arr[i];
            } // 만약 이 tmp가 한번인 경우 i, j인덱스가 한번만 만났기 때문에 해당 원소는 한번만 등장한다
        }
        return answer;
    }
}