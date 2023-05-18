class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }   // n이 0이상일때 10으로 나눈 나머지부터 계속 더하면서 자릿수를 줄여나간다
        return answer;
    }
}