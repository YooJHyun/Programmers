class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.toLowerCase();
        // my_string을 toLowercase를 이용하여 소문자와 자연수로만 변환한다
		my_string = my_string.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
        // my_string의 소문자를 ""으로 대체하여 자연수만 남긴다
		String[] arr = my_string.split("");
		// my_string을 arr로 변환한다
        
		for(int i = 0; i < arr.length; i++) {
			answer += Integer.parseInt(arr[i]);
		    // for문을 이용하여 answer에 my_string의 자연수 합을 넣어준다
        }
        return answer;
    }
}