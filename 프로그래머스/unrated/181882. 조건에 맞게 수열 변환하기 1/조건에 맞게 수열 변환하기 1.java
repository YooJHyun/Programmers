class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } // 원소의 값이 50 이상이면서 짝수는 2로 나눈다
            else if (arr[i] < 50 && arr[i] % 2 != 0) {
                answer[i] = arr[i] * 2;
            } // 원소의 값이 50미만이면서 홀수는 2를 곱한다
            else {
                answer[i] = arr[i];
            } // 위 두 조건에 해당하지 않으면 그대로 넣는다
        }
        return answer;
    }
}