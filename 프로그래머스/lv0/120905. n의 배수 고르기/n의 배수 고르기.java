class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        int j = 0;
        for(int i = 0; i < numlist.length; i++) {            
            if(numlist[i] % n == 0) {
            	cnt++;
                // n의 배수를 카운트해서 answer의 길이를 정한다
            }            	
        }
        int[] answer = new int[cnt];
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[j] = numlist[i];
                j++;
                // n의 배수를 앞서 카운트한 answer에 넣어준다
            }
        }
        return answer;
    }
}