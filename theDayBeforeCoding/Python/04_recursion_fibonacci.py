# 피보나치
# 0 1 1 2 3 5 8 13 21
# 반복문

# 순회 전
a = 0
b = 1
print(a)
# 순회 10번
for i in range(10):
    print(b)
    a, b = b, a+b

# 재귀함수
# f(n) = f(n-1) + f(n-2)
def fibonacci(n):
    if n == 0 or n == 1:
        return 1
    return fibonacci(n-1) + fibonacci(n-2)
print(fibonacci(9))
# f(5) = (((f(1)+f(0)+f(1) + (f(1)+f(0)) + ((f(1)+f(0)+f(1)))