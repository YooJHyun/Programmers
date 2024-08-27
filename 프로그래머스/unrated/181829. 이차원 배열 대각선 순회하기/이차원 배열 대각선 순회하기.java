class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(i + j <= k) { 
                // 만약 i + j <= k일때
					answer += board[i][j];
				}  // answer에 조건을 만족하는 모든 board[i][j]의 값을 누적합산한다
			}
		}
        return answer;
    }
}