# 하샤드 수
# 숫자 각 자릿수의 합
def solution(x):
    num = x
    sum = 0
    while num != 0:
        sum += num % 10
        num -= num % 10
        num /= 10
    return x % sum == 0

print(solution(10))
print(solution(11))

# 배열로 만든 후 합
def solution(x):
    return x % (sum([int(i) for i in str(x)])) == 0

print(solution(10))
print(solution(11))