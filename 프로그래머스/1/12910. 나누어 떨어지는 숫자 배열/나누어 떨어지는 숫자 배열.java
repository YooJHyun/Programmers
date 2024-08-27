import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				count++;
			} // arr[i]가 divisor로 나누어 떨어지는 경우 
              // count를 증가시켜 해당 값 만큼의 배열 범위를 얻는다
		}
        
        if(count == 0) {
            int[] answer = {-1};
            return answer;
        } // 만약 count가 0일 경우 -1을 담아 반환한다
        
		int[] answer = new int[count];
        // answer배열은 앞서 얻은 count만큼 길이 지정을 한다
        int j = 0;
        
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				answer[j] = arr[i];
                j++;
			} // 다시 arr[i]가 divisor로 나누어지는 경우
              // answer배열의 앞에서 부터 해당 값을 넣는다
		}
        Arrays.sort(answer);
        // answer을 오름차순 정렬한다
        return answer;
    }
}