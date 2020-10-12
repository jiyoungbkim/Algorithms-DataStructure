print(abs(-5)) # 5
print(pow(4, 2)) # 4^2 = 4*4 = 16
print(max(5, 12)) # 12
print(min(5, 12)) # 5
print(round(3.14)) # 3
print(round(4.99)) # 5

from math import *
print(floor(4.99)) # 4
print(ceil(3.14)) # 4
print(sqrt(16)) # 4.0

from random import *
print(random()) # 0.0 ~ 1.0 미만의 임의의 값 생성
print(random() * 10) # 0.0 ~ 10.0 미만의 임의의 값 생성
print(int(random() * 10) + 1) # 1 ~ 10 이하의 임의의 정수값 생성

print(int(random() * 45) + 1) # 1 ~ 45 이하의 임의의 정수값 생성
print(randrange(1, 46)) # 1 ~ 46 미만의 임의의 정수값 생성
print(randint(1, 45)) # 1 ~ 45 이하의 임의의 정수값 생성

#Quiz 월별 스터디 날짜
from random import *
sDay = randint(4, 28)
print("오프라인 스터디 모임 날짜는 매월 "+str(sDay)+"일로 선정되었습니다.")