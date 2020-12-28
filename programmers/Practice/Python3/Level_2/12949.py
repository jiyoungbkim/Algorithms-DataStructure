# 행렬의 곱셉
def solution(arr1, arr2):
    answer = [[0 for col in range(len(arr2[0]))] for row in range(len(arr1))]
    for y1 in range(len(arr1)):
        for x2 in range(len(arr2[0])):
            for x1 in range(len(arr1[0])):
                answer[y1][x2] += arr1[y1][x1] * arr2[x1][x2]
    return answer
    
# zip(*arr)
# 행 -> 열로 변환
# zip(*[[1,2], [3,4], [5,6]]) 
# >> [(1, 3, 5), (2, 4, 6)]
def productMatrix(arr1, arr2):
    return [[sum(a*b for a, b in zip(arr1_row,arr2_col)) for arr2_col in zip(*arr2)] for arr1_row in arr1]