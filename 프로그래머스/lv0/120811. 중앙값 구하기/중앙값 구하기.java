import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        // 배열 오름차순 정리
        answer = array[array.length / 2];
        // 배열의 길이를 2로 나누어 중앙값을 찾는다
        return answer;
    }
}