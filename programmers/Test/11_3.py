def sol(a):
    answer = -1
    if len(a) <= 2:
        return 0
    else:
        max = a.count(a[0])
        x = a[0]
        for i in a:
            if max < a.count(i):
                max = a.count(i)
                x = a[i]
        remove_set = {x}
    
    list_com = [i for i in a if i not in remove_set]
    list_set = set(list_com)
    
    print(list_set)

    answer = len(list_set)*2
    return answer

# def sol(a):
#     answer = -1
#     list_set = set()
#     if len(a) <= 2:
#         return 0
#     else:
#         for i in range(len(a)):
#             for j in range(i+1, len(a)):
#                 list_set.update([(a[i], a[j])])

#     print(list_set)
#     answer = len(list_set)
#     return answer

print(sol([0,3,3,0,7,2,0,2,2,0]))