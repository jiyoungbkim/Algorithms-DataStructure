# 061
input_data = input("al.num : ")
data_set = list(set(input_data))
data_set.sort()
data_count = [input_data.count(i) for i in data_set]
for i in range(len(data_set)):
    print(data_set[i], data_count[i], sep="", end="")
print()

user_input = input()
s = ''
storeString = user_input[0]
count = 0
for i in user_input:
    if i == storeString:
        count += 1
    else:
        s += storeString + str(count)
        storeString = i
        count = 1
s += storeString + str(count)
print(s)

# 063
data = input("abbreviation : ").split(' ')
for i in data:
    print(i[0],sep="",end="")
print()

# 064
n = int(input('N : '))
result = 0

while True:
    if n%7 == 0:
        result += n//7
        print(result)
        break
    n -= 3
    result += 1
    if n < 0:
        print(-1)
        break

# 065
a = [1,2,3,4]
b = ['a','b','c','d']

c = []
count = 0

for i, j in zip(a, b):
    if count % 2 == 0:
        c.append([i, j])
    else:
        c.append([j, i])
    count += 1
print(c)

# 066
blocks = ['ABCDEF', 'BCAD', 'ADEFQRX', 'BEDFG', 'AEBFDGCH']
rule = 'ABCD'
def solution(blocks, rule):
    answer = []
    for b in blocks:
        answer.append(order_check(b, rule))
    return answer

def order_check(b, rule):
    tmp = rule.index(rule[0])
    for text in b:
        if text in rule:
            if tmp > rule.index(text):
                return '불가능'
            tmp = rule.index(text)
    return '가능'
print(solution(blocks, rule))

# 067
n = int(input('Handshake :'))
x = 0
for i in range(1, n//2):
    x += i
    if x > n:
        break
print(i-(x-n), i+1)

def solution(n):
    people = 0
    total = 0
    while(True):
        total = people*(people-1)/2
        if n < total:
            break
        people+=1
    times = int(people-(total-n)-1)
    return [times, people]

# 068
schedule = ["12:30","13:20","14:13"]
present = '12:40'
p = list(map(int, present.split(':')))
result = []
for i in schedule:
    h = list(map(int, i.split(':')))
    remain = (h[0]*60 + h[1]) - (p[0]*60 + p[1])
    if remain < 0 :
        result.append('지나갔습니다')
    else:
        a = remain // 60
        b = remain % 60
        result.append(str(a).zfill(2)+'시간 '+str(b).zfill(2)+'분')
print(result)

# 069
def isPrime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

n = int(input('Goldbach\'s conjecture : '))
a = n//2
b = n//2
if a%2 == 0:
    a -= 1
    b += 1
while True:
    if isPrime(a) and isPrime(b):
        break
    else :
        a -= 2
        b += 2
print(a, b)