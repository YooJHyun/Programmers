class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        // answer의 길이는 strlist의 길이와 동일하게 설정한다
        
        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        } // answer의 원소에 strlist의 원소별 길이를 넣어준다
        return answer;
    }
}