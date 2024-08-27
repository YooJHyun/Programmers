class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        // answer에 각 모서리별 값을 곱해야 하므로 1을 넣어준다		
		for(int i = 0; i < box.length; i++) {
			answer *= (box[i] / n);
		} // box의 모서리별 n크키의 상자가 들어가는 수만큼 곱해준다
        return answer;
    }
}