import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(String my_string) {
        String[] my_arr = my_string.split(" ");
        // my_string을 배열로 변환한다
        List<String> answer = new ArrayList<>();
        // 공백을 제외한 값을 넣어줄 list를 선언한다
        
        for(int i = 0; i < my_arr.length;i++){
            if(!my_arr[i].equals("")){
                answer.add(my_arr[i]);
            } // my_arr의 원소에서 공백이 아니라면
        }     // answer에 그 값을 넣는다
        return answer;
    }
}