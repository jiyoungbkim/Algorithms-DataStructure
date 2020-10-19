# 나의 풀이
num = int(input("How many people : "))
fear = list(map(int, input("fear : ").split(' ')))
fear.sort()
print(fear, num)
group = 0
people = 0
for i in range(len(fear)):
    need = fear[i]               
    people += 1
    if need <= people:
        group += 1
        people = 0        
print(group)

# 해설
n = int(input())
data = list(map(int, input().split()))

result = 0 # 총 그룹의 수
count = 0 # 현재 그룹에 포함된 모험가의 수

for i in data: # 공포도를 낮은 것부터 하나씩 확인하며
    count += 1 # 현재 그룹에 해당 모험가를 포함시키기
    if count >= i: # 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
        result += 1 # 총 그룹의 수 증가
        count = 0 # 현재 그룹에 포함된 모험가의 수 초기화
print(result)