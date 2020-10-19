# 나의 풀이
num = input("numbers : ")
l = []
result = 0
for i in range(len(num)):
    l.append(int(num[i]))
print(l)
for i in range(len(l)):
    if l[i] == 0 or result == 0:
        result += l[i]
    else:
        result *= l[i]
print(result)

# 해설
data = input()
# 첫 번째 문자를 숫자로 변경하여 대입
result = int(data[0])

for i in range(1, len(data)) :
    # 두 수 중에서 하나라도 '0'혹은 '1'인 경우, 더하기 수행
    num = int(data[i])
    if num <= 1 or result <= 1:
        result += num
    else:
        result *= num
print(result)