class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) {
            answer = a * a + b * b;
        }
        // a와 b 둘다 홀수인 경우 
        else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        }
        // a와 b 둘 중 하나만 홀수인 경우
        else if (a % 2 == 0 && b % 2 == 0) {
            // a와 b 둘다 짝수인 경우
            if (a - b < 0) {
                answer = -(a - b);
            }
            // a - b의 절댓값을 반환해야 하므로 a-b의 값을 0을 기준으로 판단할 수 있도록 if문 추가
            else {
                answer = a - b;
            }
        }
        return answer;
    }
}