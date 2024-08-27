import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (!str.contains("ad")) {
                answer.add(str);
            } // str에 strArr의 원소를 대입하고 ad를 포함하지 않는 경우
              // answer에 대입하고 이를 반복한다
        }
        return answer.toArray(new String[0]);
        // answer를 다시 문자열로 반환한다
    }
}