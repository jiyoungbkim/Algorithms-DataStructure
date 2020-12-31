# 콜라츠 추측
# 나의 풀이
def solution(num):
    for i in range(500):
        if num != 1:
            num = num / 2 if num % 2 == 0 else num * 3 + 1  
        else:
            return i
    return -1

print(solution(16))