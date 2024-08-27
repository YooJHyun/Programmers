class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

		int mlen = my_string.length();	
        int olen = overwrite_string.length();
        // 각 문자열의 길이를 구한다
        
        String frontsub = my_string.substring(0, s);
        // 겹쳐쓰기 전 my_string의 구간만큼 자른다
        String backsub = my_string.substring((s + olen), mlen);
        // 겹쳐쓴 뒤부터 my_string의 구간만큼 자른다
        
        answer = answer + frontsub + overwrite_string + backsub;
        // 앞서 잘라둔 구간 사이에 겹쳐쓸 문자열을 더한다
        return answer;
    }
}