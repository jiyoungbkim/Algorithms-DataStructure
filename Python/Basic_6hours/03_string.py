hello = "안녕하세요"
print(hello[0:2]) # 안녕
print(hello[:5]) # 처음부터 5앞까지
print(hello[-5:]) 

python = "Python is Amazing"
print(python.lower()) # python is amazing
print(python.upper()) # PYTHON IS AMAZING
print(python[0].isupper()) # True
print(python[0].islower()) # False
print(len(python)) # 17
print(python.replace("Python","Java")) # Java is Amazing

index = python.index("n")
print(index) # 5
index = python.index("n", index + 1) # 앞에서 찾은 위치 다음에 나오는 n찾기
print(index) # 15

print(python.find("Java")) # -1
# print(python.index("Java")) 에러

print(python.count("n")) # 2

# 방법 1
print("I am %dyears old." % 20)
print("I like %s a lot." % "python")
print("Apple starts %c." % "A")
# %s
print("I am %syears old." % 20)
print("I like %s and %s." % ("blue", "red"))

# 방법 2
print("I am {}years old." .format(20))
print("I like {} and {}." .format("blue", "red"))
print("I like {1} and {0}." .format("blue", "red")) # 순번에 맞춰 출력

# 방법 3
print("I am {age}years old, I like {color}.".format(age=20, color="blue"))

# 방법 4 (v3.6 이상~)
age = 20
color = "yello"
print(f"I am {age}years old, I like {color}.")

# \r : 커서를 맨 앞으로 이동
print("Red Apple\rPine") # PineApple

# \b : 백스페이스 (한 글자 삭제)
print("Redd\b Apple") # Red Apple

#Quiz 사이트별로 비밀번호를 만들어 주는 프로그램
# 1 : http:// 제외
# 2 : 처음 만나는 점(.) 이후 부분은 제외
# 3 : 남은 글자 중 처음 세자리 + 글자 개수 + 글자 내 'e'개수 + "!"로 구성
# nav51!
arr = "http://naver.com"
password = arr[7:arr.index(".")]
print(password[:3]+str(len(password))+str(password.count("e"))+"!")
#해설
url = "http://naver.com"
my_str = url.replace("http://","") # 1
my_str = my_str[:my_str.index(".")] # 2
password = my_str[:3] + str(len(my_str)) + str(my_str.count("e")) + "!"
print("{0}의 비밀번호는 {1}입니다.".format(url, password))