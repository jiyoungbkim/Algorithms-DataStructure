# # 061
# input_data = input("al.num : ")
# data_set = list(set(input_data))
# data_set.sort()
# data_count = [input_data.count(i) for i in data_set]
# for i in range(len(data_set)):
#     print(data_set[i], data_count[i], sep="", end="")
# print()

# user_input = input()
# s = ''
# storeString = user_input[0]
# count = 0
# for i in user_input:
#     if i == storeString:
#         count += 1
#     else:
#         s += storeString + str(count)
#         storeString = i
#         count = 1
# s += storeString + str(count)
# print(s)

# 063
data = input("abbreviation : ").split(' ')
for i in data:
    print(i[0],sep="",end="")
print()

# 064
n = int(input('N : '))
result = 0

while True:
    if n%7 == 0:
        result += n//7
        print(result)
        break
    n -= 3
    result += 1
    if n < 0:
        print(-1)
        break

# 065
a = [1,2,3,4]
b = ['a','b','c','d']

c = []
count = 0

for i, j in zip(a, b):
    if count % 2 == 0:
        c.append([i, j])
    else:
        c.append([j, i])
    count += 1
print(c)
