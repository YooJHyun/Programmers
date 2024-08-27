class Solution {
    public int solution(int a, int b) {
        int answer = 0;
		String a1 = Integer.toString(a);
		String b1 = Integer.toString(b);
        // a와 b를 문자로 변환하여 두 수를 붙인다
	    String tmp1 = a1 + b1;
	    int tmp3 = Integer.parseInt(tmp1);
        // 붙여진 수를 다시 int로 변환한다
	    int tmp2 = 2*a*b;
        
	    if (tmp3 >= tmp2) {
	        answer = tmp3;
	    }   // 1번식이 2번식보다 크거나 같으면 1번식의 결과를 반환하고
	    else {
	        answer = tmp2;
	    }   // 2번식이 1번식보다 크면 2번식의 결과를 반환한다
	    return answer;
	}
    
}