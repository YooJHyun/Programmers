class Solution {
    public int solution(int n, int k) {
        int answer;
        int sale = (n / 10);
        // 서비스로 받을 음료수의 갯수를 파악하는 변수 생성
		if (sale >= 1) {
			answer = ((12000 * n) + (2000 * (k-sale)));
		} 
		else {
			answer = (12000 * n) + (2000 * k);
		}
        // 만약 양꼬치가 10인분이 넘어가는 경우 10인분당 받을 수 있는 음료수의
        // 갯수를 주문한 음료수의 수에서 제외하고, 10인분이 넘지 않는 경우
        // 주문한 음료수의 수 그대로 결제한다
        return answer;
    }
}