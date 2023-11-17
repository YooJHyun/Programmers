class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        // answer는 각 arr1, arr2의 길이만큼 선언한다
        
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            } // answer의 i,j에 각 arr1, arr2의 동일한 자리의 원소를 더해준다
        }
        return answer;
    }
}