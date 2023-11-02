// 머쓱이는 프로그래머스에 로그인하려고 합니다. 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와
// 회원들의 정보가 담긴 2차원 배열 db가 주어질 때, 다음과 같이 로그인 성공,
// 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.
function solution(id_pw, db) {
  var answer = "";
  db.map((v) => {
    if (id_pw[0] === v[0]) {
      if (id_pw[1] === v[1]) answer = "login";
      else answer = `wrong pw`;
    } else answer = "fail";
  });
  return answer;
}
console.log(
  solution(
    ["meosseugi", "1234"],
    [
      ["rardss", "123"],
      ["yyoom", "1234"],
      ["meosseugi", "1234"],
    ]
  )
);
console.log(
  solution(
    ["programmer01", "15789"],
    [
      ["programmer02", "111111"],
      ["programmer00", "134"],
      ["programmer01", "1145"],
    ]
  )
);
