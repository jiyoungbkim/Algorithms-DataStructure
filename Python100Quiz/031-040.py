# # 032
# data = input("count word : ").strip().split(" ")
# print(len(data))

# # 033
# rev = list(map(int, input("reverse : ").split()))
# rev.reverse()
# for i in range(len(rev)):
#     print(rev[i], end=" ")
# print()

# n = input()
# l = list(n.strip().split())
# len1 = len(l) - 1
# for i in range(len1, -1, -1):
#     print(l[i], end=' ')
# print()

# # 034
# h = input("height ")
# h_list = list(h.strip().split())
# hl_sort = sorted(h_list)
# cnt = 0 
# for i in range(len(h_list)):       
#     if h_list[i] != hl_sort[i]:
#         print("NO")
#         break
#     else:
#         cnt += 1
# if cnt == len(h_list):
#     print("YES")

# h = input("height ")
# h_list = list(h.strip().split())
# if h_list != sorted(h_list):
#     print("NO")
# else :
#     print("YES")

# # 035
# def one(n):
#     def two(value):
#         return value ** n
#     return two

# a = one(2)
# b = one(3)
# c = one(4)
# print(a(10))
# print(b(10))
# print(c(10))

# # 036
# n = int(input("dan : "))
# for i in range(1, 10):
#     print(n*i, end=' ')
# print()

# # 037
# nominee = input("leader : ").strip().split()
# leader = ""
# cnt = 0
# for i in range(len(nominee)):   
#     if cnt < nominee.count(nominee[i]) :
#         leader = nominee[i]
#         cnt = nominee.count(nominee[i])

# print("{0}(이)가 총 {1}표로 반장이 되었습니다.".format(leader,cnt))

# # 038
# scores = input("scores : ").split()
# s_set = sorted(set(scores), reverse = True)
# cnt = 0
# for i in range(3):
#     cnt += scores.count(s_set[i])
# print(cnt)

# # 039
# data = input()
# print(data.replace("q","e"))

# 040
limit = int(input("limit : "))
n = int(input("how many : "))
total = 0
cnt = 0
for i in range(n):    
    if total <= limit:
        total += int(input("weight : "))
        cnt = i
print(cnt)