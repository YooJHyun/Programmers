class Solution {
    public String solution(String my_string) {
        String answer = "";
        
		answer += my_string.replaceAll("[aeiou]", "");
		// my_string에서 모음 발견시 해당 원소를 제거한다
        return answer;
    }
}