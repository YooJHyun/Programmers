class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0; i < b.length; i++) {
            answer += a[i] * b[i];
        } // 길이가 동일한 a와 b의 동일한 인덱스를 곱한다 
          // (a의 길이까지 for문을 실행할 수도 있다)
        
        return answer;
    }
}