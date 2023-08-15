import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] a = after.toCharArray();
		char[] b = before.toCharArray();
		// after와 before를 array로 변환하고
        
		Arrays.sort(a);
		Arrays.sort(b);
		// 각 array를 정렬한다
        
		String aa = Arrays.toString(a);
		String bb = Arrays.toString(b);
		// 정렬한 array를 다시 string으로 변환해준다
        
		if(aa.equals(bb)) {
			answer = 1;
		} // 이때, 변환된 before에 after이 포함되면
          // before로 after를 만들 수 있다는 의미로 answer에 1을 넣어주고
          // 이에 해당하지 않으면 0인 상태로 두면 안된다
        
        return answer;
    }
}