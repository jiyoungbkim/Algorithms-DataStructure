n, x = list(map(int, input('n, x : ').split()))
array = list(map(int, input('specific array : ').split()))

from bisect import *

def count_by_range(a, left_value, right_value):
    right_index = bisect_right(a, right_value)
    left_index = bisect_left(a, left_value)
    return right_index - left_index

count = count_by_range(array, x, x)
print(-1) if count == 0 else print(count)