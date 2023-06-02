class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        // 새로 만들 배열의 크기를 지정해준다
        int index = 0;
        for(int i = 1; i <= n; i++) {
            if(i % k == 0) {
                answer[index] = i;
                index++;
            } // 증가하는 i값이 k의 배수일때 i를 answer에 넣어준다
        } // 이때, i의 자리값은 index를 증가시킴으로서 지정해준다
        return answer;
    }
}