function solution(arr, deleteList) {
  let answer = [];
  for (let i = 0; i < arr.length; i++) {
    answer.push(arr[i]);
    // answer에 arr의 원소를 담아준다
    for (let j = 0; j < deleteList.length; j++) {
      if (arr[i] === deleteList[j]) {
        answer.splice(answer.indexOf(arr[i]), 1);
      } // arr의 원소와 deleteList의 원소가 같다면
        // answer에서 지운다
    }
  }
  return answer;
}
