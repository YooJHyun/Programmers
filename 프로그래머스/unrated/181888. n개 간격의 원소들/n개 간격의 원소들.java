class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer;
		
        if (num_list.length % n == 0) {
            answer = new int[num_list.length / n];
            // answer의 길이를 나눈 나머지 값이 0인 경우
            // num_list를 n으로 나눈 값으로 정한다
        } 
        else {
            answer = new int[num_list.length / n + 1];
        }   // answer의 길이를 나눈 나머지 값이 존재하는 경우
            // num_list를 n으로 나눈 몫에 1을더한다
        int j = 0;
        for (int i = 0; i < num_list.length; i += n) {
            answer[j] = num_list[i];
            j++;
            // answer에 num_list 원소를 넣어준다
        }
        return answer;
    }
}