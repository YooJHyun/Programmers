class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        // 주어진 my_string을 배열로 변환한다
        
        int answer = Integer.parseInt(arr[0]);
        // 계산의 기본값은 배열의 첫번째 숫자로 지정한다
        
        for(int i = 1; i < arr.length; i += 2) {
            if(arr[i].equals("+")) {
				answer += Integer.parseInt(arr[i + 1]);
			}   // arr의 원소 중 +가 있으면 +의 뒤 숫자를 더하고
			else {
				answer -= Integer.parseInt(arr[i + 1]);
			}   // 아니라면 -뒤의 숫자를 뺀다
        }
        return answer;
    }
}