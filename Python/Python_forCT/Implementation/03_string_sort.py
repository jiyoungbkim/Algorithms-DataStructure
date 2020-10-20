# 나의 풀이
data = input("str + int : ")
al_list = []
num = 0
for i in data:
    if i.isalpha():
        al_list.append(i)
    else:
        num += int(i)
al_list.sort()
print(''.join(al_list), num, sep='')

# 해설
data = input()
result = []
value = 0

# 문자를 하나씩 확인하며
for x in data:
    # 알파벳인 경우 결과 리스트에 삽입
    if x.isalpha():
        result.append(x)
    # 숫자는 따로 더하기
    else :
        value += int(x)
# 알파벳을 오름차순으로 정렬
result.sort()

# 숫자가 하나라도 존재하는 경우 가장 뒤에 삽입
if value != 0:
    result.append(str(value))
    
# 최종 결과 출력(리스트를 문자열로 변환하여 출력)
print(''.join(result))