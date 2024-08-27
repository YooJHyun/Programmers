import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int calc = n;
        if (n % 2 == 0) {
            System.out.println(calc + " is even");
        }
        else {
            System.out.println(calc + " is odd");
        }
    }
}