# 나의 풀이
def solution(n, k):
  cnt = 0
  while n > 1:
    if n % k == 0:
      n = n//k
      cnt += 1
    else:
      n -= 1
      cnt += 1
  return cnt
print(solution(17, 4))

# 해설
n, k = map(int, input().split())
result = 0
while True:
    # N이 K로 나누어 떨어지는 수가 될 때까지 빼기
    target = (n // k) * k
    result += (n - target)
    n = target
    if n < k:
        break
    result += 1
    n //= k
# 마지막으로 남은 수에 대하여 1씩 빼기
result += (n - 1)
print(result)