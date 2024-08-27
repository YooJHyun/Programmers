class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) {
                answer = i;
                break;
            } // num_list의 원소가 음수면 answer에 index를 넣어주고
            else if (num_list[i] > 0) {
                answer = -1;
            } // 음수가 없다면 -1을 넣어준다
        }
        return answer;
    }
}