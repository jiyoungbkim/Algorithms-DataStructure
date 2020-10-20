# 나의 풀이
col = {
    'a':1,
    'b':2,
    'c':3,
    'd':4,
    'e':5,
    'f':6,
    'g':7,
    'h':8
}
dx = [-2, -2, -1, 1, -1, 1, 2, 2]
dy = [1, -1, 2, 2, -2, -2, 1, -1]
p = input("position : ")
y = col[p[0]]
x = int(p[1])
print(x, y)
cnt = 0
for i in range(8):
    nx = x + dx[i]   
    ny = y + dy[i]
    if nx < 1 or ny < 1 or nx > 8 or ny > 8:
        continue
    print(nx, ny)
    cnt += 1
print(cnt)

# 해설
# 현재 나이트의 위치 입력받기
input_data = input()
row = int(input_data[1])
column = int(ord(input_data[0]))-int(ord('a')) + 1

# 나이트가 이동할 수 있는 8가지 방향 정의 # 2차원 배열
steps = [(-2,-1), (-1,-2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

# 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
result = 0
for step in steps:
    # 이동하고자 하는 위치 확인
    next_row = row + step[0]
    next_column = column + step[1]
    # 해당 위치로 이동이 가능하다면 카운트 증가
    if next_row >= 1 and next_row <= 8 and next_column >= 1 and next_column <= 8:
        result += 1
print(result)