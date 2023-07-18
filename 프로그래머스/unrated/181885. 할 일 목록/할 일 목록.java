import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length;i++) {
            if(finished[i] == false) {
                answer.add(todo_list[i]);
            } // todo_list와 fimished의 동일 인덱스가 false라면            
        }     // list에 todo_list의 해당 인덱스 원소를 추가한다
        return answer;
    }
}