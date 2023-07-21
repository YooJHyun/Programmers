class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1 && i >= idx) {
				answer = i;
				break;
			} // arr의 i번째 원소가 1이며 i가 idx보다 큰 경우 answer에 i를 넣어준다
			else {
				answer = -1;
			} // 해당 조건의 인덱스가 없다면 -1을 넣어준다
		}
        return answer;
    }
}