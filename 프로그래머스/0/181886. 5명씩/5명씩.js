function solution(names) {
    const list = [];
    // 5명 그룹의 선두 인원의 이름을 받을 list를 만든다
    for (let i = 0; i < names.length; i += 5) {
        list.push(names[i]);
    } // 0번째 부터 그 뒤 5번째씩의 사람을 list에 추가한다
    return list;
}