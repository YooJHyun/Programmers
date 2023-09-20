class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int l = i; l <= j; l++) {
            String num = Integer.toString(l);
            // 반복문을 사용해서 i와 j까지의 수를 문자열로 변환한다
            
            for(int m = 0; m < num.length(); m++) {
                if(Integer.toString(k).equals(num.substring(m, m + 1))) {
                    answer++;
                } // 만약 변환한 문자열에 k가 포함된 경우 answer의 카운트를 늘린다
            }
        }
        return answer;
    }
}