class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int holl = 0;
        int zzak = 0;
        // 홀수와 짝수를 세어줄 변수 선언
        for(int i = 0; i < num_list.length; i++) {
            if ( num_list[i] % 2 == 0 ) {
                holl++;
            }   // 2로 나눈 나머지가 0이면 짝수이므로 holl이 카운트되고
            else {
                zzak++;
            }   // 나머지가 0이 아니라면 홀수이므로 zzak이 카운트 된다
        }
        answer[0] = holl;
        answer[1] = zzak;
        // holl, zzak을 answer에 넣어준다
        return answer;
    }
}