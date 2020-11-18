# 퀵정렬(O(nlogn)이지만 worst에는 O(n**2))
# 피봇

# pivot : 66
# [77, 54, 32, 10, 5, 11, 15] + [66] + [77]
# pivot : 54
# [32, 10, 5, 11, 15] + [54] + [66] + [77]
# pivot : 32
# [10, 5, 11, 15] +[32] + [54] + [66] + [77]
# pivot : 10
# [5] + [10] + [11, 15] +[32] + [54] + [66] + [77]
# pivot : 11
# [5] + [10] + [11] + [15] +[32] + [54] + [66] + [77]
data = [66, 77, 54, 32, 10, 5, 11, 15]

def quick(input_list):
    list_len = len(input_list)
    if list_len <= 1:
        return input_list
    pivot = input_list.pop(list_len//2)
    group_one = []
    group_two = []

    for i in range(list_len-1):
        if input_list[i] < pivot:
            group_one.append(input_list[i])
        else:
            group_two.append(input_list[i])
    return quick(group_one) + [pivot] + quick(group_two)

# given_list = input("quick : ").split(' ')
# given_list = [int(i) for i in given_list]

# print(quick(given_list))

print(quick(data))