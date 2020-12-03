# 수박수박수박수박수박수?
# 나의 풀이
def solution(n):
    answer = ''
    for i in range(1, n+1):
        answer += '수' if i % 2 != 0 else '박'
    return answer

# 참고
def solution(n):
    return "수박" * (n//2) + "수" * (n % 2)

print(solution(4))