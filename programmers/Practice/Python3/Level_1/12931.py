# 자릿수 더하기
# 나의 풀이
def solution(n):
    return sum([int(i) for i in str(n)])

# map
def sum_digit(number):
    return sum(map(int,str(number)))

# 재귀함수 + 자릿수 줄이기
def sum_digit(number):
    if number < 10:
        return number
    return (number % 10) + sum_digit(number // 10) 