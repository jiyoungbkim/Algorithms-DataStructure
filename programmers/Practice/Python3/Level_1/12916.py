# 문자열 내 p와 y의 개수
# 나의 풀이
def solution(s):
    slow = s.lower()    
    return slow.count('p') == slow.count('y')

print(solution("pPoooyy"))

# 함수 연속 사용
def solution(s):
    return s.lower().count('p') == s.lower().count('y')