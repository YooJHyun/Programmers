class Solution {
    public int solution(int[] num_list) {
        int holl = 0;
        int zzak = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 != 0) {
                holl += num_list[i]; 
            } // 홀수번째 원소들은 holl에 담아주고
            else {
                zzak += num_list[i];
            } // 짝수번째 원소들은 zzak에 담아준다
        }
        if (holl > zzak) {
            return holl;
        } // 이때, holl의 값이 크면 holl을 반환하고
        return zzak;
    }     // if의 조건에 해당하지 않으면 zzak이 더 크므로 zzak을 반환한다
}