class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.equals("left")) {
            for(int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            } // direction이 left일때 answer에 numbers의 원소를 +1하여 넣어주고
            answer[numbers.length - 1] += numbers[0];
            // answer의 마지막 인덱스에는 numbers의 첫번째 원소를 넣어준다
        }
        else {
            for(int i = 1; i < numbers.length; i++) {
                answer[i] += numbers[i - 1];
            } // direction이 right일때 answer에 numbers의 원소를 -1하여 넣어주고
            answer[0] += numbers[numbers.length - 1];
        } // answer의 첫번째 인덱스에는 numbers의 마지막 원소를 넣어준다
        return answer;
    }
}