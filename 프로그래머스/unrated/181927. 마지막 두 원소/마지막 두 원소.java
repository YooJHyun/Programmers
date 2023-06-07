class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        // answer는 마지막 값을 추가해야 하므로 num_list의 길이에 1을 더하여 선언한다
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        } // answer에 마지막 원소를 제외한 자리에 num_list를 넣어준다
        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
        // 만약 num_list의 마지막 원소가 그 앞의 원소보다 큰 경우
			answer[num_list.length] += num_list[num_list.length -1] - num_list[num_list.length -2];
            // 그 앞의 원소를 뺀 마지막 원소값을 answer의 마지막 자리에 넣어준다
		}
		else {
        // num_list의 마지막 원소가 그 앞의 원소보다 작거나 같은 경우
			answer[num_list.length] += num_list[num_list.length -1] * 2;
            // num_list의 마지막 원소값을 2배로 answer의 마지막 자리에 넣어준다
		}
        return answer;
    }
}