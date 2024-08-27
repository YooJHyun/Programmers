class Solution {
    public int[] solution(int n) {
       int count = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			} // 약수의 갯수를 count해준다			
		}
		int[] answer = new int[count];
		// 약수가 담길 배열의 길이는 count로 정한다
		int j = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer[j] = i;
				j++;
			} // 약수를 answer에 담아준다
		}
        return answer;
    }
}