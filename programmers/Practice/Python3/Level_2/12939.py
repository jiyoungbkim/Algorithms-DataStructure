# 최댓값과 최솟값
def solution(s):
    lst = list(map(int, s.split()))
    return str(min(lst))+" "+str(max(lst))

def solution(s):
    lst = sorted([int(i) for i in s.split()])
    return ' '.join([str(lst[0]), str(lst[len(lst)-1])])