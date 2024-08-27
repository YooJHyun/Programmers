class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 7 == 0){
            answer = n / 7;
        }
        else if ((n / 7) > 1) {
            answer = (n/7) + 1;
        }
        else {
            answer = 1;
        }
        // 피자를 먹을 사람이 7명 초과시 마다 7조각으로 나눈 몫의 추가 1판을 더해주고,
        // 피자를 먹을 사람이 7명의 배수인 경우 인원을 7로 나눈 몫만큼 입력해주고,
        // 피자를 먹을 사람이 7명 미만인 경우 1판을 입력한다.
        return answer;
    }
}