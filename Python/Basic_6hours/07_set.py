# set 
# 중복 안됨, 순서 없음
my_set = {1, 2, 3, 3, 3}
print(my_set) # {1, 2, 3}

java = {"Jully", "Maria", "Amie"}
python = set(["Jully","Edie"])

# 교집합 
print(java & python)
print(java.intersection(python))

# 합집합
print(java | python)
print(java.union(python))

# 차집합
print(java - python)
print(java.difference(python))

# 값을 추가
python.add("Maria")
print(python)

# 값을 제외
java.remove("Amie")
print(java)

# 자료구조의 변경
# 커피숍
menu = {"coffee", "milk", "Juice"}
print(menu, type(menu)) # <class 'set'>

menu = list(menu)
print(menu, type(menu)) # <class 'list'>

menu = tuple(menu)
print(menu, type(menu)) # <class 'tuple'>

menu = set(menu)
print(menu, type(menu)) 