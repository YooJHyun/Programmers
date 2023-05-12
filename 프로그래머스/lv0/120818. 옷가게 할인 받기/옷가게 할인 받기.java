class Solution {
    public int solution(int price) {
        double answer = 0;
        if (price >= 500000 ) {
			answer = (price * 0.8);
		}   // 50만원 이상 20% 할인 적용
		else if (price >= 300000 ) {
			answer = (price * 0.9);
		}   // 30만원 이상 10% 할인 적용
		else if (price >= 100000) {
			answer = (price * 0.95);
		}   // 10만원 이상 5% 할인 적용
		else {
			answer = price;
		}   // 10만원 이하는 할인 적용 없음
        return (int) answer;
        // 제한사항이 소수점 이하를 버린 정수이므로 int 형변환하여 리턴한다
    }
}