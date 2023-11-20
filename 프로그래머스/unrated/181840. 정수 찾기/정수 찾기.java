class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] == n) {
                answer = 1;
            } // num_list의 원소 중 n과 동일한 원소가 있을 경우 answer에 1을 대입한다
        }
        return answer;
    }
}