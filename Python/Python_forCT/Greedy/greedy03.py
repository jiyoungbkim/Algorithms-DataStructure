# 숫자 카드 게임
# n, m = map(int, input().split())
# result = 0
# for i in range(n):
#     data = list(map(int, input().split()))
#     min_value = min(data)
#     result = max(result, min_value)
# print(result)

def solution(lst):
    result = 0
    for i in range(len(lst)):
        result = max(result, min(lst[i]))
    return result

print(solution([[3,1,2],[4,1,4],[2,2,2]]))