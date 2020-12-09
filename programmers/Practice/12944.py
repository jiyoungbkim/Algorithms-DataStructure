# 평균 구하기
# 나의 풀이
def solution(arr):
    return sum(arr)/len(arr)

# 만약 배열의 길이가 0일 가능성이 있는 경우 
# 0으로 나누면 에러가 나기 때문에 따로 검사
def solution(arr):
    if len(arr) == 0:
        return 0
    return sum(arr)/len(arr)    

# reduce, lambda 이용
from functools import reduce
def solution(arr):
    return reduce(lambda acc, cur : acc + cur, arr) / len(arr)

list = [5,3,4] 
print("평균값 : {}".format(solution(list)));