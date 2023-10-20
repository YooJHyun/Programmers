class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++) {
			while(num_list[i] != 1) {
            // num_list의 i번째 원소가 1이 아니라면 if else문 반복한다
				if(num_list[i] % 2 == 0) {
					num_list[i] /= 2;
                    // 원소가 짝수라면 2로 나눈다
				}
				else {
					num_list[i] = (num_list[i] - 1) / 2;
				    // 원소가 홀수라면 1을 빼고 2로 나눈다
                }
				answer++;
                // if else문이 실행될때마다 횟수를 카운트한다
			}
		}
        return answer;
    }
}