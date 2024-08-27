class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int p = 0;
        int y = 0;
        
        s = s.toLowerCase();
        // s를 모두 소문자로 변환한다
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'p') {
                p++;
                // s의 i번째가 p일시 p를 카운트한다
            }
			else if(s.charAt(i) == 'y') {
				y++;
                // s의 i번째가 y일시 y를 카운트한다
			}
		}
        if(p != y) answer = false;
        // 만약 p와 y의 카운트값이 다르다면 answer는 false가 된다
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}