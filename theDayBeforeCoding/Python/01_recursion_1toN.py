# 반복문 합 #O(n)
x = 0
n = 100
for i in range(1, n+1):
    x += i
print(x)

# 시그마 공식 : n*(n+1)//2 #O(1)
x = 0
n = 100
x = n*(n+1)//2
print(x)

# 재귀 함수 합
def f(n):
    if n <= 1:
        return 1
    else:
        return n + f(n-1)
print(f(100))

# 반복문 곱 : factorial
x = 1
n = 5
for i in range(1, n+1):
    x *= i
print(x)

# 재귀함수 곱
def f(n):
    if n <= 1:
        return 1
    else:
        return n * f(n-1)
print(f(5))