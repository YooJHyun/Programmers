class Solution {
   public int solution(int[] date1, int[] date2) {
        if (date1[0] < date2[0]) {
            return 1;
        } else if (date1[0] > date2[0]) {
            return 0;
        } // 두 날짜의 연도를 비교하여 1 혹은 0 반환
        if (date1[1] < date2[1]) {
            return 1;
        } else if (date1[1] > date2[1]) {
            return 0;
        } // 두 날짜의 월를 비교하여 1 혹은 0 반환
        
        if (date1[2] < date2[2]) {
            return 1;
        } else if (date1[2] > date2[2]) {
            return 0;
        } // 두 날짜의 일을 비교하여 1 혹은 0 반환
        
        return 0;
    }

}