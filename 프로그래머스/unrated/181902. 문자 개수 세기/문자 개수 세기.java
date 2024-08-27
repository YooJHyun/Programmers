class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
		
		for(int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i) > 64 && my_string.charAt(i) < 91) {
                // my_string의 i번째 원소가 대문자 A인 65부터 대문자 Z인 90 사이에 있으면
                answer[my_string.charAt(i)-65]++;
                // 앞쪽의 26개 인덱스 중 해당 원소를 1증가시키고
            } else if(my_string.charAt(i) > 96 && my_string.charAt(i) < 123) {
                // my_string의 i번째 원소가 소문자 a인 97부터 소문자 z인 122 사이에 있으면
                answer[my_string.charAt(i)-71]++;
                // 뒤쪽의 26개 인덱스 중 해당 원소를 1증가시킨다
            }
		}
        return answer;
    }
}