# 문자열 다루기 기본
# 나의 풀이
def solution(s):
    return (len(s) == 4 or len(s) == 6) and s.isdecimal()

# len(s) 값이 [4,6]리스트에 포함되어 있나
def solution(s):
    return s.isdigit() and len(s) in (4, 6)