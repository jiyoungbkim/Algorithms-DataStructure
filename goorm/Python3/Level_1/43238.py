# 소수 판별
from math import *
def solution(n):
    isPrime = True
    for i in range(2, int(sqrt(n))+1):
        if n % i == 0:
            isPrime = False 
    return isPrime
print(solution(7))