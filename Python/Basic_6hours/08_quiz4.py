# 파이썬 코딩대회 댓글 이벤트
# 댓글 작성자 중 추첨을 통해 1명은 치킨, 3명은 커피 쿠폰을 주는 추첨 프로그램 작성
# 조건 1: 20명이 작성 아이디는 1~20이라고 가정
# 조건 2: 댓글 내용과 상관없이 무작위로 추첨하되 중복 불가
# 조건 3: random 모듈의 shuffle과 sample을 활용

# 나의 풀이
id = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
from random import *
shuffle(id)

chicken = sample(id, 1)
id.remove(chicken[0]) # 이미 당첨된 값 삭제

coffee = sample(id, 3)

print(f"""-- 당첨자 발표 --
치킨 당첨자 : {chicken[0]}
커피 당첨자 : {coffee}
-- 축하합니다 --""")

# 해설
users = range(1, 21) # 1~20까지 숫자를 생성
# print(type(users)) # <class 'range'>
users = list(users) # list로 바꾸기
# print(type(users)) # <class 'list'>

print(users)
shuffle(users)
print(users)

winners = sample(users, 4) # 중복을 막기위해 한번에 뽑기

print("-- 당첨자 발표 --")
print("치킨 당첨자 : {0}".format(winners[0]))
print("커피 당첨자 : {0}".format(winners[1:]))
print("-- 축하합니다 --")