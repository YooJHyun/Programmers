import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while (n != 1) {
            // n이 1이 될때까지 아래 if else문 반복
            if (n % 2 == 0) {
                n /= 2;
                // n이 짝수이면 2로 나누고
            } 
            else {
                n = 3 * n + 1;
                // 홀수이면 3을 곱하고 1을 더한다
            }
            list.add(n);
            // 각 if else 구문 종료시 연산된 값을 리스트에 추가한다
        }

        int[] answer = new int[list.size()];
        // 리스트를 배열로 변환한다
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        } // answer에 list에서 값을 가져와서 배열에 넣어준다
        return answer;
    }
}