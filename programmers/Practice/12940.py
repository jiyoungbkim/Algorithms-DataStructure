# 최대공약수와 최소공배수
# 나의 풀이
import math
def solution(n, m):
    return [math.gcd(n,m), n * m // math.gcd(n,m)]

# 유클리드 호제법
def solution(n, m):
    c, d = max(n, m), min(n, m)
    while d:
        c, d = d, c % d
    return [c, n * m // c]

def solution(n, m):
    for i in range(n):
        if n % (n - i) + m % (n - i) == 0:
            return [n - i, n * m / (n - i)]