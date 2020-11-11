# 반복문
n = int(input('binary : '))
result = ''
while True:
    if n % 2 == 0:
        result += '0'
    else:
        result += '1'
    n = n//2
    if n == 1 or n == 0:
        result += str(n)
        print(result[::-1])
        break
