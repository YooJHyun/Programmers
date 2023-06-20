public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n > 0) {
		    answer += n % 10;			
			n /= 10;
		} // n의 나머지(마지막 자릿수)을 answer에 넣어주고, 
          //n은 10으로 나누어 while문을 반복하게 한다
        return answer;
    }
}