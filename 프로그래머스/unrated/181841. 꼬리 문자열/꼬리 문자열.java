class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].contains(ex)) {
                continue;
            } // str_list의 원소가 ex를 포함하면 지나가고,
            else {
                answer += str_list[i];
            } // 포함하지 않는 경우 answer에 저장한다
        }
        return answer;
    }
}