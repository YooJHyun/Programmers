class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String change1 = numbers.replace("one", "1");
		String change2 = change1.replace("two", "2");
		String change3 = change2.replace("three", "3");
		String change4 = change3.replace("four", "4");
		String change5 = change4.replace("five", "5");
		String change6 = change5.replace("six", "6");
		String change7 = change6.replace("seven", "7");
		String change8 = change7.replace("eight", "8");
		String change9 = change8.replace("nine", "9");
		String change10 = change9.replace("zero", "0");
		// 영문 숫자를 숫자로 변환해준다
		answer = Long.parseLong(change10);
        // 변환한 숫자는 문자열 형태이므로 정수로 변환한다
        return answer;
    }
}