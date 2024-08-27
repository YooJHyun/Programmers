import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
		String a = "";
        
		String ans = String.valueOf(n);
        String[] list = ans.split("");
	    // n을 문자, 배열로 순서대로 변환시킨다
        
        Arrays.sort(list, Collections.reverseOrder());
        // 배열을 내림차순으로 정렬한다
        
		for(int i = 0; i < list.length; i++) {
			a += list[i];
		} // 배열을 문자로 변환한다
        
		answer = Long.parseLong(a);
        // 문자를 long 타입으로 변환한다
        
        return answer;
    }
}