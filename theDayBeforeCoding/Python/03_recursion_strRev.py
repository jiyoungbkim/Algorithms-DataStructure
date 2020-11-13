# 문자열 뒤집기
# 반복문
result = ''
for i in 'leehojun':
    result = i + result
print(result)

# 재귀함수
def strReverse(str):
    if str == '':
        return ''
    else:
        return strReverse(str[1:]) + str[0]
print(strReverse('leehojun'))

# 각 자릿수의 합
# 반복문
x = 0
for i in '2231':
    x += int(i)
print(x)

# 재귀함수
def strSum(num):
    if num == '':
        return 0
    else:
        return int(num[0]) + int(strSum(num[1:])) 
print(strSum('2231'))