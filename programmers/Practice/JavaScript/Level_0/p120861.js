// 머쓱이는 RPG게임을 하고 있습니다. 게임에는 up, down, left, right 방향키가 있으며
// 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
// 예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1], left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다.
//머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
// 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.

// [0, 0]은 board의 정 중앙에 위치합니다.
// 예를 들어 board의 가로 크기가 9라면 캐릭터는 왼쪽으로 최대 [-4, 0]까지 오른쪽으로 최대 [4, 0]까지 이동할 수 있습니다.
function solution(keyinput, board) {
  const key = { up: [1, 1], down: [1, -1], left: [0, -1], right: [0, 1] };
  const zero = [0, 0];
  const [x, y] = board;
  const width = Math.floor(x / 2);
  const height = Math.floor(y / 2);

  const isValid = (point, newNum) => {
    if (point === 0) return newNum <= width && newNum >= -width;
    if (point === 1) return newNum <= height && newNum >= -height;
  };

  for (let x of keyinput) {
    let temp = zero[key[x][0]] + key[x][1];
    if (isValid(key[x][0], temp)) zero[key[x][0]] += key[x][1];
  }

  return [zero[0], zero[1]];
  // return keyinput.map((x) => (origin[key[x][0]] += key[x][1]));
}
// console.log(solution(["left", "right", "up", "right", "right"], [11, 12]));
console.log(solution(["down", "down", "down", "down", "down"], [7, 9]));

// switch 이용
function solution(keyinput, board) {
  let res = [0, 0];
  for (let p of keyinput) {
    switch (p) {
      case "left":
        if (-res[0] < board[0] / 2 - 1) res[0]--;
        break;
      case "right":
        if (res[0] < board[0] / 2 - 1) res[0]++;
        break;
      case "up":
        if (res[1] < board[1] / 2 - 1) res[1]++;
        break;
      case "down":
        if (-res[1] < board[1] / 2 - 1) res[1]--;
        break;
    }
  }
  return res;
}

// reduce 이용
function solution(keyinput, board) {
  let key = { right: [1, 0], up: [0, 1], down: [0, -1], left: [-1, 0] };

  let rslt = keyinput
    .map((v) => key[v])
    .reduce(
      (a, b) => {
        if (
          Math.abs(a[0] + b[0]) > board[0] / 2 ||
          Math.abs(a[1] + b[1]) > board[1] / 2
        )
          return [a[0], a[1]];

        return [a[0] + b[0], a[1] + b[1]];
      },
      [0, 0]
    );

  return rslt;
}
