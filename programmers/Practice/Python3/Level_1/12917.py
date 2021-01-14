# 문자열 내림차순으로 배치
# 나의 풀이
# str이 정렬이 안된다는 에러메시지를 보고 아스키로 변환해서 했으나 sorted로 하면 되는 것
def solution(s):
    lst = sorted([ord(i) for i in s], reverse= True)    
    return ''.join([chr(i) for i in lst])

# sorted()
def solution(s):
    return ''.join(sorted(s, reverse=True))