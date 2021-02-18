def solution(n):
    bi = bin(n)[2:]
    if '0' not in bi:
        return 0
    elif bi.count('1') == 1:
        return 0   
    else :
        result = 0
        lst = []   
        for i in bi:
            if i == '1':
                lst.append(result)
                result = 0
            elif i == '0':
                result += 1
        return max(lst)
print(solution(1041))
print(solution(32))
print(solution(15))