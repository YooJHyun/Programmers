class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int count= 0;
        // 머쓱이보다 키가 큰 인원의 수를 셀 count 변수를 선언한다
        for(int i = 0; i < array.length; i++) {
            if(array[i] > height) {
                answer++;
            // 만약 머쓱이보다 키가 큰 경우 answer가 1씩 증가한다
            }
        }
        return answer;
    }
}