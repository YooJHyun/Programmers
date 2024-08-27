class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x",  -1);
        // myString을 배열로 변환한다
		int[] answer = new int[arr.length];
        // answer는 x를 기준으로 변환된 arr과 동일한 크기로 설정한다
        
		for(int i = 0; i < arr.length; i++) {
			answer[i] += arr[i].length();
		} // answer에 arr의 원소 길이를 넣어준다
        return answer;
    }
}