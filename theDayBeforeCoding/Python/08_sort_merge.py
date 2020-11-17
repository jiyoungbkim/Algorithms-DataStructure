# 병합정렬(O(nlogn))
# 분할, 정복
data = [5, 10, 66, 77, 54, 32, 11, 15]
total_index = 7
mid = 7//2 #3
print(data[:mid+1])
print(data[mid+1:])

# 분할
# [5, 10, 66, 77, 54, 32, 11, 15]
# [5, 10, 66, 77],[54, 32, 11, 15]
# [5, 10], [66, 77],[54, 32], [11, 15]
# [5], [10], [66], [77], [54], [32], [11], [15]
# 정복
# [5, 10], [66, 77],[32, 54], [11, 15]
# [5, 10, 66, 77],[11, 15, 32, 54]
# [5, 10, 11, 15, 32, 54, 66, 77]

def merge(input_list):
    # 분할
    list_len = len(input_list)
    if list_len <= 1:
        return input_list
    mid = list_len // 2
    group_one = merge(input_list[:mid])
    group_two = merge(input_list[mid:])
    result = []

    # 정복
    while group_one and group_two:
        if group_one[0] < group_two[0]:
            result.append(group_one.pop(0))
        else:
            result.append(group_two.pop(0))
    # 그룹하나만 남은 경우
    while group_one:
        result.append(group_one.pop(0))

    while group_two:
        result.append(group_two.pop(0))
    return result
given_list = input().split(' ')
given_list = [int(i) for i in given_list]

print(merge(given_list))