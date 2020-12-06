# x만큼 간격이 있는 n개의 숫자
# 나의 풀이
# x만큼 간격에서 -> range함수 
# 하지만 x가 0,양수,음수인 경우를 각각 처리해주어야함
def solution(x, n):
    answer = []
    if x == 0:
        answer = [0] * n
    elif x > 0 :
        answer = [i for i in range(x, x*n+1, x)]
    else:
        answer = [i for i in range(x, x*n-1, x)]
    return answer

# 참고
# x를 연산에 이용하여 x가 음수인지 양수인지 상관없이 리스트를 만들 수 있다.
def solution(x, n):
    return [x * i for i in range(1, n+1)]