function solution(letter) {
    let answer = "";
    const morseCodeMap = {
        ".-": "a",
        "-...": "b",
        "-.-.": "c",
        "-..": "d",
        ".": "e",
        "..-.": "f",
        "--.": "g",
        "....": "h",
        "..": "i",
        ".---": "j",
        "-.-": "k",
        ".-..": "l",
        "--": "m",
        "-.": "n",
        "---": "o",
        ".--.": "p",
        "--.-": "q",
        ".-.": "r",
        "...": "s",
        "-": "t",
        "..-": "u",
        "...-": "v",
        ".--": "w",
        "-..-": "x",
        "-.--": "y",
        "--..": "z"
    };

    const letterArr = letter.split(" ");

    for (let i = 0; i < letterArr.length; i++) {
        if (morseCodeMap.hasOwnProperty(letterArr[i])) {
            answer += morseCodeMap[letterArr[i]];
        }
    } // 각 모스 부호와 배열의 원소가 동일할 때 answer에 모스 부호에 해당하는 문자를 넣어준다
    return answer;
}
