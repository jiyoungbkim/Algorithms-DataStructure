# 2진수 구하기
# 반복문
n = int(input('binary : '))
result = ''
while True:
    if n % 2 == 0:
        result += '0'
    else:
        result += '1'
    n = n//2
    if n == 1:
        result += str(n)
        print(result[::-1])
        break

# 재귀함수   
def binaryNum(n):
    if n < 2:
        return str(n)
    else:
        return str(binaryNum(n//2)) + str(n % 2)

print(binaryNum(11))