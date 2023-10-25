class Solution {
    public int[] solution(int[] arr, int[][] queries) {        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            for (int j = s; j <= e; j++) {
                arr[j] += 1;
            } // queries에서 주어진 규칙에 해당하는 arr[i]에 1을 더해준다
        }
        return arr;
    }
}