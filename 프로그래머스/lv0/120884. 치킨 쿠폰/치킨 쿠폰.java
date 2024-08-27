class Solution {
    public int solution(int chicken) {
        int coupon1 = chicken;
        // 1차 쿠폰은 주문한 치킨 한마리당 한개이다
        int coupon2 = 0;
        // coupon1으로 주문에 사용 후 남는 쿠폰
        int answer = 0;
        
        while(coupon1 + coupon2 >= 10) {
            int sum1 = (coupon1 + coupon2) / 10;
            int sum2 = (coupon1 + coupon2) % 10;
            
            coupon1 = sum1;
            coupon2 = sum2;
            // 쿠폰으로 주문한 치킨은 answer에 누적하고 남은 쿠폰은 
            // 다시 계산할 수 있게 한다
            answer += coupon1;
            // 주문한 쿠폰과 남은 쿠폰의 합이 10이상이면 answer에 누적한다
        }
        return answer;
    }
}