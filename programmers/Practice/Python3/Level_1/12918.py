# 문자열 다루기 기본
# 나의 풀이
def solution(s):
    return (len(s) == 4 or len(s) == 6) and s.isdecimal()

# len(s) 값이 [4,6]리스트에 포함되어 있나
def solution(s):
    return s.isdigit() and len(s) in (4, 6)

# 정규식
# ^와 $는 문자열의 처음과 끝을 의미. \d는 숫자를 의미, 
# {4}|{6}은 숫자가 4번 혹은 6번 반복되는 것, bool로 true/false를 리턴
def alpha_string46(s):
    import re
    return bool(re.match("^(\d{4}|\d{6})$", s))
    #return bool(re.match("^([0-9]{4}|[0-9]{6})$", s))