class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1sum = 0;
		int arr2sum = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			arr1sum += arr1[i];
		} // arr1의 원소 총합을 변수에 넣어준다
		for(int i = 0; i < arr2.length; i++) {
			arr2sum += arr2[i];
		} // arr2의 원소 총합을 변수에 넣어준다
		
		if(arr1.length > arr2.length) {
			answer = 1;
		} // 만약 arr1의 길이가 더 길다면 1 반환
		else if(arr1.length < arr2.length) {
			answer = -1;
		} // 만약 arr2의 길이가 더 길다면 -1 반환
		else {
         // 두 arr의 길이가 같다면
			if(arr1sum > arr2sum) {
				answer = 1;
			} // arr1의 원소 총합이 더 크다면 1을 반환
			else if(arr1sum < arr2sum) {
				answer = -1;
			} // arr2의 원소 총합이 더 크다면 -1을 반환
			else {
				answer = 0;
                // 두 배열의 합이 같다면 0을 
			}
		}
        return answer;
    }
}