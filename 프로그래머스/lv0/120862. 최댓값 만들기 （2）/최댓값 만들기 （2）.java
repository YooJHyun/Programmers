import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        // numbers를 정렬해준다
		int max = numbers[0] * numbers[1];
		// max에 임의의 원소를 곱한 값을 넣는다
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] * numbers[j] > max) {
					answer = numbers[i] * numbers[j];
				} // i와 j를 차례대로 곱해서 max와 값이 크면 그 값을 넣어주고
			    else {
                    answer = max;
                } // 같거나 작다면 기존의 max값을 넣어준다
            }
		}
        return answer;
    }
}