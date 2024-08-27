class Solution {
    public int solution(int angle) {
        if (0 < angle && angle < 90) {
			angle = 1;
		}
		else if (angle == 90) {
			angle = 2;
		}
		else if (90 < angle && angle < 180) {
			angle = 3;
		}
		else if (angle == 180) {
			angle = 4;
		}
		return angle;
        // if 문을 통해 angle의 값에 따라 각도의 기준에 맞춰 판별하고 이에 맞는 값을 반환한다
    }
}