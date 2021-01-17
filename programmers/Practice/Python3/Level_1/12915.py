# 문자열 내 마음대로 정렬하기
# 나의 풀이
def solution(strings, n):
    return sorted(strings, key=lambda x: (x[n], x))

# +도 가능
def solution(strings, n):
    return sorted(strings, key=lambda x: x[n] + x)