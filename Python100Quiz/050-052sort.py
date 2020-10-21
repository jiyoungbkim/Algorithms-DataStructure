# 050 
def bubble(n, data):
	for i in range(n-1):
		for j in range(n-i-1):
			if data[j] > data[j+1]:
				data[j], data[j+1] = data[j+1], data[j]
	for i in range(n):
		print(data[i], end = " ")

n = int(input())
data = list(map(int, input().split()))

bubble(n, data)

# 051
def merge(input_list):
    list_len = len(input_list)
    if list_len <= 1:
        return input_list
    mid = list_len // 2
    group_one = merge(input_list[:mid])
    group_two = merge(input_list[mid:])
    result = []

    while group_one and group_two:
        if group_one[0] < group_two[0]:
            result.append(group_one.pop(0))
        else:
            result.append(group_two.pop(0))
    while group_one:
        result.append(group_one.pop(0))
    while group_two:
        result.append(group_two.pop(0))
    return result
given_list = input().split(' ')
given_list = [int(i) for i in given_list]

print(merge(given_list))

# 052
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

given_list = input("quick : ").split(' ')
given_list = [int(i) for i in given_list]

print(quick(given_list))