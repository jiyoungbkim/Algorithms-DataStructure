# 3진법 뒤집기
def solution(n):
    triStr = ''
    def ternaryNum(n):
        if n < 3:
            return str(n)
        else:
            return str(n%3) + str(ternaryNum(n//3))
    triStr = ternaryNum(n)

    l = len(triStr)-1
    answer = 0
    for i in range(len(triStr)):
        answer += int(triStr[i]) * (3**(l-i)) 
        
    return answer
print(solution(45))
    
# 반복문
def solution(n):
    answer = 0
    cnt = 1
    a = ''
    while n > 0:
        a += str(n%3)
        n = n//3
    for b in range(len(a),0,-1):
        answer += (int(a[b-1])*cnt)
        cnt *= 3
    return answer
print(solution(45))