# 큰 수의 법칙
n, m, k = map(int, input().split())
data = list(map(int, input().split()))

data.sort()
first = data[n-1]
second = data[n-2]

answer = 0
while True:
    for i in range(k):
        if m == 0 :
            break
        answer += first
        m -= 1
    if m == 0 :
        break
    answer += second
    m -= 1

print(answer)

# 반복되는 수열
n, m, k = map(int, input().split())
data = list(map(int, input().split()))

data.sort()
first = data[n-1]
second = data[n-2]
# 가장 큰 수가 더해지는 횟수 계산
cnt = int(m/(k+1)) * k + m % (k+1)
answer = cnt * first + (m-cnt) * second

print(answer)