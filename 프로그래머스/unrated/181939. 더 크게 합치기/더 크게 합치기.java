class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
		String b1 = Integer.toString(b);
		// int로 선언된 a,b를 String으로 변환한다
		
		String sum1 = a1 + b1;
		String sum2 = b1 + a1;
		// String으로 변환된 a,b를 붙인다
		
		int tmp1 = Integer.parseInt(sum1);
		int tmp2 = Integer.parseInt(sum2);
		// 순서를 바꾸어 붙인 sum1,sum2을 다시 int로 변환한다
		
        if (tmp1 >= tmp2) {
            answer = tmp1;
        }	// 만약 tmp1이 tmp2 보다 더 크거나 같다면 tmp1을 반환하고
        else {
            answer = tmp2;
        }	// 만약 tmp2가 tmp1 보다 더 크다면 tmp2을 반환한다
        return answer;
    }
}