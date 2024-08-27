class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        // answer의 크기는 n까지 이므로 n으로 설정한다
        for(int i = 0; i < num_list.length; i++) {
            if(i < n) {
                answer[i] += num_list[i];
            }   // num_list의 n번째 원소까지 answer에 넣어준다
        }
        return answer;
    }
}