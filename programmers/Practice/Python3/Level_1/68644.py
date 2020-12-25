# 두 개 뽑아서 더하기
# 나의 풀이
def solution(numbers):
    answer = []
    for i in range(len(numbers)):
        x = numbers.pop(i)
        for j in numbers:
            if (x + j) not in answer:
                answer.append(x + j)
        numbers.insert(i, x)
    answer.sort()
    return answer

# 개선한 풀이
# 중복 제거를 나중에 해주는 편이 속도가 빠름
def solution(numbers):
    answer = []
    for i in range(len(numbers)):
        x = numbers.pop(i)
        for j in numbers:
            answer.append(x + j)
        numbers.insert(i, x)
    return sorted(list(set(answer)))

# 참고
def solution(numbers):
    answer = [numbers[i]+numbers[j] for i in range(len(numbers)) for j in range(len(numbers)) if i != j]
    return sorted(list(set(answer)))

# combinations
from itertools import combinations
def solution(numbers):
    answer = []
    lst = list(combinations(numbers, 2))
    for i in lst:
        answer.append(i[0]+i[1])
    return sorted(list(set(answer)))