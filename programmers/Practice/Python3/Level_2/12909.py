# 올바른 괄호
def solution(s):
    bk = 0
    for i in s:
        if bk < 0:
            break
        bk = bk + 1 if i == '(' else bk - 1 if i == ')' else bk
    return bk == 0
# 스택
def solution(s):
    lst = []
    for c in s:
        if c == '(':
            lst.append(c)
        if c == ')':
            try :
                lst.pop()
            except IndexError:
                return False
    return len(lst) == 0