class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] arr = s.split(" ");
		// 문자열을 배열로 변환한다
        
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("Z")) {
				answer -= Integer.parseInt(arr[i - 1]);
				continue;
			} // arr의 원소가 Z인 경우 해당 인덱스 앞의 원소값을 빼고
			else {
				answer += Integer.parseInt(arr[i]);
			} // 이에 해당하지 않으면 answer에 합산한다
		}
        return answer;
    }
}