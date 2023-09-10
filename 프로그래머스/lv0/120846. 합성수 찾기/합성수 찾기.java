class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            int me = 0;
            // 약수의 수를 담아줄 변수 me를 선언한다
            for(int j = 1; j <= n; j++) {
                if(i % j == 0) {
                // i를 j로 나눈 나머지의 값이 0일때 마다
                    me++;
                    // 약수를 증가시킨다
                }
            }
            if (me >= 3) {
                answer++;
            } // 약수의 수가 1과 n자신을 포함한 
              // 3개 이상 일때 answer를 증가시킨다
        }
        return answer;
    }
}