# 예산
# 나의 풀이
def solution(d, budget):    
    d.sort()
    answer = 0
    for i in d:
        budget -= i
        if budget < 0:
            break
        answer += 1
    return answer

print(solution([1,2,5,4,3], 9))

# 참고
# 시간 복잡도 O(n^2)이라서 반복문O(n)이 낫지만, 아이디어는 참고할만하다
def solution(d, budget):
    d.sort()
    while budget < sum(d):
        d.pop()
    return len(d)