class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        // answer의 길이는 기존 num_list의 길이에서 자르고자 하는 번호의 수에 1을 더한다
		int j = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(i >= (n - 1)) {
            // i가 자르고자 하는 n보다 1이 적은 인덱스를 가지므로 이보다 i가 클때
            	answer[j] += num_list[i];
                // answer에 채워준다
            	j++;
                // 이때, 1의 차이를 고려하여 answer의 인덱스는 0부터 시작할 수 있도록 한다
            }
        }
        return answer;
    }
}