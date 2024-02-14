function solution(a, b) {
    let answer = 0;
    const a1 = a.toString();
    const b1 = b.toString();
    // a와 b를 문자로 변환하여 두 수를 붙인다
    const tmp1 = a1 + b1;
    const tmp3 = parseInt(tmp1);
    // 붙여진 수를 다시 int로 변환한다
    const tmp2 = 2 * a * b;

    if (tmp3 >= tmp2) {
        answer = tmp3;
    } // 1번식이 2번식보다 크거나 같으면 1번식의 결과를 반환하고
	else {
	    answer = tmp2;
	} // 2번식이 1번식보다 크면 2번식의 결과를 반환한다
	return answer;
}