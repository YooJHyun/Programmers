class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int dif = 0;
		int min = Integer.MAX_VALUE;
        // min는 0으로 설정시 최솟값 삽입이 불가하므로 max_value로 초기화한다
        
        for (int i = 0; i < array.length; i++) {
            dif = Math.abs(n - array[i]);
            // dif에는 각 원소와 n의 차이값을 절댓값으로 설정해둔다
            if (dif < min) {
            // 만약 dif가 min보다 작다면
                min = dif;
                // min은 dif 값을 대체하고
                answer = array[i];
                // answer에는 i번째 원소를 넣는다
                
            } else if (dif == min && array[i] < answer) {
                // 만약 dif와 min의 값이 같고, i번째 원소가 answer보다 작다면
                answer = array[i];
                // answer에는 더 작은 수를 넣어준다
            }
        }
        return answer;
    }
}