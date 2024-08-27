class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int k = 0; k < queries.length; k++) {
            int i = queries[k][0];
            int j = queries[k][1];
            // i와 j는 queries의 배열 내의 0,1번째이고
            int change = arr[i];
            arr[i] = arr[j];
            arr[j] = change;
            // change라는 변수에 arr[i]값을 넣어두고 arr[j]값으로 바꾸고,
            // arr[j]에 change에 있던 arr[i]의 원래 값을 넣어 서로 바꿔준다
        }
        return arr;
    }
}