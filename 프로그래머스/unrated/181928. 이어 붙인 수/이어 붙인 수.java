class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        // 홀수, 짝수만 합칠 odd, even을 선언한다
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                odd += Integer.toString(num_list[i]);
            } // num_list의 원소가 홀수일때, odd에 문자열로 변환하여 넣어준다
            else {
                even += Integer.toString(num_list[i]);
            } // num_list의 원소가 짝수일때, even에 문자열로 변환하여 넣어준다
        }      
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        // answer에 odd와 even을 정수로 변환하여 합산한다
        return answer;
    }
}