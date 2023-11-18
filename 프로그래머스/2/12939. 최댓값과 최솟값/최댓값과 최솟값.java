class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] numbers = s.split(" ");
        // 문자열을 빈칸을 기준으로 나눈다
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < numbers.length; i++){
            int number = Integer.parseInt(numbers[i]);
            // 문자열의 원소를 정수로 변환한다
            
            min = Math.min(min, number);
            max = Math.max(max, number);
        }   // numbers의 원소 중에서 최댓값과 최솟값을 찾아서 넣어준다

        answer = min+ " " +max;
        // 최솟값, 최댓값 순으로 정리하여 리턴한다
        return answer;
    }
}