class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i < answer.length; i++) {
            int j = answer.length - i - 1;
            answer[i] = num_list[j];
        }
        return answer;
    }
}