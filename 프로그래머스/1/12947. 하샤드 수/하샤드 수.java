class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int a = 0;
        int b = x;
        
		while (b >= 1) {
			a += b % 10;
			b /= 10;
		} // x가 1이상인 경우 a에는 b의 1의 자릿수를 누적 합산하여 자릿수의 합을 구하고, b는 1의 자릿수를 잘라낸 수를 넣는다

		if (x % a == 0) {
			answer = true;
		} // x를 각 자릿수의 합으로 나누어지면 true를
        else {
			answer = false;
        } // 나누어지지 않는다면 false를 반환한다
        return answer;
    }
}