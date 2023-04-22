class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
            answer = 1;
        // 만약 num1와 num2가 같으면 1을 반환하고,
        }
        else {
            answer = -1;
        // num1과 num2가 다르다면 -1을 반환한다
        }
        return answer;
    }
}