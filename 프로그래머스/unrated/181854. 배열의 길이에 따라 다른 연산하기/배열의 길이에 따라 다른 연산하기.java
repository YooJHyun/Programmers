class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        // int의 길이는 변함 없으므로 arr과 동일한 길이로 선언한다
        for(int i = 0; i < arr.length; i++) {
            if(arr.length % 2 != 0) {
            // arr의 길이가 홀수 일때,
                if(i % 2 == 0) {
                    answer[i] += arr[i] + n;
                }   // 짝수번째 원소에 n을 더하고,
                else {
                    answer[i] += arr[i];
                }   // 홀수번째는 기존의 원소를 넣는다
            }
            if(arr.length % 2 == 0) {
            // arr의 길이가 짝수라면,
                if(i % 2 != 0) {
                    answer[i] += arr[i] + n;
                }   // 홀수번째 원소에 n을 더하고,
                else {
                    answer[i] += arr[i];
                }   // 짝수번째 원소는 그대로 넣는다
            }
        }
        return answer;
    }
}