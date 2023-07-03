class Solution {
    public String solution(int age) {
        String answer = "";
        
        String age_string = Integer.toString(age);
		String[] arr = age_string.split("");
		// age를 문자열, 배열로 순차 변환한다
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("0")) {
				answer += "a";
			} // arr의 i번째 원소가 0과 같으면 a를 넣어 준다
			else if(arr[i].equals("1")) {
				answer += "b";
			} // 이하 동일한 방법으로 누적시킨다
			else if(arr[i].equals("2")) {
				answer += "c";
			}
			else if(arr[i].equals("3")) {
				answer += "d";
			}
			else if(arr[i].equals("4")) {
				answer += "e";
			}
			else if(arr[i].equals("5")) {
				answer += "f";
			}
			else if(arr[i].equals("6")) {
				answer += "g";
			}
			else if(arr[i].equals("7")) {
				answer += "h";
			}
			else if(arr[i].equals("8")) {
				answer += "i";
			}
			else if(arr[i].equals("9")) {
				answer += "j";
			}
        }
        return answer;
    }
}