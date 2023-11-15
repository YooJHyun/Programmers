class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

		for(int i = 1; i <= count; i++) {
			answer += (price * i);
		} // answer에 count 횟수만큼 price의 n번에 해당하는 값을 더해준다
		
		answer -= money;
        // answer에서 가지고 있는 money를 빼준다
        
        if(answer < 0) {
            answer = 0;
        } // 만약 금액이 부족하지 않으면 0을 반환한다
        return answer;
    }
}