class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i < s1.length; i++) {
        // s1의 길이만큼 세는 for문
			for(int j = 0; j<s2.length; j++) {
			// s2의 길이만큼 세는 for문
                if(s1[i].equals(s2[j])) {
                    // s1의 원소와 s2의 원소가 같다면
					answer++;
                    // 동일한 수만큼 카운트한다
				}
			}
		}
        return answer;
    }
}