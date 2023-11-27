import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String answer = "";
		
        for(int i = 0; i <= (n - 1); i++) {
        	answer += str;
        }   // 스캐너로 입력받은 문자열을 n회 반복하여 매개변수에 넣어준다
        System.out.println(answer);
    }
}