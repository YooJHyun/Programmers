class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        
        for(int i = 0; i < num_list.length; i++) {
			sum += num_list[i]; // 원소의 합을 구한 sum
            mul *= num_list[i]; // 원소의 곱을 구한 mul
            if (mul < (sum*sum)) {
                answer = 1;
            }   // 만약 sum의 제곱이 mul보다 크다면 1을 반환하고
            else {
                answer = 0;
            }   // mul이 더 크다면 0을 반환한다
		}
        return answer;
    }
}