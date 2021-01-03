# 정수 제곱근 판별
# 나의 풀이
from math import *
def solution(n):
    answer = -1
    if sqrt(n) == int(sqrt(n)):
        answer = (sqrt(n)+1)**2
    return answer

# 모듈을 사용하지 않는 방법
# 루트(제곱근)는 1/2제곱(0.5제곱)
def solution(n):
    answer = -1
    # 정수는 1로 나눈 나머지가 0
    if n ** 0.5 % 1 == 0:
        answer = (n ** 0.5 + 1) ** 2
    return answer