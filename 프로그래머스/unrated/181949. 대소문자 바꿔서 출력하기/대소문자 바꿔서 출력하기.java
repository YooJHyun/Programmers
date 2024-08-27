import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";
        
        for(int i = 0; i < a.length(); i++) {
            char ul = a.charAt(i);
            // 입력받은 문자를 char형으로 변환한다
            
            if(Character.isLowerCase(ul)) {
                answer += Character.toUpperCase(ul);
            } // 만약 대상 글자가 소문자라면 대문자로 변환하여
              // answer에 누적합산하고
            else {
                answer += Character.toLowerCase(ul);
            } // 대문자이면 소문자로 변환하여 answer에 누적합산한다
        }
        System.out.println(answer);
    }
}