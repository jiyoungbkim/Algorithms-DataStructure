# 075
n = list(map(int, input('369 : ')))
l = len(n)
three = {3:1,6:2,9:3}
result = 0
for i in n:
    result += three[i] * 3**(len(n)-1)
    n.pop(0)
result += three[n[0]]
print(result)

# def sol(n):
#     n = list(str(n))
#     answer = 0
#     count = 1
#     d = {3 : 1, 6 : 2, 9 : 3}
    
#     while n:
#         answer += d[int(n.pop())] * count
#         count *= 3
        
#     return answer
# print(sol(93))