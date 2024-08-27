class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] arr = control.split("");
		// answer의 원소에 접근하기 위해 arr로 변환한다
        
        for (int i = 0; i < arr.length; i++ ) {
            if(arr[i].equals("w")) {
                answer += 1; 
            } // 원소가 w일시 1을 더한다
            else if (arr[i].equals("s")) {
                answer -= 1;
            } // 원소가 s일시 1을 뺀다
            else if (arr[i].equals("d")) {
                answer += 10;
            } // 원소가 d일시 10을 더한다
            else if (arr[i].equals("a")) {
                answer -= 10;
            } // 원소가 a일시 10을 뺀다
            else {
                continue;
            }
        }
        return answer;
    }
}