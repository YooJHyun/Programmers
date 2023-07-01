class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] letter_arr = letter.split(" ");
        // letter를 배열로 변환한다
        
        for(int i = 0; i < letter_arr.length; i++) {
            if (letter_arr[i].equals(".-")) answer += "a";
            if (letter_arr[i].equals("-...")) answer += "b";
            if (letter_arr[i].equals("-.-.")) answer += "c";
            if (letter_arr[i].equals("-..")) answer += "d";
            if (letter_arr[i].equals(".")) answer += "e";
            if (letter_arr[i].equals("..-.")) answer += "f";
            if (letter_arr[i].equals("--.")) answer += "g";
            if (letter_arr[i].equals("....")) answer += "h";
            if (letter_arr[i].equals("..")) answer += "i";
            if (letter_arr[i].equals(".---")) answer += "j";
            if (letter_arr[i].equals("-.-")) answer += "k";
            if (letter_arr[i].equals(".-..")) answer += "l";
            if (letter_arr[i].equals("--")) answer += "m";
            if (letter_arr[i].equals("-.")) answer += "n";
            if (letter_arr[i].equals("---")) answer += "o";
            if (letter_arr[i].equals(".--.")) answer += "p";
            if (letter_arr[i].equals("--.-")) answer += "q";
            if (letter_arr[i].equals(".-.")) answer += "r";
            if (letter_arr[i].equals("...")) answer += "s";
            if (letter_arr[i].equals("-")) answer += "t";
            if (letter_arr[i].equals("..-")) answer += "u";
            if (letter_arr[i].equals("...-")) answer += "v";
            if (letter_arr[i].equals(".--")) answer += "w";
            if (letter_arr[i].equals("-..-")) answer += "x";
            if (letter_arr[i].equals("-.--")) answer += "y";
            if (letter_arr[i].equals("--..")) answer += "z";
        } // 각 모스 부호와 배열의 원소가 동일할 때 answer에 모스 부호에 해당하는 문자를 넣어준다
        return answer;
    }
}

