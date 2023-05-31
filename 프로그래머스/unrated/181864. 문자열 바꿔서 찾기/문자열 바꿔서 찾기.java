class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String change ="";
        // A와 B를 바꿔줄 변수를 선언한다
        for(int i = 0; i < myString.length(); i++) {
            if("A".equals(myString.substring(i, i+1))) {
                change += "B";
            }   // 만약 for문의 i번째 (실제 원소의 자리는 i+1)가 A이면 B를 넣어주고
            else {
                change += "A";
            }   // 아니라면 A를 그대로 넣어준다
        }
        
        if(change.contains(pat)) {
            answer = 1;
        }   // A와 B를 바꾼 변수에서 pat가 포함되어있으면 1을 반환하고
        else {
            answer = 0;
        }   // 포함되지 않았다면 0을 반환한다
        return answer;
    }
}