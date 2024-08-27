class Solution {
    public int solution(String my_string) {
        int answer = 0;
		my_string = my_string.toLowerCase();
		my_string = my_string.replaceAll("[abcdefghijklmnopqrstuvwxyz]", "x");
		// my_string의 문자를 소문자, 알파벳을 x로 변환한다
		String[] arr = my_string.split("x");
        // 앞서 변환시킨 x를 기준으로 배열로 변환한다
        
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].isEmpty()) {				
				answer += Integer.parseInt(arr[i]);
			} // 배열의 원소가 비어있지 않다면 anwer에 숫자로 변환해서 누적합산한다
		}
        return answer;
    }
}