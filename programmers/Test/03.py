graph = [[0,0,1,1],[1,1,1,1],[2,2,2,1],[0,0,0,2]]
n = len(graph)
answer = []

# DFS로 특정한 노드를 방문한 뒤에 연결된 모든 노드들도 방문
def dfs(x, y, c):
    # 주어진 범위를 벗어나는 경우에는 즉시 종료
    if x <= -1 or x >= n or y <= -1 or y >= n:
        return False
    # 현재 노드를 아직 방문하지 않았다면
    
    if graph[x][y] == c:
        # 해당 노드 방문 처리
        graph[x][y] = (c+3)
        # 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
        dfs(x - 1, y, c)
        dfs(x, y - 1, c)
        dfs(x + 1, y, c)
        dfs(x, y + 1, c)
        return True
    # 이미 방문한 노드
    return False

# 모든 노드(위치)에 대하여 음료수 채우기
for x in range(3):
    result = 0
    for i in range(n):
        for j in range(n):
            # 현재 위치에서 DFS 수행            
            if dfs(i, j, x) == True:
                result += 1
    answer.append(result)
print(answer) # 정답 출력   