class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                answer++;
            // 만약 i번째 원소가 n과 같을 경우 answer를 1씩 더한다
            }
        }
        return answer;
    }
}