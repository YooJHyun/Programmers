class Solution {
    public int[] solution(int[] arr, int k) {
        int answer[] = new int[arr.length];
        // answer를 arr와 같은 길이로 선언한다
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 != 0) {
                answer[i] = arr[i] * k; 
            }   // k가 홀수라면 모든원소에 k를 곱해주고
            else {
                answer[i] = arr[i] + k;
            }   // k가 짝수라면 모든 원소에 k를 더해준다
        }
        return answer;
    }
}