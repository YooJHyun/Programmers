class Solution {
    public int solution(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i][j] != arr[j][i]) {
                    return 0;
                } // arr[i][j]와 arr[j][i]가 다를때 0을 반환하고 
            }
        }
        return 1;
        // 같은 경우 1을 반환한다
    }
}