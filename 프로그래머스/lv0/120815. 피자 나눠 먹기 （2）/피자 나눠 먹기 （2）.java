class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 6 * n; i++) {
            if(i * 6 % n == 0) {
                answer = i;
                break;
                // 피자의 조각 갯수를 인원수로 나눈 값이 
                // 0이 될때 까지 for문을 실행하고 만약
                // 0이 되면 for문을 빠져나간다
            }
        }
        return answer;
    }
}