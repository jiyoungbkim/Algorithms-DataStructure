# 076
# 2차원 배열 Slicing

# 테스트 케이스 수
# 수색할 도시의 크기 a와 수색반이 한번에 수색 가능한 범위 b 입력 받을 경우
# case = int(input())
# for i in range(case):
#     a, b = list(map(int, input('a, b : ').split()))
# mine = []
# for i in range(a):
#     mine.append(list(map(int, input().split())))

a = 5
b = 3

mine = [[1, 0, 0, 1, 0],
        [0, 1, 0, 0, 1],
        [0, 0, 0, 1, 0],
        [0, 0, 0, 0, 0],
        [0, 0, 1, 0, 0]]
# 수색 범위에서 지뢰의 수
cnt = 0
for x in range(b):
    for y in range(b):
        # 지뢰밭에서 수색 가능 지역을 슬라이싱으로 추출 
        # sum 함수를 사용하기 위해 2차원 배열을 1차원 배열로 만들기 sum(list, [])          
        answer = sum(sum([row[x:x+b] for row in mine[y:y+b]],[]))      
        # sum(): 리스트의 값을 모두 더한 값을 비교하여 더 큰 값으로 교환
        if cnt < answer:
            cnt = answer    
print(cnt)       