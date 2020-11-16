# 삽입정렬
data = [5, 10, 66, 77, 54, 32, 11, 15]
sorted_list = []

def insert_index(sorted_list, insert_val):
    for i in range(len(sorted_list)):
        if insert_val < sorted_list[i]:
            return i
    return len(sorted_list)

while data:
    insert_val = data.pop(0)
    index = insert_index(sorted_list, insert_val)
    sorted_list.insert(index, insert_val)

print(sorted_list)