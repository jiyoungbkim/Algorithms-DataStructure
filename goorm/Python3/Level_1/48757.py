# 369게임
user_input = int(input())
result = 0
for i in range(1, user_input):
    for j in str(i):
	    if j in ('3','6','9'):
		    result += 1
print(result)