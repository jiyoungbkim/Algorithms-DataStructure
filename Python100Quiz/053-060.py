# 053
par = input("perenthesis : ")
left = []
right = []
b = True
for i in par:
    if i == '(':
        left.append(i)
    else:
        if len(left) > len(right):
            right.append(i)
        else:
            b = False

print("YES") if b and len(left)==len(right) else print("NO")

# 054
n = list(map(int, input("stamp : ").split(' ')))
stamp_list = list(range(min(n), len(n)+1))
n.sort()
if n == stamp_list:
    print('YES')
else:
    print('NO')

# 055
move_route = []
def hanoi(n_disks, start, goal, temp):
    # 원반이 한개일 때에는 옮기면 됩니다.
    if n_disks == 1:
        move_route.append([start, goal])
        return None
    # 원반의 n-1개를 경유기둥으로 옮기고
    hanoi(n_disks-1, start, temp, goal)
    # 가장 큰 원반은 목표기둥으로
    move_route.append([start, goal])
    # 경유기둥과 시작기둥을 바꿉니다!
    hanoi(n_disks-1, temp, goal, start)
user_input = int(input("Tower of Hanoi : "))
hanoi(user_input,'A','C','B')
print(move_route)
print(len(move_route))

# 056
nationWidth = {
    'korea': 220877,
    'Rusia': 17098242,
    'China': 9596961,
    'France': 543965,
    'Japan': 377915,
    'England' : 242900 
    }
w = nationWidth['korea']
nationWidth.pop('korea')
l = list(nationWidth.items())
gap = max(nationWidth.values())
item = 0
for i in l:
    if gap > abs(i[1]-w):
        gap = abs(i[1]-w)
        item = i
print(item[0],item[1]-w)

# 057
l = str(list(range(1001)))
print(l.count('1'))

def count(n):
	countN = str(list(range(n+1))).count('1')
	return countN
print(count(1000))

# 058
n = int(input('comma : '))
result = format(n, ',')
print(result)

# 059
s = input("middle : ")
print(f'{s:=^50}')

# 060
student = ['강은지','김유정','박현서','최성훈','홍유진','박지호','권윤일','김채리','한지호','김진이','김민호','강채연']
student.sort()
for i, j in enumerate(student, 1):
    print(f'번호: {i}, 이름: {j}')