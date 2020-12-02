# 문자열을 정수로 바꾸기
# 나의 풀이
def solution(s):    
    return int(s[1:])*-1 if s[0] == '-' else int(s)

# 10** 이용
# 하지만 런타임에러가 난다...
def solution(s):
    result = 0
    for i, n in enumerate(s[::-1]): # 4321-
        if n == '-':
            result *= -1 
        else:
            # 4 * (10 ** 0) + 3 * (10 ** 1) + 2 * (10 ** 2) + 1 * (10 ** 3)
            result += int(n) * (10 ** i)
    return result

print(solution('-1234'))