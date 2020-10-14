print("Python", "Java", sep=", ", end="? ")
print("무엇이 더 재밌을까요?")

import sys
print("Python", "Java", file=sys.stdout) # 포준 출력
print("Python", "Java", file=sys.stderr) # 표준 에러로 처리

# 출력 포맷
scores = {"math":0, "eng":50, "codding":100}
for subject, score in scores.items():
    #print(subject, score)
    # 8칸의 공간을 확보해서 왼쪽 정렬, 4칸의 공간을 확보해서 오른쪽 정렬
    print(subject.ljust(8), str(score).rjust(4), sep=":") 

# 은행 대기순번표 001, 002...
for num in range(1, 21):
    print("대기번호 : " + str(num).zfill(3)) # 3크기 만큼 확보하고 나머지 빈공간에 대해서는 0으로 채운다

# 표준 입력
# 사용자 입력은 항상 문자열 형태
# answer = input("아무 값이나 입력하세요 : ") 
# print("입력하신 값은 " + answer + "입니다.")

# 다양한 출력포맷
# 빈 자리는 빈공간으로 두고, 오른쪽 정렬을 하되, 총 10자리 공간을 확보
print("{0: >10}".format(500)) # 500
# 양수일 때 +로 표시, 음수일 땐 -로 표시
print("{0: >+10}".format(500)) # +500
print("{0: >+10}".format(-500)) # -500
# 왼쪽 정렬하고, 빈칸으로 _로 채움
print("{0:_<+10}".format(500)) # +500______

# 3자리 마다 콤마를 찍어주기
print("{0:,}".format(100000000000)) # 100,000,000,000
# 3자리 마다 콤마를 찍어주기, +- 부호도 붙이기
print("{0:+,}".format(100000000000)) # +100,000,000,000
# 3자리 마다 콤마를 찍어주기, 부호도 붙이고, 자릿수 확보하기
# 돈이 많으면 행복하니까 빈자리는 ^로 채워주기
print("{0:^<+30,}".format(100000000000)) # +100,000,000,000^^^^^^^^^^^^^^

#소수점 출력
print("{0:f}".format(5/3)) # 1.666667
# 소수점 특정 자리수까지만 표시 (소수점 3번째 자리에서 반올림)
print("{0:.2f}".format(5/3)) # 1.67