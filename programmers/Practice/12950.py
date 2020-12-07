# 행렬의 덧셈
# 나의 풀이
# 지능형 리스트 이용
def solution(arr1, arr2):   
    return [[arr1[i][j] + arr2[i][j] for j in range(len(arr1[0]))] for i in range(len(arr2))]

# zip()
def solution(arr1, arr2):
    return [[c + d for c, d in zip(a, b)] for a, b in zip(arr1, arr2)]

print(solution([[1,2], [2,3]], [[3,4],[5,6]]))