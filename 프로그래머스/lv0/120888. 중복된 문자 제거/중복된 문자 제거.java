class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.indexOf(my_string.charAt(i)) == i) {
                answer += my_string.charAt(i);
                // my_string의 인덱스가 i와 일치하면 anwer에 더해주고
                // 일치하지 않으면 더하지 않는다
            }
        }
        return answer;
    }
}