class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for (int i = 0; i < db.length; i++) {
			if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
				answer = "login";
				break;
			} // id_pw[0]은 id로 db의 [i][0]번째가 id이므로 이와 같으며
              // id_pw[1]이 pw이므로 db의 [i][1]이 같을때 로그인 성공을 의미한다
			else if(id_pw[0].equals(db[i][0]) && id_pw[1] != db[i][1]) {
				answer = "wrong pw";
				break;
			} // id는 동일하나 pw가 불일치하는 경우 wrong pw를 의미하고
			else {
				answer = "fail";
			} // 이 두가지 외에 해당하면 fail을 의미한다
		}
        return answer;
    }
}