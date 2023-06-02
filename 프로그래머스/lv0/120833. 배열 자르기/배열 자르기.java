class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        // answer의 길이는 인덱스의 차이에 +1 하여 선언한다
        
        for(int i = num1, j = 0; i<= num2; i++,j++){
            answer[j] = numbers[i];
        } // i는 잘라낸 인덱스를 나타내고, j는 answer의 인덱스를 나타낸다
        return answer;
    }
}