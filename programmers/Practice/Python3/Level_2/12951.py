# JadenCase 문자열 만들기
def solution(s):
    lst = s.lower().split(' ')
    return ' '.join([i.capitalize() for i in lst])

# capitalize()는 첫문자만 대문자로 바꿔주기 때문에 lower함수를 쓸필요 없음
def solution(s):
    return ' '.join([i.capitalize() for i in s.split(' ')])
python = "Python is Amazing"
print(python.capitalize())

# 처음의 아이디어
# 문자열을 인덱싱으로 바꾸는 것은 불가능하기 때문에 생각해본 슬리이싱을 이용한 방법
def solution(s):
    lst_lo = s.lower().split(' ')
    lst_up = s.upper().split(' ')
    
    return ' '.join([lst_up[i][:1]+lst_lo[i][1:] for i in range(len(lst_lo))])

# 개선
def solution(s):
    lst = s.split(' ')    
    return ' '.join([lst[i][:1].upper()+lst[i][1:].lower() for i in range(len(lst))])