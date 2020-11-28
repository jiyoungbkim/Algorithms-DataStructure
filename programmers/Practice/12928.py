# 약수의 합
# 나의 풀이
def solution(n):
    answer = 0
    for i in range(1, n+1):
        if n % i == 0:
            answer += i
    return answer

# 절반까지만 검사하면 된다.
def solution(n):
    return n + sum([i for i in range(1, (n//2)+1) if n % i == 0])