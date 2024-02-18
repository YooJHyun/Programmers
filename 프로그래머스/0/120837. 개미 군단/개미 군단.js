function solution(hp) {
    let general = Math.floor(hp / 5);
    let army = Math.floor((hp % 5) / 3);
    let work = Math.floor(((hp % 5) % 3) / 1);
    let answer = general + army + work;
    return answer;
}
