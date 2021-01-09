# 시저 암호
# 나의 풀이
def solution(s, n):
    answer = ''
    print(ord('z'))
    print(ord('a'))
    print(ord('Z'))
    print(ord('A'))
    for i in s:
        if i == ' ':
            answer += ' '
        else:
            bit = ord(i) + n
            if i.islower():               
                if bit > ord('z'):
                    bit -= 26
            else:
                if bit > ord('Z'):
                    bit -= 26                
            answer += chr(bit)
    return answer

# print(solution('AB',1))
# print(solution('z',1))
# print(solution('Z',10))
# print(solution('a B z',4))
# print(solution('aBZ',20))
# print(solution('y X Z',4))
print(solution('AaZz',25))

# 참고
def solution(s, n):
    s = list(s)
    for i in range(len(s)):
        if s[i].isupper():
            s[i]=chr((ord(s[i])-ord('A')+n)%26+ord('A'))
        elif s[i].islower():
            s[i]=chr((ord(s[i])-ord('a')+n)%26+ord('a'))
    return ''.join(s)
    
print(solution('AaZz',25)) # ZzYy