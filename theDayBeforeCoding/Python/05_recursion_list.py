# 리스트의 합과 곱
# 반복문
s = 0
for i in [100, 200, 300, 400]:
    s += i
print(s)

# 재귀함수
def s(l):
    if len(l) == 1:
        return l[0]
    else:
        return l[0] + s(l[1:])
print(s([100, 200, 300, 400]))

# 제곱 구하기
# 반복문
print(2**6)
result = 1
for i in range(6):
    result *= 2
print(result)

def f(n, e):
    result = 1
    for i in range(e):
        result *= n
    return result
print(f(2, 6))

# 재귀함수
def f(n, e):
    if e == 1:
        return n
    else:
        return n * f(n, e-1)
print(f(2, 6))

# 콤마
def comma(s):
    if len(s) < 3:
        return s
    else:
        return comma(s[:len(s)-3])+','+s[len(s)-3:]
print(comma('10000000'))

# 내장함수
n = 10000000
n = format(n, ',')
print(n)