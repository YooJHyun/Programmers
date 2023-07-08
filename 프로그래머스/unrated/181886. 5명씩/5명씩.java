import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        // 5명 그룹의 선두 인원의 이름을 받을 list를 만든다
        for (int i = 0; i < names.length; i+=5) {
          list.add(names[i]);
        } // 0번째 부터 그 뒤 5번째씩의 사람을 list에 추가한다
        
        String[] answer = list.toArray(new String[0]);
        // list를 배열로 변환해준다
        return answer;
    }
}