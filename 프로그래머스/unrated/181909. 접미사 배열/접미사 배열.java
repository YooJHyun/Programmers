import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        // answer의 길이는 my_string의 길이와 동일하게 선언한다
       
        for(int i = 0; i < answer.length; i++) {
            answer[i] = my_string.substring(i);
        } // i가 증가하면서 i번째부터 마지막 문자까지 answer에 만들어진다

        Arrays.sort(answer);
        // answer를 정렬한다
        
        return answer;
    }
}