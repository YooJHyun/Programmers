import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger a1 = new BigInteger(a);
		BigInteger b1 = new BigInteger(b);
        // String으로 표기된 a, b를 BigInteger를 이용해 큰 정수로 변환한다
		
		BigInteger tmp = a1.add(b1);
        // tmp에 두 값을 합한다
        String answer = tmp.toString();
        // tmp를 다시 String으로 변환한다
        return answer;
    }
}