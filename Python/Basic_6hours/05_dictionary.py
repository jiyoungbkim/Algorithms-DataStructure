cabinet = {3:"banana", 100:"apple"}
print(cabinet[3]) # 값이 없으면 에러

print(cabinet.get(5)) # 값이 없으면 None출력
print(cabinet.get(5, "available")) # 값이 없으면 None대신에 넣고싶은 값 주기

print(3 in cabinet) # True

cabinet[3] = "strawberry" # 이미 있는 키는 값이 업데이트
cabinet["C-20"] = "blueberry" # 새로운 키는 값이 추가
print(cabinet)

# 키 삭제
del cabinet[100]
print(cabinet)

# 키들만 출력
print(cabinet.keys())
# 값들만 출력
print(cabinet.values())
# key, value 쌍으로 출력
print(cabinet.items())

cabinet.clear()
print(cabinet)