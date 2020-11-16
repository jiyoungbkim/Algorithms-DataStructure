# 선택정렬
data = [5, 10, 66, 77, 54, 32, 11, 15]
sorted_list = []

while data:
    sorted_list.append(min(data))
    data.pop(data.index(min(data)))

print(sorted_list)
print(data)

# 최솟값
data = [5, 10, 66, 77, 1, 54, 32, 11, 15, 2]
def min_data(l):
    small = l[0]
    for i in l:
        if small > i:
            small = i
    return small

print(min_data(data))

# 최솟값의 인덱스
data = [95, 5, 10, 66, 77, 1, 54, 32, 11, 15, 2]
def min_index(l):
    index = 0
    compare = l[0]   
    for i in range(len(l)):
        if l[i] < compare:
            compare = l[i]
            index = i
    return index

print(min_index(data))