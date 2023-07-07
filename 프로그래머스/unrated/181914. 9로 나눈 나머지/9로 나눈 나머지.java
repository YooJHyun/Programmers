class Solution {
    public int solution(String number) {
        int[] num = new int[number.length()];
        // number와 동일한 길이의 배열 num을 선언한다
		int answer = 0;
		
		for(int i = 0; i < number.length(); i++) {
			num[i] = number.charAt(i) - '0';
		} // num에 number의 문자를 순서대로 넣는다
		for(int i = 0; i < num.length; i++) {
			answer += num[i];
		} // answer에 num의 원소들을 누적합산한다
		answer %= 9;
        // answer를 9로 나눈 나머지를 반환한다
        return answer;
    }
}