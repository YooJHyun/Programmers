import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String[] arr = my_string.replaceAll("[^0-9]", "").split("");
        // my_string에 숫자만 남긴 후 arr로 변환한다
        Arrays.sort(arr);
        // 정렬한다
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }   // arr의 원소를 형변환하여 넣어준다
        return answer;
    }
}