class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}   // 배열의 앞부터 answer에 계속 넣어주고 반환한다
        return answer;
    }
}