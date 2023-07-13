class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        String[] arr1 = str1.split("");
		String[] arr2 = str2.split("");
		// 각 문자열을 배열로 변환한다
        
		for(int i = 0; i < arr1.length; i++) {
			answer += arr1[i];
			answer += arr2[i];
		} // answer에 두 문자열의 원소를 한번씩 누적합산한다
        return answer;
    }
}