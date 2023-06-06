class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        // 문자열을 배열로 변환한다
		for(int i = 0; i < arr.length; i++) {
        // my_string의 원소를 0부터 세어주고,
			for(int j = 0; j < n; j++) {
            // 이를 n번째까지 반복한다
				answer += arr[i]; 
                // 반복된 값은 answer에 저장된다
			}         
        }
        return answer;
    }
}