# 짝수와 홀수
# 나의 풀이
def solution(num):
    return "Even" if num%2==0 else "Odd"

# num%2가 0이 아닐 때만 True로 and 조건이 성립
def evenOrOdd(num):
    return num % 2 and "Odd" or "Even"

# 2진 비트 : 1번째 비트에 의해 홀짝이 결정 
# 짝수면 [0 & 1]로 리스트 인덱스 0인 "Even"이 리턴
def evenOrOdd(num):
    return ["Even", "Odd"][num & 1]