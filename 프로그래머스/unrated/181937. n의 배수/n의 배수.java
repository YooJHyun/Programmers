class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if (num % n == 0) {
            answer = 1;
        // 만약 num을 n으로 나누었을 때 배수라면 나머지가 0이므로 1을 반환하고,
        }
        else {
            answer = 0;
        // num을 n으로 나누었을 때 배수가 아니라면 나머지가 0이 될수 없으므로 0을 반환한다
        }
        return answer;
    }
}