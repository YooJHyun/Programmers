class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String s1 = s.replaceAll("zero", "0");
		String s2 = s1.replaceAll("one", "1");
		String s3 = s2.replaceAll("two", "2");
		String s4 = s3.replaceAll("three", "3");
		String s5 = s4.replaceAll("four", "4");
		String s6 = s5.replaceAll("five", "5");
		String s7 = s6.replaceAll("six", "6");
		String s8 = s7.replaceAll("seven", "7");
		String s9 = s8.replaceAll("eight", "8");
		String s10 = s9.replaceAll("nine", "9");
		// 0부터 9까지의 문자을 숫자 형태의 문자로 변경한다
        
		answer = Integer.parseInt(s10);
        // 변경된 문자열을 숫자로 변환한다
        return answer;
    }
}