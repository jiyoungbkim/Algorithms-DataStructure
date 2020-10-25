# 071
graph = {
        'A': set(['B', 'C', 'E']),
        'B': set(['A']),
        'C': set(['A']),
        'D': set(['E', 'F']),
        'E': set(['A', 'D']),
        'F': set(['D'])
}
def dfs(graph, start):
    visited = []
    stack = [start]

    while stack:
        n = stack.pop()
        if n not in visited:
            visited.append(n)
            stack += graph[n] - set(visited)
    return visited
print(dfs(graph, 'A'))

# 072
graph = {
        'E': set(['D', 'A']),
        'F': set(['D']),
        'A': set(['E', 'C', 'B']),
        'B': set(['A']),
        'C': set(['A']),
        'D': set(['E','F'])
}
def bfs(graph, start):
    visited = []
    queue = [start]

    while queue:
        n = queue.pop(0)
        if n not in visited:
            visited.append(n)
            queue += graph[n] - set(visited)
    return visited
print(bfs(graph, 'E'))

# 073
graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E'])}

start, end = [i for i in input().split()]

queue = [start]
visited = [start]

def sol():
    count = -1

    while len(queue) != 0:
        count += 1
        size = len(queue)

        for i in range(size):
            node = queue.pop(0)
            if node == end:
                return count
            for next_node in graph[node]:
                if next_node not in visited:
                    visited.append(next_node)
                    queue.append(next_node)
print(sol())
print(visited)