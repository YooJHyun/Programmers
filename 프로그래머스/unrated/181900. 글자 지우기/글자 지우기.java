class Solution {
    public String solution(String my_string, int[] indices) {
		String answer = "";

		String[] arr = my_string.split("");
        // my_string을 배열로 변환한다
        
		for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = "";
        }   // indices의 각 원소의 자리를 빈값으로 바꾼다

        for (int i = 0; i < arr.length; i++) {
            String add = arr[i];
            answer += add;
        } // arr의 원소를 누적 합산한다
	
        return answer;
    }
}