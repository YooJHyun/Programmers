class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] arr_cipher = cipher.split("");
        // cipher를 arr로 변환한다
        
        for(int i = 0; i < arr_cipher.length+ 1; i++) {
        	if(i * code == 0) {
        		continue;
        	} // 0번째는 code에 해당하지 않으므로 제외한다
        	if(i % code == 0) {
                answer += arr_cipher[i - 1];
            } // code의 배수에 해당하는 원소들은 실제 code 배수번째 원소의
              // 다음 원소이므로 i - 1로 위치를 조정해준다
        }
        return answer;
    }
}