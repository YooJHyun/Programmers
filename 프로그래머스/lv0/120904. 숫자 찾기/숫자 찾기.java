class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String nums = Integer.toString(num);
		String[] arr = nums.split("");
        // num을 문자열, 배열로 차례대로 변환한다
		String k_string = Integer.toString(k);
        // 문자열 비교를 위해 k도 문자열로 변환한다
		for(int i = 0; i < arr.length; i++) { 
			if(arr[i].equals(k_string)) { 
				answer = i + 1;
				break; 
			} // arr의 i번째 원소가 k_string과 동일하면 
              // 인덱스 번호를 answer에 넣고 break문을 통해 빠져나간다
			else if (!arr[i].equals(k_string)) {
				answer = -1;
			} // arr의 모든 원소가 k_string과 동일하지 않을 시
              // answer에 -1을 넣어준다
		}
        
        return answer;
    }
}