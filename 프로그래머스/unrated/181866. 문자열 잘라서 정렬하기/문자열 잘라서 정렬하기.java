import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        // myString을 x를 기준으로 배열로 변환한다
		Arrays.sort(arr);
        // 배열을 정렬한다
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < arr.length; i++) {
		    String str = arr[i];
		    if (!str.isEmpty()) {
		        list.add(str);
		    }
	    } // 배열의 원소가 비어있지 않다면 list에 추가한다

		String answer[] = list.toArray(new String[list.size()]);
        // list를 배열로 재 변환한다
        return answer;
    }
}