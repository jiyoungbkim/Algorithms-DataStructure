# 두 정수 사이의 합
# 나의 풀이
def solution(a, b):
    # n, m = min(a,b), max(a,b)
    # return sum([i for i in range(n,m+1)])
    return sum(range(min(a,b),max(a,b)+1))

# 가우스 공식
# (작은 수와 큰 수 사이의 정수의 개수 * (작은 수 + 큰 수)) // 2
# n(x+y)//2 == ((y-x)+1)(x+y)//2
def solution(a, b):
    return (abs(a-b)+1)*(a+b)//2