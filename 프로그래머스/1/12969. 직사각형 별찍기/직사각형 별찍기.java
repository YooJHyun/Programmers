import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print("*");
            } // *을 a만큼 가로로 찍는다
            System.out.println();
            // 다음 줄로 넘어간다
        } // b만큼 가로줄을 중복하여 직사각형 형태로 만든다
    }
}