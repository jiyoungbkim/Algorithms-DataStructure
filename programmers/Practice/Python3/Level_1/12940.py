# 최대공약수와 최소공배수
# 나의 풀이
import math
def solution(n, m):
    return [math.gcd(n,m), n * m // math.gcd(n,m)]

# 재귀함수
def solution(n, m):
    return [gcd(n,m), n*m//gcd(n,m)]
    
def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)

# 재귀함수 람다식
def solution(n, m):
    gcd = lambda a, b : a if b == 0 else gcd(b, a%b)
    lcm = lambda a, b : a*b//gcd(a, b)
    return [gcd(n, m), lcm(n, m)]
    
# 유클리드 호제법
def solution(n, m):
    a, b = max(n, m), min(n, m)
    while b:
        a, b = b, a % b
    return [a, n * m // a]

def solution(n, m):
    for i in range(n):
        if n % (n - i) + m % (n - i) == 0:
            return [n - i, n * m / (n - i)]