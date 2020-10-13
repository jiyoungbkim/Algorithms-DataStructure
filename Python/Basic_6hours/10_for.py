for waiting_no in [0, 1, 2, 3, 4]:
    print("대기번호 : {0}".format(waiting_no))
print()
for waiting_no in range(1, 6): # 1부터 6-1까지의 범위
    print("대기번호 : {0}".format(waiting_no))
print()
for waiting_no in range(1, 10, 2): # 1부터 10-1까지의 범위에서 앞뒤의 숫자가 2만큼의 차이를 가짐
    print("대기번호 : {0}".format(waiting_no)) 
print()
starbucks = ["아이언맨","토르","아이엠 그루트"]
for customer in starbucks:
    print("{0}, 커피가 준비되었습니다.".format(customer))

# 한줄 for문 
# 리스트에 전부 100을 더하기
students = [1,2,3,4,5]
students = [i+100 for i in students]
print(students) # [101, 102, 103, 104, 105]

# 학생 이름을 길이로 변환
students = ["Iron man", "Thor", "I am groot"]
students = [len(i) for i in students]
print(students)

# 학생 이름을 대문자로 변환
students = ["Iron man", "Thor", "I am groot"]
students = [i.upper() for i in students]
print(students)