class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int tmp = 0;
        // 세 학생의 정수 번호를 더할 변수를 선언한다
        
        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    tmp = (number[i] + number[j] + number[k]);
					// 각자 다른 i,j,k 세 학생의 번호를 tmp에 더한다
					if(tmp == 0) {
						answer++;
                        // 만약 세 학생의 번호 합이 0이면 answer를 증가시킨다
					}	
                }
            }
        }
        return answer;
    }
}