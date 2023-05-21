class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        // answer의 범위를 지정해준다
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start - i;
        }   // start가 10이므로 1씩 증가하는 i를 빼면서 answer에 넣어준다
        return answer;
    }
}