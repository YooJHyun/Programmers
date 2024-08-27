import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n을 입력받을 scannser를 준비한다
        String triple = "*";
        // 출력될 문자를 선언한다
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(triple);
            } // j는 가로 행을 의미하며 i의 값 증가마다 *을 입력하고
              // i는 세로 행을 의미하며 scanner를 통해 받아온 n만큼의 줄을 만들어준다
            System.out.println();
        }
        
    }
}