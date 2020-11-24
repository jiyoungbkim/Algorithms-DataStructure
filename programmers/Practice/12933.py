# 나의 풀이
def solution(n):
    lst = list(str(n))
    lst.sort(reverse=True)
    str_b = ''
    for i in lst:
        str_b += i
    return int(str_b)

# 리스트를 문자열로 바꾸는 것을 간소화
def solution(n):
    lst = list(str(n))
    lst.sort(reverse=True)
    return int(''.join(lst))

# return int("".join(sorted(list(str(n)), reverse=True)))