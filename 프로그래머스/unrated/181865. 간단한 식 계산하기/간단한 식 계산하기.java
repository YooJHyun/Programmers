class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] bioindex = binomial.split(" ");
        // binomial을 배열로 변환한다
        
        int a = Integer.parseInt(bioindex[0]);
        String op = bioindex[1];
        int b = Integer.parseInt(bioindex[2]);
        // 숫자는 각 a,b 기호는 op로 정한다

        if (op.equals("+")) {
            answer += a + b;
        } // op가 +라면 a + b를 수행하고 
        else if (op.equals("-")) {
            answer += a - b;
        } // op가 -라면 a - b를 수행하고
        else if (op.equals("*")) {
            answer += a * b;
        } // op가 *라면 a * b를 수행한다
        return answer;
    }
}