# 서울에서 김서방 찾기
# 나의 풀이
def solution(seoul):
    return f"김서방은 {seoul.index('Kim')}에 있다"

# {} .format
def solution(seoul):
    return '김서방은 {}에 있다'.format(seoul.index('Kim'))
    
print(solution(["Queen", "Tod", "Kim"]))