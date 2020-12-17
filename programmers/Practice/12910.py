# 나누어 떨어지는 숫자 배열
# 나의 풀이
def solution(arr, divisor):
    return sorted([i for i in arr if i % divisor == 0]) or [-1]