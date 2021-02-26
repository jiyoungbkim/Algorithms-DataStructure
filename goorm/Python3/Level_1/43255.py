# 약수 구하기
user_input = int(input())
for i in range(1, user_input+1):
	if user_input % i == 0 :
		print(i, end=' ')