class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            String ele = Integer.toString(array[i]);
            String[] earr = ele.split("");
            // array의 원소를 문자로 변환하여 쪼갠뒤 earr로 배열화한다 
            for(int j = 0; j < earr.length; j++) {
                if(earr[j].equals("7")) {
                    answer++;
                } // earr의 원소 중 7이 있으면 answer를 증가시킨다
            }
        }
        return answer;
    }
}