class Solution {
    public int solution(int hp) {
        int general = (hp / 5);
        int army = ((hp % 5) / 3);
        int work = (((hp % 5) % 3) / 1);
        int answer = general + army + work;
        return answer;
    }
}