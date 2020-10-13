# 나의 풀이
from random import *
count = 0
for customer in range(1, 51):
    time = randint(5, 50)
    if 5 <= time <= 15:
        count += 1
        ok = "o"
    else:
        ok = " "
    print("[{0}] {1}번째 손님 (소요시간 : {2}분)".format(ok, customer, time))
print("총 탑승 승객 : {0} 분".format(count))

# 해설
cnt = 0 # 총 탑승 승객 수
for i in range(1, 51): # 승객 수
    time = randrange(5, 51)  # 5~50분 소요 시간
    if 5 <= time <= 15: # 매칭 성공, 탑승 승객 수 증가
        print("[o] {0}번째 손님 (소요시간 : {1}분)".format(i, time))
        cnt += 1
    else: # 매칭 실패
        print("[ ] {0}번째 손님 (소요시간 : {1}분)".format(i, time))
print("총 탑승 승객 : {0} 분".format(cnt))