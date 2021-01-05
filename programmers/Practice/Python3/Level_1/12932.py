# 자연수 뒤집어 배열로 만들기
# 나의 풀이
def solution(n):
    lst = list(str(n))
    lst.reverse()
    answer = [int(i) for i in lst]
    return answer

# reversed 활용
def solution(n):
    return list(map(int, reversed(str(n))))

# [::-1] 활용
def solution(n):
    return [int(i) for i in str(n)][::-1]