class Solution {
    public int solution(int order) {
        int answer = 0;
        String tmp = Integer.toString(order);
		String[] arr = tmp.split("");
        // order를 배열로 변환한다
        
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")) {
				answer++;
			} // arr의 i번째 값이 3,6,9 중 하나라면 카운트한다
		}
        return answer;
    }
}