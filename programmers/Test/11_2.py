cnt = 0
zero = 0
def solution(s):
    answer = []    
    global cnt
    global zero
    
    if len(s) == 0:
        return -1    
    if s != '1':
        cnt += 1
        remove = 0
        for i in s:            
            if i == '0':
                remove += 1
        zero += remove
        l = len(s) - remove
        print(str(bin(l)[2:]))
        solution(str(bin(l)[2:]))   
    answer.append(cnt)
    answer.append(zero)  
    return answer

print(solution('110010101001'))