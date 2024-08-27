import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
		String to_arr = my_string.toLowerCase();
        // my_string을 모두 소문자로 바꾼다
        
		String[] arr = to_arr.split("");
		Arrays.sort(arr);
        // my_string을 배열로 변환하고 정렬한다
        
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		} // answer에 arr을 순서대로 넣어 문자열로 바꾼다
        return answer;
    }
}