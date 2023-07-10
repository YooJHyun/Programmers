import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");
        // scanner를 통해 받아온 문자열을 배열로 변환한다
	     for(int i = 0; i < arr.length; i++) {
	    	 System.out.println(arr[i]);
             // 배열의 각 원소들을 다음줄로 하나씩 출력한다
	     }
    }
}