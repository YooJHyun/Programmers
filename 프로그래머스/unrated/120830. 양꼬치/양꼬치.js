function solution(n, k) {
    var answer = 0;
    let sale = Math.floor(n / 10);
		if (sale >= 1) {
			answer = ((12000 * n) + (2000 * (k - sale)));
		} 
		else {
			answer = (12000 * n) + (2000 * k);
		}
    return answer;
}