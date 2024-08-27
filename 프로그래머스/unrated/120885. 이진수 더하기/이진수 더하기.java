class Solution {
    public String solution(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        // bin1과 bin2를 각 2진수에서 10진수로 변환한다
        
        int tmp = num1 + num2;
        // tmp에서 10진수로 변환한 두 값을 더한다
        
        String answer = Integer.toBinaryString(tmp);
        // answer에 합산한 10진수 값을 2진수로 재변환한다
        return answer;
    }
}